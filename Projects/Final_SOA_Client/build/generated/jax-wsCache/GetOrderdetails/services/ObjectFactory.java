
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

    private final static QName _GetOrderdetails_QNAME = new QName("http://services/", "GetOrderdetails");
    private final static QName _GetOrderdetailsResponse_QNAME = new QName("http://services/", "GetOrderdetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderdetails_Type }
     * 
     */
    public GetOrderdetails_Type createGetOrderdetails_Type() {
        return new GetOrderdetails_Type();
    }

    /**
     * Create an instance of {@link GetOrderdetailsResponse }
     * 
     */
    public GetOrderdetailsResponse createGetOrderdetailsResponse() {
        return new GetOrderdetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderdetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "GetOrderdetails")
    public JAXBElement<GetOrderdetails_Type> createGetOrderdetails(GetOrderdetails_Type value) {
        return new JAXBElement<GetOrderdetails_Type>(_GetOrderdetails_QNAME, GetOrderdetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderdetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "GetOrderdetailsResponse")
    public JAXBElement<GetOrderdetailsResponse> createGetOrderdetailsResponse(GetOrderdetailsResponse value) {
        return new JAXBElement<GetOrderdetailsResponse>(_GetOrderdetailsResponse_QNAME, GetOrderdetailsResponse.class, null, value);
    }

}
