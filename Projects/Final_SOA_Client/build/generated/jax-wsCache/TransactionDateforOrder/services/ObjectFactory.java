
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

    private final static QName _TransactionDateforOrder_QNAME = new QName("http://services/", "TransactionDateforOrder");
    private final static QName _TransactionDateforOrderResponse_QNAME = new QName("http://services/", "TransactionDateforOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransactionDateforOrder_Type }
     * 
     */
    public TransactionDateforOrder_Type createTransactionDateforOrder_Type() {
        return new TransactionDateforOrder_Type();
    }

    /**
     * Create an instance of {@link TransactionDateforOrderResponse }
     * 
     */
    public TransactionDateforOrderResponse createTransactionDateforOrderResponse() {
        return new TransactionDateforOrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionDateforOrder_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TransactionDateforOrder")
    public JAXBElement<TransactionDateforOrder_Type> createTransactionDateforOrder(TransactionDateforOrder_Type value) {
        return new JAXBElement<TransactionDateforOrder_Type>(_TransactionDateforOrder_QNAME, TransactionDateforOrder_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionDateforOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "TransactionDateforOrderResponse")
    public JAXBElement<TransactionDateforOrderResponse> createTransactionDateforOrderResponse(TransactionDateforOrderResponse value) {
        return new JAXBElement<TransactionDateforOrderResponse>(_TransactionDateforOrderResponse_QNAME, TransactionDateforOrderResponse.class, null, value);
    }

}
