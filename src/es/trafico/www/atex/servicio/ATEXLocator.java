/**
 * ATEXLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public class ATEXLocator extends org.apache.axis.client.Service implements es.trafico.www.atex.servicio.ATEX {

    public ATEXLocator() {
    }


    public ATEXLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ATEXLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ATEX
    private java.lang.String ATEX_address = "https://prews.tirea.es:443/WS_ATEX4/services/ATEX";

    public java.lang.String getATEXAddress() {
        return ATEX_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ATEXWSDDServiceName = "ATEX";

    public java.lang.String getATEXWSDDServiceName() {
        return ATEXWSDDServiceName;
    }

    public void setATEXWSDDServiceName(java.lang.String name) {
        ATEXWSDDServiceName = name;
    }

    public es.trafico.www.atex.servicio.ATEX_WS getATEX() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ATEX_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getATEX(endpoint);
    }

    public es.trafico.www.atex.servicio.ATEX_WS getATEX(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.trafico.www.atex.servicio.ATEXStub _stub = new es.trafico.www.atex.servicio.ATEXStub(portAddress, this);
            _stub.setPortName(getATEXWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setATEXEndpointAddress(java.lang.String address) {
        ATEX_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (es.trafico.www.atex.servicio.ATEX_WS.class.isAssignableFrom(serviceEndpointInterface)) {
                es.trafico.www.atex.servicio.ATEXStub _stub = new es.trafico.www.atex.servicio.ATEXStub(new java.net.URL(ATEX_address), this);
                _stub.setPortName(getATEXWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ATEX".equals(inputPortName)) {
            return getATEX();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "ATEX");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "ATEX"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ATEX".equals(portName)) {
            setATEXEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
