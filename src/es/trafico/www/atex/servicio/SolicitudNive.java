/**
 * SolicitudNive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public class SolicitudNive  implements java.io.Serializable {
    private java.lang.String nive;

    private es.trafico.www.atex.servicio.DatosUsuario datosUsuario;

    public SolicitudNive() {
    }

    public SolicitudNive(
           java.lang.String nive,
           es.trafico.www.atex.servicio.DatosUsuario datosUsuario) {
           this.nive = nive;
           this.datosUsuario = datosUsuario;
    }


    /**
     * Gets the nive value for this SolicitudNive.
     * 
     * @return nive
     */
    public java.lang.String getNive() {
        return nive;
    }


    /**
     * Sets the nive value for this SolicitudNive.
     * 
     * @param nive
     */
    public void setNive(java.lang.String nive) {
        this.nive = nive;
    }


    /**
     * Gets the datosUsuario value for this SolicitudNive.
     * 
     * @return datosUsuario
     */
    public es.trafico.www.atex.servicio.DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }


    /**
     * Sets the datosUsuario value for this SolicitudNive.
     * 
     * @param datosUsuario
     */
    public void setDatosUsuario(es.trafico.www.atex.servicio.DatosUsuario datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitudNive)) return false;
        SolicitudNive other = (SolicitudNive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nive==null && other.getNive()==null) || 
             (this.nive!=null &&
              this.nive.equals(other.getNive()))) &&
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
        if (getNive() != null) {
            _hashCode += getNive().hashCode();
        }
        if (getDatosUsuario() != null) {
            _hashCode += getDatosUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitudNive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudNive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "Nive"));
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
