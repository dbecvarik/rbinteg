import signal
import os

from flask import Flask
from flask_spyne import Spyne
from spyne.protocol.soap import Soap11
from spyne.model.primitive import Unicode, Integer
from spyne.model.complex import Iterable, ComplexModel

import time

BOOKS = [{'name': "1984",
          'stock': 11,
          'price': 34,
          },
         {'name': "Brave new world",
          'stock': 24,
          'price': 35,
          }]

app = Flask(__name__)
spyne = Spyne(app)

class bookInfoResponse(ComplexModel):
    __namespace__ = 'tns'
    name = Unicode(min_occurs=0, max_occurs=1, nillable=False)
    price = Integer(min_occurs=1, max_occurs=1, nillable=False)
    stock = Integer(min_occurs=1, max_occurs=1, nillable=False)

class BookService(spyne.Service):
    __service_url_path__ = '/soap/books'
    __in_protocol__ = Soap11(validator='lxml')
    __out_protocol__ = Soap11()

    @spyne.srpc(Unicode, _returns=bookInfoResponse)
    def getBookInfo(name):
        for book in BOOKS:
            time.sleep(1)
            if book['name'] == name:
                return bookInfoResponse(name=book['name'],
                        price=book['price'],
                        stock=book['stock'])

        

    @spyne.srpc(Unicode, _returns=Iterable(Unicode))
    def getBooks(filter):
        for book in BOOKS:
            yield book['name']



@app.route('/')
def list_books():
    resp = "Books<br>"
    for book in BOOKS:
        resp += book['name'] + "," + \
            str(book['price']) + "," + \
            str(book['stock']) + "<br>"
    return resp


@app.route('/cfg')
def cfg():
    if os.environ.get('CFG'):
        return "Cfg: " + os.environ.get('CFG')
    if not os.path.exists('/tmp/cfg'):
        return "No cfg found"

    with open('/tmp/cfg', 'r') as f:
        lines = f.readlines()
        return "Cfg: " + '<br>'.join(lines)


def handler(signum, frame):
    print('Signal handler called with signal', signum)
    app.shutdown()

signal.signal(signal.SIGTERM, handler)

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080)



