
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

    private final static QName _GetDriverDetails_QNAME = new QName("http://services/", "GetDriverDetails");
    private final static QName _GetDriverDetailsResponse_QNAME = new QName("http://services/", "GetDriverDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDriverDetails_Type }
     * 
     */
    public GetDriverDetails_Type createGetDriverDetails_Type() {
        return new GetDriverDetails_Type();
    }

    /**
     * Create an instance of {@link GetDriverDetailsResponse }
     * 
     */
    public GetDriverDetailsResponse createGetDriverDetailsResponse() {
        return new GetDriverDetailsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverDetails_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "GetDriverDetails")
    public JAXBElement<GetDriverDetails_Type> createGetDriverDetails(GetDriverDetails_Type value) {
        return new JAXBElement<GetDriverDetails_Type>(_GetDriverDetails_QNAME, GetDriverDetails_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "GetDriverDetailsResponse")
    public JAXBElement<GetDriverDetailsResponse> createGetDriverDetailsResponse(GetDriverDetailsResponse value) {
        return new JAXBElement<GetDriverDetailsResponse>(_GetDriverDetailsResponse_QNAME, GetDriverDetailsResponse.class, null, value);
    }

}
