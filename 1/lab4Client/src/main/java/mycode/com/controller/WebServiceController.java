
package mycode.com.controller;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceController", targetNamespace = "http://controller.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceController {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    //若客户端代码是copy过来的，可能需要更改参数！！！！
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calculateTax", targetNamespace = "http://controller.com", className = "mycode.com.controller.CalculateTax")
    @ResponseWrapper(localName = "calculateTaxResponse", targetNamespace = "http://controller.com", className = "mycode.com.controller.CalculateTaxResponse")
    public double calculateTax(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}