
package ec.edu.ups.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertarCreditoResponse_QNAME = new QName("http://Service.ups.edu.ec/", "insertarCreditoResponse");
    private final static QName _InsertarCredito_QNAME = new QName("http://Service.ups.edu.ec/", "insertarCredito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarCredito }
     * 
     */
    public InsertarCredito createInsertarCredito() {
        return new InsertarCredito();
    }

    /**
     * Create an instance of {@link InsertarCreditoResponse }
     * 
     */
    public InsertarCreditoResponse createInsertarCreditoResponse() {
        return new InsertarCreditoResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Cuenta }
     * 
     */
    public Cuenta createCuenta() {
        return new Cuenta();
    }

    /**
     * Create an instance of {@link Credito }
     * 
     */
    public Credito createCredito() {
        return new Credito();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCreditoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ups.edu.ec/", name = "insertarCreditoResponse")
    public JAXBElement<InsertarCreditoResponse> createInsertarCreditoResponse(InsertarCreditoResponse value) {
        return new JAXBElement<InsertarCreditoResponse>(_InsertarCreditoResponse_QNAME, InsertarCreditoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCredito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.ups.edu.ec/", name = "insertarCredito")
    public JAXBElement<InsertarCredito> createInsertarCredito(InsertarCredito value) {
        return new JAXBElement<InsertarCredito>(_InsertarCredito_QNAME, InsertarCredito.class, null, value);
    }

}
