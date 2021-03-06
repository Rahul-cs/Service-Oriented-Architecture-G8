
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
@WebServiceClient(name = "LocationHavingMaxOrderAmt", targetNamespace = "http://services/", wsdlLocation = "http://104.194.124.253:8080/TruckingCompany/LocationHavingMaxOrderAmt?wsdl")
public class LocationHavingMaxOrderAmt_Service
    extends Service
{

    private final static URL LOCATIONHAVINGMAXORDERAMT_WSDL_LOCATION;
    private final static WebServiceException LOCATIONHAVINGMAXORDERAMT_EXCEPTION;
    private final static QName LOCATIONHAVINGMAXORDERAMT_QNAME = new QName("http://services/", "LocationHavingMaxOrderAmt");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://104.194.124.253:8080/TruckingCompany/LocationHavingMaxOrderAmt?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOCATIONHAVINGMAXORDERAMT_WSDL_LOCATION = url;
        LOCATIONHAVINGMAXORDERAMT_EXCEPTION = e;
    }

    public LocationHavingMaxOrderAmt_Service() {
        super(__getWsdlLocation(), LOCATIONHAVINGMAXORDERAMT_QNAME);
    }

    public LocationHavingMaxOrderAmt_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOCATIONHAVINGMAXORDERAMT_QNAME, features);
    }

    public LocationHavingMaxOrderAmt_Service(URL wsdlLocation) {
        super(wsdlLocation, LOCATIONHAVINGMAXORDERAMT_QNAME);
    }

    public LocationHavingMaxOrderAmt_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOCATIONHAVINGMAXORDERAMT_QNAME, features);
    }

    public LocationHavingMaxOrderAmt_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocationHavingMaxOrderAmt_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LocationHavingMaxOrderAmt
     */
    @WebEndpoint(name = "LocationHavingMaxOrderAmtPort")
    public LocationHavingMaxOrderAmt getLocationHavingMaxOrderAmtPort() {
        return super.getPort(new QName("http://services/", "LocationHavingMaxOrderAmtPort"), LocationHavingMaxOrderAmt.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocationHavingMaxOrderAmt
     */
    @WebEndpoint(name = "LocationHavingMaxOrderAmtPort")
    public LocationHavingMaxOrderAmt getLocationHavingMaxOrderAmtPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "LocationHavingMaxOrderAmtPort"), LocationHavingMaxOrderAmt.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOCATIONHAVINGMAXORDERAMT_EXCEPTION!= null) {
            throw LOCATIONHAVINGMAXORDERAMT_EXCEPTION;
        }
        return LOCATIONHAVINGMAXORDERAMT_WSDL_LOCATION;
    }

}
