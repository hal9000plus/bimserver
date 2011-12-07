package org.bimserver.generatedclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.4.3
 * 2011-12-07T14:46:29.793+01:00
 * Generated source version: 2.4.3
 * 
 */
@WebServiceClient(name = "ServiceInterfaceService", 
                  wsdlLocation = "generated/BIMserver.wsdl",
                  targetNamespace = "http://shared.bimserver.org/") 
public class ServiceInterfaceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://shared.bimserver.org/", "ServiceInterfaceService");
    public final static QName SoapPort = new QName("http://shared.bimserver.org/", "soapPort");
    static {
        URL url = null;
        try {
            url = new URL("generated/BIMserver.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceInterfaceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "generated/BIMserver.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceInterfaceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceInterfaceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceInterfaceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Soap
     */
    @WebEndpoint(name = "soapPort")
    public Soap getSoapPort() {
        return super.getPort(SoapPort, Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Soap
     */
    @WebEndpoint(name = "soapPort")
    public Soap getSoapPort(WebServiceFeature... features) {
        return super.getPort(SoapPort, Soap.class, features);
    }

}
