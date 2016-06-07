/**
 * Titular.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class Titular  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.DatosPersona datosPersona;

    private es.trafico.www.atex.esquema.Domicilio domicilio;

    public Titular() {
    }

    public Titular(
           es.trafico.www.atex.esquema.DatosPersona datosPersona,
           es.trafico.www.atex.esquema.Domicilio domicilio) {
           this.datosPersona = datosPersona;
           this.domicilio = domicilio;
    }


    /**
     * Gets the datosPersona value for this Titular.
     * 
     * @return datosPersona
     */
    public es.trafico.www.atex.esquema.DatosPersona getDatosPersona() {
        return datosPersona;
    }


    /**
     * Sets the datosPersona value for this Titular.
     * 
     * @param datosPersona
     */
    public void setDatosPersona(es.trafico.www.atex.esquema.DatosPersona datosPersona) {
        this.datosPersona = datosPersona;
    }


    /**
     * Gets the domicilio value for this Titular.
     * 
     * @return domicilio
     */
    public es.trafico.www.atex.esquema.Domicilio getDomicilio() {
        return domicilio;
    }


    /**
     * Sets the domicilio value for this Titular.
     * 
     * @param domicilio
     */
    public void setDomicilio(es.trafico.www.atex.esquema.Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Titular)) return false;
        Titular other = (Titular) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datosPersona==null && other.getDatosPersona()==null) || 
             (this.datosPersona!=null &&
              this.datosPersona.equals(other.getDatosPersona()))) &&
            ((this.domicilio==null && other.getDomicilio()==null) || 
             (this.domicilio!=null &&
              this.domicilio.equals(other.getDomicilio())));
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
        if (getDatosPersona() != null) {
            _hashCode += getDatosPersona().hashCode();
        }
        if (getDomicilio() != null) {
            _hashCode += getDomicilio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Titular.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Titular"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DatosPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "datosPersona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Domicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Domicilio"));
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
