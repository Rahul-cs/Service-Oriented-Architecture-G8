
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
@WebService(name = "LoyalCustomerInfo", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoyalCustomerInfo {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LoyalCustomerInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "LoyalCustomerInfo", targetNamespace = "http://services/", className = "services.LoyalCustomerInfo_Type")
    @ResponseWrapper(localName = "LoyalCustomerInfoResponse", targetNamespace = "http://services/", className = "services.LoyalCustomerInfoResponse")
    @Action(input = "http://services/LoyalCustomerInfo/LoyalCustomerInfoRequest", output = "http://services/LoyalCustomerInfo/LoyalCustomerInfoResponse")
    public String loyalCustomerInfo();

}
