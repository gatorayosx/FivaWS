/**
 * ATEX_WS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public interface ATEX_WS extends java.rmi.Remote {
    public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarMatricula(es.trafico.www.atex.servicio.SolicitudMatricula solicitudMatricula) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault;
    public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarBastidor(es.trafico.www.atex.servicio.SolicitudBastidor solicitudBastidor) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault;
    public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarNive(es.trafico.www.atex.servicio.SolicitudNive solicitudNive) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault;
    public es.trafico.www.atex.esquema.persona.Persona consultarPersonaPorDocumento(es.trafico.www.atex.servicio.SolicitudDocumentoId solicitudDocumentoId) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault;
    public es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[] consultarPersonaPorFiliacion(es.trafico.www.atex.servicio.SolicitudFiliacion solicitudFiliacion) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault;
}
