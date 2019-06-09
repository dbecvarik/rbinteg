
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookInfoResponse_QNAME = new QName("tns", "bookInfoResponse");
    private final static QName _StringArray_QNAME = new QName("tns", "stringArray");
    private final static QName _GetBookInfo_QNAME = new QName("tns", "getBookInfo");
    private final static QName _GetBooks_QNAME = new QName("tns", "getBooks");
    private final static QName _GetBookInfoResponse_QNAME = new QName("tns", "getBookInfoResponse");
    private final static QName _GetBooksResponse_QNAME = new QName("tns", "getBooksResponse");
    private final static QName _GetBooksResponseGetBooksResult_QNAME = new QName("tns", "getBooksResult");
    private final static QName _GetBookInfoResponseGetBookInfoResult_QNAME = new QName("tns", "getBookInfoResult");
    private final static QName _GetBooksFilter_QNAME = new QName("tns", "filter");
    private final static QName _GetBookInfoName_QNAME = new QName("tns", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookInfoResponse }
     * 
     */
    public BookInfoResponse createBookInfoResponse() {
        return new BookInfoResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link GetBookInfo }
     * 
     */
    public GetBookInfo createGetBookInfo() {
        return new GetBookInfo();
    }

    /**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link GetBookInfoResponse }
     * 
     */
    public GetBookInfoResponse createGetBookInfoResponse() {
        return new GetBookInfoResponse();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "bookInfoResponse")
    public JAXBElement<BookInfoResponse> createBookInfoResponse(BookInfoResponse value) {
        return new JAXBElement<BookInfoResponse>(_BookInfoResponse_QNAME, BookInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "getBookInfo")
    public JAXBElement<GetBookInfo> createGetBookInfo(GetBookInfo value) {
        return new JAXBElement<GetBookInfo>(_GetBookInfo_QNAME, GetBookInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "getBooks")
    public JAXBElement<GetBooks> createGetBooks(GetBooks value) {
        return new JAXBElement<GetBooks>(_GetBooks_QNAME, GetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "getBookInfoResponse")
    public JAXBElement<GetBookInfoResponse> createGetBookInfoResponse(GetBookInfoResponse value) {
        return new JAXBElement<GetBookInfoResponse>(_GetBookInfoResponse_QNAME, GetBookInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "getBooksResponse")
    public JAXBElement<GetBooksResponse> createGetBooksResponse(GetBooksResponse value) {
        return new JAXBElement<GetBooksResponse>(_GetBooksResponse_QNAME, GetBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "getBooksResult", scope = GetBooksResponse.class)
    public JAXBElement<StringArray> createGetBooksResponseGetBooksResult(StringArray value) {
        return new JAXBElement<StringArray>(_GetBooksResponseGetBooksResult_QNAME, StringArray.class, GetBooksResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "getBookInfoResult", scope = GetBookInfoResponse.class)
    public JAXBElement<BookInfoResponse> createGetBookInfoResponseGetBookInfoResult(BookInfoResponse value) {
        return new JAXBElement<BookInfoResponse>(_GetBookInfoResponseGetBookInfoResult_QNAME, BookInfoResponse.class, GetBookInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "filter", scope = GetBooks.class)
    public JAXBElement<String> createGetBooksFilter(String value) {
        return new JAXBElement<String>(_GetBooksFilter_QNAME, String.class, GetBooks.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "name", scope = GetBookInfo.class)
    public JAXBElement<String> createGetBookInfoName(String value) {
        return new JAXBElement<String>(_GetBookInfoName_QNAME, String.class, GetBookInfo.class, value);
    }

}
