/**
 * DatosPersona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema;

public class DatosPersona  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.DatosPersonaJuridica juridica;

    private es.trafico.www.atex.esquema.DatosPersonaFisica fisica;

    public DatosPersona() {
    }

    public DatosPersona(
           es.trafico.www.atex.esquema.DatosPersonaJuridica juridica,
           es.trafico.www.atex.esquema.DatosPersonaFisica fisica) {
           this.juridica = juridica;
           this.fisica = fisica;
    }


    /**
     * Gets the juridica value for this DatosPersona.
     * 
     * @return juridica
     */
    public es.trafico.www.atex.esquema.DatosPersonaJuridica getJuridica() {
        return juridica;
    }


    /**
     * Sets the juridica value for this DatosPersona.
     * 
     * @param juridica
     */
    public void setJuridica(es.trafico.www.atex.esquema.DatosPersonaJuridica juridica) {
        this.juridica = juridica;
    }


    /**
     * Gets the fisica value for this DatosPersona.
     * 
     * @return fisica
     */
    public es.trafico.www.atex.esquema.DatosPersonaFisica getFisica() {
        return fisica;
    }


    /**
     * Sets the fisica value for this DatosPersona.
     * 
     * @param fisica
     */
    public void setFisica(es.trafico.www.atex.esquema.DatosPersonaFisica fisica) {
        this.fisica = fisica;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPersona)) return false;
        DatosPersona other = (DatosPersona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.juridica==null && other.getJuridica()==null) || 
             (this.juridica!=null &&
              this.juridica.equals(other.getJuridica()))) &&
            ((this.fisica==null && other.getFisica()==null) || 
             (this.fisica!=null &&
              this.fisica.equals(other.getFisica())));
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
        if (getJuridica() != null) {
            _hashCode += getJuridica().hashCode();
        }
        if (getFisica() != null) {
            _hashCode += getFisica().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPersona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "datosPersona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("juridica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Juridica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">datosPersona>Juridica"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fisica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Fisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">datosPersona>Fisica"));
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
