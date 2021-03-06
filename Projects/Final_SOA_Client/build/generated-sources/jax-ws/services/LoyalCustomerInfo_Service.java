
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
@WebServiceClient(name = "LoyalCustomerInfo", targetNamespace = "http://services/", wsdlLocation = "http://104.194.124.253:8080/TruckingCompany/LoyalCustomerInfo?wsdl")
public class LoyalCustomerInfo_Service
    extends Service
{

    private final static URL LOYALCUSTOMERINFO_WSDL_LOCATION;
    private final static WebServiceException LOYALCUSTOMERINFO_EXCEPTION;
    private final static QName LOYALCUSTOMERINFO_QNAME = new QName("http://services/", "LoyalCustomerInfo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://104.194.124.253:8080/TruckingCompany/LoyalCustomerInfo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOYALCUSTOMERINFO_WSDL_LOCATION = url;
        LOYALCUSTOMERINFO_EXCEPTION = e;
    }

    public LoyalCustomerInfo_Service() {
        super(__getWsdlLocation(), LOYALCUSTOMERINFO_QNAME);
    }

    public LoyalCustomerInfo_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOYALCUSTOMERINFO_QNAME, features);
    }

    public LoyalCustomerInfo_Service(URL wsdlLocation) {
        super(wsdlLocation, LOYALCUSTOMERINFO_QNAME);
    }

    public LoyalCustomerInfo_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOYALCUSTOMERINFO_QNAME, features);
    }

    public LoyalCustomerInfo_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoyalCustomerInfo_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoyalCustomerInfo
     */
    @WebEndpoint(name = "LoyalCustomerInfoPort")
    public LoyalCustomerInfo getLoyalCustomerInfoPort() {
        return super.getPort(new QName("http://services/", "LoyalCustomerInfoPort"), LoyalCustomerInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoyalCustomerInfo
     */
    @WebEndpoint(name = "LoyalCustomerInfoPort")
    public LoyalCustomerInfo getLoyalCustomerInfoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "LoyalCustomerInfoPort"), LoyalCustomerInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOYALCUSTOMERINFO_EXCEPTION!= null) {
            throw LOYALCUSTOMERINFO_EXCEPTION;
        }
        return LOYALCUSTOMERINFO_WSDL_LOCATION;
    }

}
