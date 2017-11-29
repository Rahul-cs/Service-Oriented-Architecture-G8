
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
@WebService(name = "LocationFromToForOrder", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LocationFromToForOrder {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "LocationFromToForOrder")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "LocationFromToForOrder", targetNamespace = "http://services/", className = "services.LocationFromToForOrder_Type")
    @ResponseWrapper(localName = "LocationFromToForOrderResponse", targetNamespace = "http://services/", className = "services.LocationFromToForOrderResponse")
    @Action(input = "http://services/LocationFromToForOrder/LocationFromToForOrderRequest", output = "http://services/LocationFromToForOrder/LocationFromToForOrderResponse")
    public String locationFromToForOrder();

}
