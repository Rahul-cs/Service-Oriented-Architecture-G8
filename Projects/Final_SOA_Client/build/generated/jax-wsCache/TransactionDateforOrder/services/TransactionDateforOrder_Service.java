
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransactionDateforOrder", targetNamespace = "http://services/", wsdlLocation = "http://104.194.124.253:8080/TruckingCompany/TransactionDateforOrder?wsdl")
public class TransactionDateforOrder_Service
    extends Service
{

    private final static URL TRANSACTIONDATEFORORDER_WSDL_LOCATION;
    private final static WebServiceException TRANSACTIONDATEFORORDER_EXCEPTION;
    private final static QName TRANSACTIONDATEFORORDER_QNAME = new QName("http://services/", "TransactionDateforOrder");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://104.194.124.253:8080/TruckingCompany/TransactionDateforOrder?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSACTIONDATEFORORDER_WSDL_LOCATION = url;
        TRANSACTIONDATEFORORDER_EXCEPTION = e;
    }

    public TransactionDateforOrder_Service() {
        super(__getWsdlLocation(), TRANSACTIONDATEFORORDER_QNAME);
    }

    public TransactionDateforOrder_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSACTIONDATEFORORDER_QNAME, features);
    }

    public TransactionDateforOrder_Service(URL wsdlLocation) {
        super(wsdlLocation, TRANSACTIONDATEFORORDER_QNAME);
    }

    public TransactionDateforOrder_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSACTIONDATEFORORDER_QNAME, features);
    }

    public TransactionDateforOrder_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransactionDateforOrder_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransactionDateforOrder
     */
    @WebEndpoint(name = "TransactionDateforOrderPort")
    public TransactionDateforOrder getTransactionDateforOrderPort() {
        return super.getPort(new QName("http://services/", "TransactionDateforOrderPort"), TransactionDateforOrder.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransactionDateforOrder
     */
    @WebEndpoint(name = "TransactionDateforOrderPort")
    public TransactionDateforOrder getTransactionDateforOrderPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "TransactionDateforOrderPort"), TransactionDateforOrder.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSACTIONDATEFORORDER_EXCEPTION!= null) {
            throw TRANSACTIONDATEFORORDER_EXCEPTION;
        }
        return TRANSACTIONDATEFORORDER_WSDL_LOCATION;
    }

}
