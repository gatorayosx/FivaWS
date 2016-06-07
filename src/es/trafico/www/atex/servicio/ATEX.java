/**
 * ATEX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public interface ATEX extends javax.xml.rpc.Service {
    public java.lang.String getATEXAddress();

    public es.trafico.www.atex.servicio.ATEX_WS getATEX() throws javax.xml.rpc.ServiceException;

    public es.trafico.www.atex.servicio.ATEX_WS getATEX(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
