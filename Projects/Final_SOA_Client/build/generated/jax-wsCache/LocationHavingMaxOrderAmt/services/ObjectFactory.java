
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

    private final static QName _LocationHavingMaxOrderAmt_QNAME = new QName("http://services/", "LocationHavingMaxOrderAmt");
    private final static QName _LocationHavingMaxOrderAmtResponse_QNAME = new QName("http://services/", "LocationHavingMaxOrderAmtResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LocationHavingMaxOrderAmt_Type }
     * 
     */
    public LocationHavingMaxOrderAmt_Type createLocationHavingMaxOrderAmt_Type() {
        return new LocationHavingMaxOrderAmt_Type();
    }

    /**
     * Create an instance of {@link LocationHavingMaxOrderAmtResponse }
     * 
     */
    public LocationHavingMaxOrderAmtResponse createLocationHavingMaxOrderAmtResponse() {
        return new LocationHavingMaxOrderAmtResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationHavingMaxOrderAmt_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "LocationHavingMaxOrderAmt")
    public JAXBElement<LocationHavingMaxOrderAmt_Type> createLocationHavingMaxOrderAmt(LocationHavingMaxOrderAmt_Type value) {
        return new JAXBElement<LocationHavingMaxOrderAmt_Type>(_LocationHavingMaxOrderAmt_QNAME, LocationHavingMaxOrderAmt_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationHavingMaxOrderAmtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "LocationHavingMaxOrderAmtResponse")
    public JAXBElement<LocationHavingMaxOrderAmtResponse> createLocationHavingMaxOrderAmtResponse(LocationHavingMaxOrderAmtResponse value) {
        return new JAXBElement<LocationHavingMaxOrderAmtResponse>(_LocationHavingMaxOrderAmtResponse_QNAME, LocationHavingMaxOrderAmtResponse.class, null, value);
    }

}
