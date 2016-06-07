/**
 * IdentificacionFechasControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionFechasControl  implements java.io.Serializable {
    private java.util.Date fechaItv;

    private java.util.Date fechaCaducidadTuristica;

    public IdentificacionFechasControl() {
    }

    public IdentificacionFechasControl(
           java.util.Date fechaItv,
           java.util.Date fechaCaducidadTuristica) {
           this.fechaItv = fechaItv;
           this.fechaCaducidadTuristica = fechaCaducidadTuristica;
    }


    /**
     * Gets the fechaItv value for this IdentificacionFechasControl.
     * 
     * @return fechaItv
     */
    public java.util.Date getFechaItv() {
        return fechaItv;
    }


    /**
     * Sets the fechaItv value for this IdentificacionFechasControl.
     * 
     * @param fechaItv
     */
    public void setFechaItv(java.util.Date fechaItv) {
        this.fechaItv = fechaItv;
    }


    /**
     * Gets the fechaCaducidadTuristica value for this IdentificacionFechasControl.
     * 
     * @return fechaCaducidadTuristica
     */
    public java.util.Date getFechaCaducidadTuristica() {
        return fechaCaducidadTuristica;
    }


    /**
     * Sets the fechaCaducidadTuristica value for this IdentificacionFechasControl.
     * 
     * @param fechaCaducidadTuristica
     */
    public void setFechaCaducidadTuristica(java.util.Date fechaCaducidadTuristica) {
        this.fechaCaducidadTuristica = fechaCaducidadTuristica;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionFechasControl)) return false;
        IdentificacionFechasControl other = (IdentificacionFechasControl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaItv==null && other.getFechaItv()==null) || 
             (this.fechaItv!=null &&
              this.fechaItv.equals(other.getFechaItv()))) &&
            ((this.fechaCaducidadTuristica==null && other.getFechaCaducidadTuristica()==null) || 
             (this.fechaCaducidadTuristica!=null &&
              this.fechaCaducidadTuristica.equals(other.getFechaCaducidadTuristica())));
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
        if (getFechaItv() != null) {
            _hashCode += getFechaItv().hashCode();
        }
        if (getFechaCaducidadTuristica() != null) {
            _hashCode += getFechaCaducidadTuristica().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionFechasControl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>FechasControl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaItv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaItv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCaducidadTuristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaCaducidadTuristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
