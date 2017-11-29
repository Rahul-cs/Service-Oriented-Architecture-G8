
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

    private final static QName _TotalOrdersAndExpense_QNAME = new QName("http://services/", "TotalOrdersAndExpense");
    private final static QName _TotalOrdersAndExpenseResponse_QNAME = new QName("http://services/", "TotalOrdersAndExpenseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TotalOrdersAndExpense_Type }
     * 
     */
    public TotalOrdersAndExpense_Type createTotalOrdersAndExpense_Type() {
        return new TotalOrdersAndExpense_Type();
    }

    /**
     * Create an instance of {@link TotalOrdersAndExpenseResponse }
     * 
     */
    public TotalOrdersAndExpenseResponse createTotalOrdersAndExpenseResponse() {
        return new TotalOrdersAndExpenseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalOrdersAndExpense_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalOrdersAndExpense")
    public JAXBElement<TotalOrdersAndExpense_Type> createTotalOrdersAndExpense(TotalOrdersAndExpense_Type value) {
        return new JAXBElement<TotalOrdersAndExpense_Type>(_TotalOrdersAndExpense_QNAME, TotalOrdersAndExpense_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalOrdersAndExpenseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TotalOrdersAndExpenseResponse")
    public JAXBElement<TotalOrdersAndExpenseResponse> createTotalOrdersAndExpenseResponse(TotalOrdersAndExpenseResponse value) {
        return new JAXBElement<TotalOrdersAndExpenseResponse>(_TotalOrdersAndExpenseResponse_QNAME, TotalOrdersAndExpenseResponse.class, null, value);
    }

}
