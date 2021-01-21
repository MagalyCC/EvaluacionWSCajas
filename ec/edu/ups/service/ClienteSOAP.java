package ec.edu.ups.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-01-20T20:14:06.203-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://Service.ups.edu.ec/", name = "ClienteSOAP")
@XmlSeeAlso({ObjectFactory.class})
public interface ClienteSOAP {

    @WebMethod
    @RequestWrapper(localName = "insertarCredito", targetNamespace = "http://Service.ups.edu.ec/", className = "ec.edu.ups.service.InsertarCredito")
    @ResponseWrapper(localName = "insertarCreditoResponse", targetNamespace = "http://Service.ups.edu.ec/", className = "ec.edu.ups.service.InsertarCreditoResponse")
    public void insertarCredito(
        @WebParam(name = "arg0", targetNamespace = "")
        ec.edu.ups.service.Credito arg0
    );
}
