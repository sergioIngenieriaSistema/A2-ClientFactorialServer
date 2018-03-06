
package services;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FactorialWebService", targetNamespace = "http://services/", wsdlLocation = "http://ws.docencia.ces.siani.es/a15/FactorialWS/FactorialWebService?wsdl")
public class FactorialWebService_Service
    extends Service
{

    private final static URL FACTORIALWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException FACTORIALWEBSERVICE_EXCEPTION;
    private final static QName FACTORIALWEBSERVICE_QNAME = new QName("http://services/", "FactorialWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.docencia.ces.siani.es/a15/FactorialWS/FactorialWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FACTORIALWEBSERVICE_WSDL_LOCATION = url;
        FACTORIALWEBSERVICE_EXCEPTION = e;
    }

    public FactorialWebService_Service() {
        super(__getWsdlLocation(), FACTORIALWEBSERVICE_QNAME);
    }

    public FactorialWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), FACTORIALWEBSERVICE_QNAME, features);
    }

    public FactorialWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, FACTORIALWEBSERVICE_QNAME);
    }

    public FactorialWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FACTORIALWEBSERVICE_QNAME, features);
    }

    public FactorialWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FactorialWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FactorialWebService
     */
    @WebEndpoint(name = "FactorialWebServicePort")
    public FactorialWebService getFactorialWebServicePort() {
        return super.getPort(new QName("http://services/", "FactorialWebServicePort"), FactorialWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FactorialWebService
     */
    @WebEndpoint(name = "FactorialWebServicePort")
    public FactorialWebService getFactorialWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "FactorialWebServicePort"), FactorialWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FACTORIALWEBSERVICE_EXCEPTION!= null) {
            throw FACTORIALWEBSERVICE_EXCEPTION;
        }
        return FACTORIALWEBSERVICE_WSDL_LOCATION;
    }

}
