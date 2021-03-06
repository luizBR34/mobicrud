
package mobiCRUD.WS;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CRUDImpl", targetNamespace = "http://WS.mobiSCD/", wsdlLocation = "https://mobiscd.herokuapp.com/CRUDImpl?wsdl")
public class CRUDImpl_Service
    extends Service
{

    private final static URL CRUDIMPL_WSDL_LOCATION;
    private final static WebServiceException CRUDIMPL_EXCEPTION;
    private final static QName CRUDIMPL_QNAME = new QName("http://WS.mobiSCD/", "CRUDImpl");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://mobiscd.herokuapp.com/CRUDImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CRUDIMPL_WSDL_LOCATION = url;
        CRUDIMPL_EXCEPTION = e;
    }

    public CRUDImpl_Service() {
        super(__getWsdlLocation(), CRUDIMPL_QNAME);
    }

    public CRUDImpl_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CRUDIMPL_QNAME, features);
    }

    public CRUDImpl_Service(URL wsdlLocation) {
        super(wsdlLocation, CRUDIMPL_QNAME);
    }

    public CRUDImpl_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CRUDIMPL_QNAME, features);
    }

    public CRUDImpl_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CRUDImpl_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CRUDImpl
     */
    @WebEndpoint(name = "CRUDImplPort")
    public CRUDImpl getCRUDImplPort() {
        return super.getPort(new QName("http://WS.mobiSCD/", "CRUDImplPort"), CRUDImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CRUDImpl
     */
    @WebEndpoint(name = "CRUDImplPort")
    public CRUDImpl getCRUDImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WS.mobiSCD/", "CRUDImplPort"), CRUDImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CRUDIMPL_EXCEPTION!= null) {
            throw CRUDIMPL_EXCEPTION;
        }
        return CRUDIMPL_WSDL_LOCATION;
    }

}
