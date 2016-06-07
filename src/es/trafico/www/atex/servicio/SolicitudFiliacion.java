/**
 * SolicitudFiliacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public class SolicitudFiliacion  implements java.io.Serializable {
    private boolean personaJuridica;

    private es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaJuridica solicitudPersonaJuridica;

    private es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaFisica solicitudPersonaFisica;

    private es.trafico.www.atex.servicio.DatosUsuario datosUsuario;

    public SolicitudFiliacion() {
    }

    public SolicitudFiliacion(
           boolean personaJuridica,
           es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaJuridica solicitudPersonaJuridica,
           es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaFisica solicitudPersonaFisica,
           es.trafico.www.atex.servicio.DatosUsuario datosUsuario) {
           this.personaJuridica = personaJuridica;
           this.solicitudPersonaJuridica = solicitudPersonaJuridica;
           this.solicitudPersonaFisica = solicitudPersonaFisica;
           this.datosUsuario = datosUsuario;
    }


    /**
     * Gets the personaJuridica value for this SolicitudFiliacion.
     * 
     * @return personaJuridica
     */
    public boolean isPersonaJuridica() {
        return personaJuridica;
    }


    /**
     * Sets the personaJuridica value for this SolicitudFiliacion.
     * 
     * @param personaJuridica
     */
    public void setPersonaJuridica(boolean personaJuridica) {
        this.personaJuridica = personaJuridica;
    }


    /**
     * Gets the solicitudPersonaJuridica value for this SolicitudFiliacion.
     * 
     * @return solicitudPersonaJuridica
     */
    public es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaJuridica getSolicitudPersonaJuridica() {
        return solicitudPersonaJuridica;
    }


    /**
     * Sets the solicitudPersonaJuridica value for this SolicitudFiliacion.
     * 
     * @param solicitudPersonaJuridica
     */
    public void setSolicitudPersonaJuridica(es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaJuridica solicitudPersonaJuridica) {
        this.solicitudPersonaJuridica = solicitudPersonaJuridica;
    }


    /**
     * Gets the solicitudPersonaFisica value for this SolicitudFiliacion.
     * 
     * @return solicitudPersonaFisica
     */
    public es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaFisica getSolicitudPersonaFisica() {
        return solicitudPersonaFisica;
    }


    /**
     * Sets the solicitudPersonaFisica value for this SolicitudFiliacion.
     * 
     * @param solicitudPersonaFisica
     */
    public void setSolicitudPersonaFisica(es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaFisica solicitudPersonaFisica) {
        this.solicitudPersonaFisica = solicitudPersonaFisica;
    }


    /**
     * Gets the datosUsuario value for this SolicitudFiliacion.
     * 
     * @return datosUsuario
     */
    public es.trafico.www.atex.servicio.DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }


    /**
     * Sets the datosUsuario value for this SolicitudFiliacion.
     * 
     * @param datosUsuario
     */
    public void setDatosUsuario(es.trafico.www.atex.servicio.DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitudFiliacion)) return false;
        SolicitudFiliacion other = (SolicitudFiliacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.personaJuridica == other.isPersonaJuridica() &&
            ((this.solicitudPersonaJuridica==null && other.getSolicitudPersonaJuridica()==null) || 
             (this.solicitudPersonaJuridica!=null &&
              this.solicitudPersonaJuridica.equals(other.getSolicitudPersonaJuridica()))) &&
            ((this.solicitudPersonaFisica==null && other.getSolicitudPersonaFisica()==null) || 
             (this.solicitudPersonaFisica!=null &&
              this.solicitudPersonaFisica.equals(other.getSolicitudPersonaFisica()))) &&
            ((this.datosUsuario==null && other.getDatosUsuario()==null) || 
             (this.datosUsuario!=null &&
              this.datosUsuario.equals(other.getDatosUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isPersonaJuridica() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSolicitudPersonaJuridica() != null) {
            _hashCode += getSolicitudPersonaJuridica().hashCode();
        }
        if (getSolicitudPersonaFisica() != null) {
            _hashCode += getSolicitudPersonaFisica().hashCode();
        }
        if (getDatosUsuario() != null) {
            _hashCode += getDatosUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitudFiliacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudFiliacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaJuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "PersonaJuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitudPersonaJuridica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SolicitudPersonaJuridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">>SolicitudFiliacion>SolicitudPersonaJuridica"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitudPersonaFisica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SolicitudPersonaFisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">>SolicitudFiliacion>SolicitudPersonaFisica"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "DatosUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">DatosUsuario"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
