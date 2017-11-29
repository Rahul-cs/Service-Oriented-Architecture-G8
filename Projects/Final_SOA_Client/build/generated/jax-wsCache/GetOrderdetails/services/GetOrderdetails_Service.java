
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
@WebServiceClient(name = "GetOrderdetails", targetNamespace = "http://services/", wsdlLocation = "http://104.194.124.253:8080/TruckingCompany/GetOrderdetails?wsdl")
public class GetOrderdetails_Service
    extends Service
{

    private final static URL GETORDERDETAILS_WSDL_LOCATION;
    private final static WebServiceException GETORDERDETAILS_EXCEPTION;
    private final static QName GETORDERDETAILS_QNAME = new QName("http://services/", "GetOrderdetails");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://104.194.124.253:8080/TruckingCompany/GetOrderdetails?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETORDERDETAILS_WSDL_LOCATION = url;
        GETORDERDETAILS_EXCEPTION = e;
    }

    public GetOrderdetails_Service() {
        super(__getWsdlLocation(), GETORDERDETAILS_QNAME);
    }

    public GetOrderdetails_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETORDERDETAILS_QNAME, features);
    }

    public GetOrderdetails_Service(URL wsdlLocation) {
        super(wsdlLocation, GETORDERDETAILS_QNAME);
    }

    public GetOrderdetails_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETORDERDETAILS_QNAME, features);
    }

    public GetOrderdetails_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetOrderdetails_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetOrderdetails
     */
    @WebEndpoint(name = "GetOrderdetailsPort")
    public GetOrderdetails getGetOrderdetailsPort() {
        return super.getPort(new QName("http://services/", "GetOrderdetailsPort"), GetOrderdetails.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetOrderdetails
     */
    @WebEndpoint(name = "GetOrderdetailsPort")
    public GetOrderdetails getGetOrderdetailsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "GetOrderdetailsPort"), GetOrderdetails.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETORDERDETAILS_EXCEPTION!= null) {
            throw GETORDERDETAILS_EXCEPTION;
        }
        return GETORDERDETAILS_WSDL_LOCATION;
    }

}