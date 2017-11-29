
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
@WebServiceClient(name = "GetDriverDetails", targetNamespace = "http://services/", wsdlLocation = "http://104.194.124.253:8080/TruckingCompany/GetDriverDetails?wsdl")
public class GetDriverDetails_Service
    extends Service
{

    private final static URL GETDRIVERDETAILS_WSDL_LOCATION;
    private final static WebServiceException GETDRIVERDETAILS_EXCEPTION;
    private final static QName GETDRIVERDETAILS_QNAME = new QName("http://services/", "GetDriverDetails");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://104.194.124.253:8080/TruckingCompany/GetDriverDetails?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETDRIVERDETAILS_WSDL_LOCATION = url;
        GETDRIVERDETAILS_EXCEPTION = e;
    }

    public GetDriverDetails_Service() {
        super(__getWsdlLocation(), GETDRIVERDETAILS_QNAME);
    }

    public GetDriverDetails_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETDRIVERDETAILS_QNAME, features);
    }

    public GetDriverDetails_Service(URL wsdlLocation) {
        super(wsdlLocation, GETDRIVERDETAILS_QNAME);
    }

    public GetDriverDetails_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETDRIVERDETAILS_QNAME, features);
    }

    public GetDriverDetails_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetDriverDetails_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetDriverDetails
     */
    @WebEndpoint(name = "GetDriverDetailsPort")
    public GetDriverDetails getGetDriverDetailsPort() {
        return super.getPort(new QName("http://services/", "GetDriverDetailsPort"), GetDriverDetails.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetDriverDetails
     */
    @WebEndpoint(name = "GetDriverDetailsPort")
    public GetDriverDetails getGetDriverDetailsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "GetDriverDetailsPort"), GetDriverDetails.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETDRIVERDETAILS_EXCEPTION!= null) {
            throw GETDRIVERDETAILS_EXCEPTION;
        }
        return GETDRIVERDETAILS_WSDL_LOCATION;
    }

}
