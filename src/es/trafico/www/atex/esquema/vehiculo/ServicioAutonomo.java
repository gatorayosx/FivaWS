/**
 * ServicioAutonomo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class ServicioAutonomo  implements java.io.Serializable {
    private java.lang.Boolean indicador;

    private java.lang.String codigoIAE;

    public ServicioAutonomo() {
    }

    public ServicioAutonomo(
           java.lang.Boolean indicador,
           java.lang.String codigoIAE) {
           this.indicador = indicador;
           this.codigoIAE = codigoIAE;
    }


    /**
     * Gets the indicador value for this ServicioAutonomo.
     * 
     * @return indicador
     */
    public java.lang.Boolean getIndicador() {
        return indicador;
    }


    /**
     * Sets the indicador value for this ServicioAutonomo.
     * 
     * @param indicador
     */
    public void setIndicador(java.lang.Boolean indicador) {
        this.indicador = indicador;
    }


    /**
     * Gets the codigoIAE value for this ServicioAutonomo.
     * 
     * @return codigoIAE
     */
    public java.lang.String getCodigoIAE() {
        return codigoIAE;
    }


    /**
     * Sets the codigoIAE value for this ServicioAutonomo.
     * 
     * @param codigoIAE
     */
    public void setCodigoIAE(java.lang.String codigoIAE) {
        this.codigoIAE = codigoIAE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicioAutonomo)) return false;
        ServicioAutonomo other = (ServicioAutonomo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indicador==null && other.getIndicador()==null) || 
             (this.indicador!=null &&
              this.indicador.equals(other.getIndicador()))) &&
            ((this.codigoIAE==null && other.getCodigoIAE()==null) || 
             (this.codigoIAE!=null &&
              this.codigoIAE.equals(other.getCodigoIAE())));
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
        if (getIndicador() != null) {
            _hashCode += getIndicador().hashCode();
        }
        if (getCodigoIAE() != null) {
            _hashCode += getCodigoIAE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicioAutonomo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">ServicioAutonomo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indicador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoIAE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoIAE"));
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
