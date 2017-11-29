
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _LoyalCustomerInfo_QNAME = new QName("http://services/", "LoyalCustomerInfo");
    private final static QName _LoyalCustomerInfoResponse_QNAME = new QName("http://services/", "LoyalCustomerInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoyalCustomerInfo_Type }
     * 
     */
    public LoyalCustomerInfo_Type createLoyalCustomerInfo_Type() {
        return new LoyalCustomerInfo_Type();
    }

    /**
     * Create an instance of {@link LoyalCustomerInfoResponse }
     * 
     */
    public LoyalCustomerInfoResponse createLoyalCustomerInfoResponse() {
        return new LoyalCustomerInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyalCustomerInfo_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "LoyalCustomerInfo")
    public JAXBElement<LoyalCustomerInfo_Type> createLoyalCustomerInfo(LoyalCustomerInfo_Type value) {
        return new JAXBElement<LoyalCustomerInfo_Type>(_LoyalCustomerInfo_QNAME, LoyalCustomerInfo_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoyalCustomerInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "LoyalCustomerInfoResponse")
    public JAXBElement<LoyalCustomerInfoResponse> createLoyalCustomerInfoResponse(LoyalCustomerInfoResponse value) {
        return new JAXBElement<LoyalCustomerInfoResponse>(_LoyalCustomerInfoResponse_QNAME, LoyalCustomerInfoResponse.class, null, value);
    }

}
