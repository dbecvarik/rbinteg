from suds.client import Client as SudsClient

url = 'http://127.0.0.1:5000/soap/books?wsdl'
client = SudsClient(url=url, cache=None)
r = client.service.GetBookInfo(name='Brave new world')
print r

