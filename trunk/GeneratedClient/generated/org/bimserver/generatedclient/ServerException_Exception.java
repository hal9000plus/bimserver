
package org.bimserver.generatedclient;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-05-10T13:52:53.992+02:00
 * Generated source version: 2.4.0
 * 
 */

@WebFault(name = "ServerException", targetNamespace = "http://shared.bimserver.org/")
public class ServerException_Exception extends Exception {
    public static final long serialVersionUID = 20110510135253L;
    
    private org.bimserver.generatedclient.ServerException serverException;

    public ServerException_Exception() {
        super();
    }
    
    public ServerException_Exception(String message) {
        super(message);
    }
    
    public ServerException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerException_Exception(String message, org.bimserver.generatedclient.ServerException serverException) {
        super(message);
        this.serverException = serverException;
    }

    public ServerException_Exception(String message, org.bimserver.generatedclient.ServerException serverException, Throwable cause) {
        super(message, cause);
        this.serverException = serverException;
    }

    public org.bimserver.generatedclient.ServerException getFaultInfo() {
        return this.serverException;
    }
}
