/**
 * IdentificacionRematriculacionesRematriculacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionRematriculacionesRematriculacion  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa razon;

    private java.util.Date fechaRematriculacion;

    private java.lang.String anotacion;

    public IdentificacionRematriculacionesRematriculacion() {
    }

    public IdentificacionRematriculacionesRematriculacion(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa razon,
           java.util.Date fechaRematriculacion,
           java.lang.String anotacion) {
           this.razon = razon;
           this.fechaRematriculacion = fechaRematriculacion;
           this.anotacion = anotacion;
    }


    /**
     * Gets the razon value for this IdentificacionRematriculacionesRematriculacion.
     * 
     * @return razon
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getRazon() {
        return razon;
    }


    /**
     * Sets the razon value for this IdentificacionRematriculacionesRematriculacion.
     * 
     * @param razon
     */
    public void setRazon(es.trafico.www.atex.esquema.CodigoDescripcionAlfa razon) {
        this.razon = razon;
    }


    /**
     * Gets the fechaRematriculacion value for this IdentificacionRematriculacionesRematriculacion.
     * 
     * @return fechaRematriculacion
     */
    public java.util.Date getFechaRematriculacion() {
        return fechaRematriculacion;
    }


    /**
     * Sets the fechaRematriculacion value for this IdentificacionRematriculacionesRematriculacion.
     * 
     * @param fechaRematriculacion
     */
    public void setFechaRematriculacion(java.util.Date fechaRematriculacion) {
        this.fechaRematriculacion = fechaRematriculacion;
    }


    /**
     * Gets the anotacion value for this IdentificacionRematriculacionesRematriculacion.
     * 
     * @return anotacion
     */
    public java.lang.String getAnotacion() {
        return anotacion;
    }


    /**
     * Sets the anotacion value for this IdentificacionRematriculacionesRematriculacion.
     * 
     * @param anotacion
     */
    public void setAnotacion(java.lang.String anotacion) {
        this.anotacion = anotacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionRematriculacionesRematriculacion)) return false;
        IdentificacionRematriculacionesRematriculacion other = (IdentificacionRematriculacionesRematriculacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.razon==null && other.getRazon()==null) || 
             (this.razon!=null &&
              this.razon.equals(other.getRazon()))) &&
            ((this.fechaRematriculacion==null && other.getFechaRematriculacion()==null) || 
             (this.fechaRematriculacion!=null &&
              this.fechaRematriculacion.equals(other.getFechaRematriculacion()))) &&
            ((this.anotacion==null && other.getAnotacion()==null) || 
             (this.anotacion!=null &&
              this.anotacion.equals(other.getAnotacion())));
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
        if (getRazon() != null) {
            _hashCode += getRazon().hashCode();
        }
        if (getFechaRematriculacion() != null) {
            _hashCode += getFechaRematriculacion().hashCode();
        }
        if (getAnotacion() != null) {
            _hashCode += getAnotacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionRematriculacionesRematriculacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>Rematriculaciones>Rematriculacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Razon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRematriculacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaRematriculacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anotacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Anotacion"));
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
