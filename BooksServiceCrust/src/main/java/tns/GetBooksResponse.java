
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBooksResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBooksResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getBooksResult" type="{tns}stringArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBooksResponse", propOrder = {
    "getBooksResult"
})
public class GetBooksResponse {

    @XmlElementRef(name = "getBooksResult", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> getBooksResult;

    /**
     * Gets the value of the getBooksResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getGetBooksResult() {
        return getBooksResult;
    }

    /**
     * Sets the value of the getBooksResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setGetBooksResult(JAXBElement<StringArray> value) {
        this.getBooksResult = value;
    }

}
