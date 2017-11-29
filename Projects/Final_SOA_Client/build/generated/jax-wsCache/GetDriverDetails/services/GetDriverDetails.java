
package services;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetDriverDetails", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetDriverDetails {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDriverDetails")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetDriverDetails", targetNamespace = "http://services/", className = "services.GetDriverDetails_Type")
    @ResponseWrapper(localName = "GetDriverDetailsResponse", targetNamespace = "http://services/", className = "services.GetDriverDetailsResponse")
    @Action(input = "http://services/GetDriverDetails/GetDriverDetailsRequest", output = "http://services/GetDriverDetails/GetDriverDetailsResponse")
    public String getDriverDetails();

}