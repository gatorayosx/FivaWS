/**
 * EmbargoPrecinto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema;

public class EmbargoPrecinto  implements java.io.Serializable {
    private java.lang.String expediente;

    private java.util.Date fechaTramite;

    private java.util.Date fechaMaterializacion;

    private es.trafico.www.atex.esquema.EmbargoPrecintoAutoridad autoridad;

    public EmbargoPrecinto() {
    }

    public EmbargoPrecinto(
           java.lang.String expediente,
           java.util.Date fechaTramite,
           java.util.Date fechaMaterializacion,
           es.trafico.www.atex.esquema.EmbargoPrecintoAutoridad autoridad) {
           this.expediente = expediente;
           this.fechaTramite = fechaTramite;
           this.fechaMaterializacion = fechaMaterializacion;
           this.autoridad = autoridad;
    }


    /**
     * Gets the expediente value for this EmbargoPrecinto.
     * 
     * @return expediente
     */
    public java.lang.String getExpediente() {
        return expediente;
    }


    /**
     * Sets the expediente value for this EmbargoPrecinto.
     * 
     * @param expediente
     */
    public void setExpediente(java.lang.String expediente) {
        this.expediente = expediente;
    }


    /**
     * Gets the fechaTramite value for this EmbargoPrecinto.
     * 
     * @return fechaTramite
     */
    public java.util.Date getFechaTramite() {
        return fechaTramite;
    }


    /**
     * Sets the fechaTramite value for this EmbargoPrecinto.
     * 
     * @param fechaTramite
     */
    public void setFechaTramite(java.util.Date fechaTramite) {
        this.fechaTramite = fechaTramite;
    }


    /**
     * Gets the fechaMaterializacion value for this EmbargoPrecinto.
     * 
     * @return fechaMaterializacion
     */
    public java.util.Date getFechaMaterializacion() {
        return fechaMaterializacion;
    }


    /**
     * Sets the fechaMaterializacion value for this EmbargoPrecinto.
     * 
     * @param fechaMaterializacion
     */
    public void setFechaMaterializacion(java.util.Date fechaMaterializacion) {
        this.fechaMaterializacion = fechaMaterializacion;
    }


    /**
     * Gets the autoridad value for this EmbargoPrecinto.
     * 
     * @return autoridad
     */
    public es.trafico.www.atex.esquema.EmbargoPrecintoAutoridad getAutoridad() {
        return autoridad;
    }


    /**
     * Sets the autoridad value for this EmbargoPrecinto.
     * 
     * @param autoridad
     */
    public void setAutoridad(es.trafico.www.atex.esquema.EmbargoPrecintoAutoridad autoridad) {
        this.autoridad = autoridad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmbargoPrecinto)) return false;
        EmbargoPrecinto other = (EmbargoPrecinto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expediente==null && other.getExpediente()==null) || 
             (this.expediente!=null &&
              this.expediente.equals(other.getExpediente()))) &&
            ((this.fechaTramite==null && other.getFechaTramite()==null) || 
             (this.fechaTramite!=null &&
              this.fechaTramite.equals(other.getFechaTramite()))) &&
            ((this.fechaMaterializacion==null && other.getFechaMaterializacion()==null) || 
             (this.fechaMaterializacion!=null &&
              this.fechaMaterializacion.equals(other.getFechaMaterializacion()))) &&
            ((this.autoridad==null && other.getAutoridad()==null) || 
             (this.autoridad!=null &&
              this.autoridad.equals(other.getAutoridad())));
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
        if (getExpediente() != null) {
            _hashCode += getExpediente().hashCode();
        }
        if (getFechaTramite() != null) {
            _hashCode += getFechaTramite().hashCode();
        }
        if (getFechaMaterializacion() != null) {
            _hashCode += getFechaMaterializacion().hashCode();
        }
        if (getAutoridad() != null) {
            _hashCode += getAutoridad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmbargoPrecinto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "EmbargoPrecinto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expediente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Expediente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "FechaTramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaMaterializacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "FechaMaterializacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoridad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Autoridad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">EmbargoPrecinto>Autoridad"));
        elemField.setMinOccurs(0);
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
