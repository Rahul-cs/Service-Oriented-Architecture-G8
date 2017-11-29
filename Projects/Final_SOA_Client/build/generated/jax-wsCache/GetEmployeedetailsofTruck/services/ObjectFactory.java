
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

    private final static QName _GetEmployeedetailsofTruck_QNAME = new QName("http://services/", "GetEmployeedetailsofTruck");
    private final static QName _GetEmployeedetailsofTruckResponse_QNAME = new QName("http://services/", "GetEmployeedetailsofTruckResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeedetailsofTruck_Type }
     * 
     */
    public GetEmployeedetailsofTruck_Type createGetEmployeedetailsofTruck_Type() {
        return new GetEmployeedetailsofTruck_Type();
    }

    /**
     * Create an instance of {@link GetEmployeedetailsofTruckResponse }
     * 
     */
    public GetEmployeedetailsofTruckResponse createGetEmployeedetailsofTruckResponse() {
        return new GetEmployeedetailsofTruckResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeedetailsofTruck_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "GetEmployeedetailsofTruck")
    public JAXBElement<GetEmployeedetailsofTruck_Type> createGetEmployeedetailsofTruck(GetEmployeedetailsofTruck_Type value) {
        return new JAXBElement<GetEmployeedetailsofTruck_Type>(_GetEmployeedetailsofTruck_QNAME, GetEmployeedetailsofTruck_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeedetailsofTruckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "GetEmployeedetailsofTruckResponse")
    public JAXBElement<GetEmployeedetailsofTruckResponse> createGetEmployeedetailsofTruckResponse(GetEmployeedetailsofTruckResponse value) {
        return new JAXBElement<GetEmployeedetailsofTruckResponse>(_GetEmployeedetailsofTruckResponse_QNAME, GetEmployeedetailsofTruckResponse.class, null, value);
    }

}
