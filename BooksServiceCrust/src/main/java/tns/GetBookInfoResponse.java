
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBookInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBookInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getBookInfoResult" type="{tns}bookInfoResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBookInfoResponse", propOrder = {
    "getBookInfoResult"
})
public class GetBookInfoResponse {

    @XmlElementRef(name = "getBookInfoResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<BookInfoResponse> getBookInfoResult;

    /**
     * Gets the value of the getBookInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BookInfoResponse }{@code >}
     *     
     */
    public JAXBElement<BookInfoResponse> getGetBookInfoResult() {
        return getBookInfoResult;
    }

    /**
     * Sets the value of the getBookInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BookInfoResponse }{@code >}
     *     
     */
    public void setGetBookInfoResult(JAXBElement<BookInfoResponse> value) {
        this.getBookInfoResult = value;
    }

}
