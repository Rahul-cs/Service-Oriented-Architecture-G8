
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

    private final static QName _LocationFromToForOrder_QNAME = new QName("http://services/", "LocationFromToForOrder");
    private final static QName _LocationFromToForOrderResponse_QNAME = new QName("http://services/", "LocationFromToForOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LocationFromToForOrder_Type }
     * 
     */
    public LocationFromToForOrder_Type createLocationFromToForOrder_Type() {
        return new LocationFromToForOrder_Type();
    }

    /**
     * Create an instance of {@link LocationFromToForOrderResponse }
     * 
     */
    public LocationFromToForOrderResponse createLocationFromToForOrderResponse() {
        return new LocationFromToForOrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationFromToForOrder_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "LocationFromToForOrder")
    public JAXBElement<LocationFromToForOrder_Type> createLocationFromToForOrder(LocationFromToForOrder_Type value) {
        return new JAXBElement<LocationFromToForOrder_Type>(_LocationFromToForOrder_QNAME, LocationFromToForOrder_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationFromToForOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "LocationFromToForOrderResponse")
    public JAXBElement<LocationFromToForOrderResponse> createLocationFromToForOrderResponse(LocationFromToForOrderResponse value) {
        return new JAXBElement<LocationFromToForOrderResponse>(_LocationFromToForOrderResponse_QNAME, LocationFromToForOrderResponse.class, null, value);
    }

}
