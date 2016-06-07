/**
 * SolicitudDocumentoId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public class SolicitudDocumentoId  implements java.io.Serializable {
    private java.lang.String documentoId;

    private es.trafico.www.atex.servicio.DatosUsuario datosUsuario;

    public SolicitudDocumentoId() {
    }

    public SolicitudDocumentoId(
           java.lang.String documentoId,
           es.trafico.www.atex.servicio.DatosUsuario datosUsuario) {
           this.documentoId = documentoId;
           this.datosUsuario = datosUsuario;
    }


    /**
     * Gets the documentoId value for this SolicitudDocumentoId.
     * 
     * @return documentoId
     */
    public java.lang.String getDocumentoId() {
        return documentoId;
    }


    /**
     * Sets the documentoId value for this SolicitudDocumentoId.
     * 
     * @param documentoId
     */
    public void setDocumentoId(java.lang.String documentoId) {
        this.documentoId = documentoId;
    }


    /**
     * Gets the datosUsuario value for this SolicitudDocumentoId.
     * 
     * @return datosUsuario
     */
    public es.trafico.www.atex.servicio.DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }


    /**
     * Sets the datosUsuario value for this SolicitudDocumentoId.
     * 
     * @param datosUsuario
     */
    public void setDatosUsuario(es.trafico.www.atex.servicio.DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitudDocumentoId)) return false;
        SolicitudDocumentoId other = (SolicitudDocumentoId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentoId==null && other.getDocumentoId()==null) || 
             (this.documentoId!=null &&
              this.documentoId.equals(other.getDocumentoId()))) &&
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
        if (getDocumentoId() != null) {
            _hashCode += getDocumentoId().hashCode();
        }
        if (getDatosUsuario() != null) {
            _hashCode += getDatosUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitudDocumentoId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudDocumentoId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "DocumentoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
