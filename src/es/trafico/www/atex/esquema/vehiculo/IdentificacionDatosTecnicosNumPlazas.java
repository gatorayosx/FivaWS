/**
 * IdentificacionDatosTecnicosNumPlazas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionDatosTecnicosNumPlazas  implements java.io.Serializable {
    private java.lang.Integer normales;

    private java.lang.String mixtas;

    public IdentificacionDatosTecnicosNumPlazas() {
    }

    public IdentificacionDatosTecnicosNumPlazas(
           java.lang.Integer normales,
           java.lang.String mixtas) {
           this.normales = normales;
           this.mixtas = mixtas;
    }


    /**
     * Gets the normales value for this IdentificacionDatosTecnicosNumPlazas.
     * 
     * @return normales
     */
    public java.lang.Integer getNormales() {
        return normales;
    }


    /**
     * Sets the normales value for this IdentificacionDatosTecnicosNumPlazas.
     * 
     * @param normales
     */
    public void setNormales(java.lang.Integer normales) {
        this.normales = normales;
    }


    /**
     * Gets the mixtas value for this IdentificacionDatosTecnicosNumPlazas.
     * 
     * @return mixtas
     */
    public java.lang.String getMixtas() {
        return mixtas;
    }


    /**
     * Sets the mixtas value for this IdentificacionDatosTecnicosNumPlazas.
     * 
     * @param mixtas
     */
    public void setMixtas(java.lang.String mixtas) {
        this.mixtas = mixtas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionDatosTecnicosNumPlazas)) return false;
        IdentificacionDatosTecnicosNumPlazas other = (IdentificacionDatosTecnicosNumPlazas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.normales==null && other.getNormales()==null) || 
             (this.normales!=null &&
              this.normales.equals(other.getNormales()))) &&
            ((this.mixtas==null && other.getMixtas()==null) || 
             (this.mixtas!=null &&
              this.mixtas.equals(other.getMixtas())));
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
        if (getNormales() != null) {
            _hashCode += getNormales().hashCode();
        }
        if (getMixtas() != null) {
            _hashCode += getMixtas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionDatosTecnicosNumPlazas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>DatosTecnicos>NumPlazas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Normales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mixtas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mixtas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
