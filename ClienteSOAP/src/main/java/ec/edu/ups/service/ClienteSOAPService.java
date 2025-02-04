package ec.edu.ups.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2021-01-20T20:14:06.210-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "ClienteSOAPService", 
                  wsdlLocation = "file:/C:/Users/lilia/AppData/Local/Temp/tempdir132718070093322723.tmp/ClienteSOAP_1.wsdl",
                  targetNamespace = "http://Service.ups.edu.ec/") 
public class ClienteSOAPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://Service.ups.edu.ec/", "ClienteSOAPService");
    public final static QName ClienteSOAPPort = new QName("http://Service.ups.edu.ec/", "ClienteSOAPPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/lilia/AppData/Local/Temp/tempdir132718070093322723.tmp/ClienteSOAP_1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ClienteSOAPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/lilia/AppData/Local/Temp/tempdir132718070093322723.tmp/ClienteSOAP_1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ClienteSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ClienteSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClienteSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ClienteSOAPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ClienteSOAPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ClienteSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ClienteSOAP
     */
    @WebEndpoint(name = "ClienteSOAPPort")
    public ClienteSOAP getClienteSOAPPort() {
        return super.getPort(ClienteSOAPPort, ClienteSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClienteSOAP
     */
    @WebEndpoint(name = "ClienteSOAPPort")
    public ClienteSOAP getClienteSOAPPort(WebServiceFeature... features) {
        return super.getPort(ClienteSOAPPort, ClienteSOAP.class, features);
    }

}
