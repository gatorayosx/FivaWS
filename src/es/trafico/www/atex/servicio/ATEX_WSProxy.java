package es.trafico.www.atex.servicio;

public class ATEX_WSProxy implements es.trafico.www.atex.servicio.ATEX_WS {
  private String _endpoint = null;
  private es.trafico.www.atex.servicio.ATEX_WS aTEX_WS = null;
  
  public ATEX_WSProxy() {
    _initATEX_WSProxy();
  }
  
  public ATEX_WSProxy(String endpoint) {
    _endpoint = endpoint;
    _initATEX_WSProxy();
  }
  
  private void _initATEX_WSProxy() {
    try {
      aTEX_WS = (new es.trafico.www.atex.servicio.ATEXLocator()).getATEX();
      if (aTEX_WS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aTEX_WS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aTEX_WS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aTEX_WS != null)
      ((javax.xml.rpc.Stub)aTEX_WS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.trafico.www.atex.servicio.ATEX_WS getATEX_WS() {
    if (aTEX_WS == null)
      _initATEX_WSProxy();
    return aTEX_WS;
  }
  
  public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarMatricula(es.trafico.www.atex.servicio.SolicitudMatricula solicitudMatricula) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault{
    if (aTEX_WS == null)
      _initATEX_WSProxy();
    return aTEX_WS.consultarMatricula(solicitudMatricula);
  }
  
  public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarBastidor(es.trafico.www.atex.servicio.SolicitudBastidor solicitudBastidor) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault{
    if (aTEX_WS == null)
      _initATEX_WSProxy();
    return aTEX_WS.consultarBastidor(solicitudBastidor);
  }
  
  public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarNive(es.trafico.www.atex.servicio.SolicitudNive solicitudNive) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault{
    if (aTEX_WS == null)
      _initATEX_WSProxy();
    return aTEX_WS.consultarNive(solicitudNive);
  }
  
  public es.trafico.www.atex.esquema.persona.Persona consultarPersonaPorDocumento(es.trafico.www.atex.servicio.SolicitudDocumentoId solicitudDocumentoId) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault{
    if (aTEX_WS == null)
      _initATEX_WSProxy();
    return aTEX_WS.consultarPersonaPorDocumento(solicitudDocumentoId);
  }
  
  public es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[] consultarPersonaPorFiliacion(es.trafico.www.atex.servicio.SolicitudFiliacion solicitudFiliacion) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault{
    if (aTEX_WS == null)
      _initATEX_WSProxy();
    return aTEX_WS.consultarPersonaPorFiliacion(solicitudFiliacion);
  }
  
  
}