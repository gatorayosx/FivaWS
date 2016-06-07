/**
 * DatosPersonaJuridica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema;

public class DatosPersonaJuridica  implements java.io.Serializable {
    private java.lang.String cif;

    private java.lang.String razonSocial;

    public DatosPersonaJuridica() {
    }

    public DatosPersonaJuridica(
           java.lang.String cif,
           java.lang.String razonSocial) {
           this.cif = cif;
           this.razonSocial = razonSocial;
    }


    /**
     * Gets the cif value for this DatosPersonaJuridica.
     * 
     * @return cif
     */
    public java.lang.String getCif() {
        return cif;
    }


    /**
     * Sets the cif value for this DatosPersonaJuridica.
     * 
     * @param cif
     */
    public void setCif(java.lang.String cif) {
        this.cif = cif;
    }


    /**
     * Gets the razonSocial value for this DatosPersonaJuridica.
     * 
     * @return razonSocial
     */
    public java.lang.String getRazonSocial() {
        return razonSocial;
    }


    /**
     * Sets the razonSocial value for this DatosPersonaJuridica.
     * 
     * @param razonSocial
     */
    public void setRazonSocial(java.lang.String razonSocial) {
        this.razonSocial = razonSocial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPersonaJuridica)) return false;
        DatosPersonaJuridica other = (DatosPersonaJuridica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cif==null && other.getCif()==null) || 
             (this.cif!=null &&
              this.cif.equals(other.getCif()))) &&
            ((this.razonSocial==null && other.getRazonSocial()==null) || 
             (this.razonSocial!=null &&
              this.razonSocial.equals(other.getRazonSocial())));
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
        if (getCif() != null) {
            _hashCode += getCif().hashCode();
        }
        if (getRazonSocial() != null) {
            _hashCode += getRazonSocial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPersonaJuridica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">datosPersona>Juridica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Cif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "RazonSocial"));
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
