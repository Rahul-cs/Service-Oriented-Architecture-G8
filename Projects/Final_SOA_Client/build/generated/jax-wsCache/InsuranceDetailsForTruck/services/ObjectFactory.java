
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

    private final static QName _InsuranceDetailsForTruck_QNAME = new QName("http://services/", "InsuranceDetailsForTruck");
    private final static QName _InsuranceDetailsForTruckResponse_QNAME = new QName("http://services/", "InsuranceDetailsForTruckResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsuranceDetailsForTruck_Type }
     * 
     */
    public InsuranceDetailsForTruck_Type createInsuranceDetailsForTruck_Type() {
        return new InsuranceDetailsForTruck_Type();
    }

    /**
     * Create an instance of {@link InsuranceDetailsForTruckResponse }
     * 
     */
    public InsuranceDetailsForTruckResponse createInsuranceDetailsForTruckResponse() {
        return new InsuranceDetailsForTruckResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceDetailsForTruck_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsuranceDetailsForTruck")
    public JAXBElement<InsuranceDetailsForTruck_Type> createInsuranceDetailsForTruck(InsuranceDetailsForTruck_Type value) {
        return new JAXBElement<InsuranceDetailsForTruck_Type>(_InsuranceDetailsForTruck_QNAME, InsuranceDetailsForTruck_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceDetailsForTruckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "InsuranceDetailsForTruckResponse")
    public JAXBElement<InsuranceDetailsForTruckResponse> createInsuranceDetailsForTruckResponse(InsuranceDetailsForTruckResponse value) {
        return new JAXBElement<InsuranceDetailsForTruckResponse>(_InsuranceDetailsForTruckResponse_QNAME, InsuranceDetailsForTruckResponse.class, null, value);
    }

}
