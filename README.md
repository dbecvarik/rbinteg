# Prepraring your environment

First fork and clone this repositroy, then login to shared OpenShift instance and create project

``` shell
oc login ...
oc new-project $project
```

## Bookshop application

In this workshop we will go through a our custom bookshop application. Its and old legacy application which has
very slow SOAP interface and it serving its purposes for a long time. It caries a big technical dept and time
to market of any new feature is huge.

As part of our containerization adoption we decide to replatform this application to containers so we can run it
on modern and more powerfull infrastracture and slowly modernize it. Druing the containerization we will aproach 
multiple issues and we will solve them.

We don't want to write or maintain any Dockerfile as it is unneeded burden so we will use S2I to produce our images.

``` shell
oc new-app --image-stream=openshift/python:2.7 https://github.com/dbecvarik/workshop-OCP-workload --name legacyapp
oc expose svc/legacyapp
```

Tasks:

- Access the legacyapp via openshift route
- update url in legacy/resp.py and prove that bookshop application is working properly

## Aplication modernization

Our aproach is based on developing microservices shell to your exsiting legacy application first. This aproach will
enable us to model and try new microservices architecture and we can quickly decide if we need to tweak it a little
or completely change. With this experence we will be able to add new features via new microservices and modernize
our legacy backend application by removing part of its features from it and replacing services shells with proper
microservices implementation. We will achieve this by using Red Hat Fuse, our agile ESB solution for next decade.


## Fuse to the rescue
To build a microservice crust to our legacy application we will deploy Red Hat Fuse. Side of of this crust is
also that we were able to easily convert "big bloated" web service to a RESTfull microservices, that we can scale and manage much easily in future.

but first we need to correct all our uris in the camel context  `BooksServiceCrust/src/main/resources/spring/rest-springboot-context.xml`.

Tip: its much easier for beginners to use full IDE like CodeReady Studio with graphical editor.

then we can deploy our route via:

``` shell
oc apply -f ansible/crust/templates/bc.yaml
oc apply -f ansible/crust/templates/dc.yaml
````

Access this app via its route and hit "/books/list" and "/books/info/1984" endpoints. You should get same
resposnes as you get with resp.py program from soap interface.

## Next steps

### Caches

As you see we were able to convert are slow SOAP service to rest ones via Red Hat Fuse. We can make them more 
performant by using caches inside Red Hat Fuse. We will not go through this as this is not primary focus
of this workshop.

### New features

Now if we want to extend our application funcionality we can just add new microservices to our service
mesh. WE can now expand our infrastructure possibilites with Istio, 3scale and other awesome products
and really enjoy agile culture.

## Fuse Console

We will deploy our fuse console:

First we will need certs for jolokia agent:

``` bash
 oc get secrets/signing-key -n openshift-service-ca -o "jsonpath={.data['tls\.crt']}" | base64 --decode > ca.crt
 oc get secrets/signing-key -n openshift-service-ca -o "jsonpath={.data['tls\.key']}" | base64 --decode > ca.key
 openssl genrsa -out server.key 2048
 cat <<EOT >> csr.conf
  [ req ]
  default_bits = 2048
  prompt = no
  default_md = sha256
  distinguished_name = dn

  [ dn ]
  CN = fuse-console.fuse.svc

  [ v3_ext ]
  authorityKeyIdentifier=keyid,issuer:always
  keyUsage=keyEncipherment,dataEncipherment
  extendedKeyUsage=serverAuth,clientAuth
EOT
openssl req -new -key server.key -out server.csr -config csr.conf
openssl x509 -req -in server.csr -CA ca.crt -CAkey ca.key -CAcreateserial -out server.crt -days 10000 -extensions v3_ext -extfile csr.conf
oc create secret tls fuse75-console-tls-proxying --cert server.crt --key server.key
````

then we can deloy the console:

``` bash
# create streams
oc create -f https://raw.githubusercontent.com/jboss-fuse/application-templates/master/fis-image-streams.json
# create template
oc create -f https://raw.githubusercontent.com/jboss-fuse/application-templates/master/fis-console-namespace-template.json
# deploy console
oc new-app --template=fuse75-console -p APP_VERSION=1.2
```

And wait for deployment with `oc get pods -w`.

## Fuse Console


``` bash
oc create -f https://raw.githubusercontent.com/jboss-fuse/application-templates/master/fuse-apicurito.yml
oc new-app --template apicurito -p ROUTE_HOSTNAME=test -p APP_VERSION=1.2
 ```