/**
 * SegurosSeguro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class SegurosSeguro  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa contrato;

    private java.util.Date fechaInicio;

    private java.util.Date fechaFin;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa entidad;

    public SegurosSeguro() {
    }

    public SegurosSeguro(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa contrato,
           java.util.Date fechaInicio,
           java.util.Date fechaFin,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa entidad) {
           this.contrato = contrato;
           this.fechaInicio = fechaInicio;
           this.fechaFin = fechaFin;
           this.entidad = entidad;
    }


    /**
     * Gets the contrato value for this SegurosSeguro.
     * 
     * @return contrato
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getContrato() {
        return contrato;
    }


    /**
     * Sets the contrato value for this SegurosSeguro.
     * 
     * @param contrato
     */
    public void setContrato(es.trafico.www.atex.esquema.CodigoDescripcionAlfa contrato) {
        this.contrato = contrato;
    }


    /**
     * Gets the fechaInicio value for this SegurosSeguro.
     * 
     * @return fechaInicio
     */
    public java.util.Date getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this SegurosSeguro.
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(java.util.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the fechaFin value for this SegurosSeguro.
     * 
     * @return fechaFin
     */
    public java.util.Date getFechaFin() {
        return fechaFin;
    }


    /**
     * Sets the fechaFin value for this SegurosSeguro.
     * 
     * @param fechaFin
     */
    public void setFechaFin(java.util.Date fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Gets the entidad value for this SegurosSeguro.
     * 
     * @return entidad
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getEntidad() {
        return entidad;
    }


    /**
     * Sets the entidad value for this SegurosSeguro.
     * 
     * @param entidad
     */
    public void setEntidad(es.trafico.www.atex.esquema.CodigoDescripcionAlfa entidad) {
        this.entidad = entidad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegurosSeguro)) return false;
        SegurosSeguro other = (SegurosSeguro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contrato==null && other.getContrato()==null) || 
             (this.contrato!=null &&
              this.contrato.equals(other.getContrato()))) &&
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio()))) &&
            ((this.fechaFin==null && other.getFechaFin()==null) || 
             (this.fechaFin!=null &&
              this.fechaFin.equals(other.getFechaFin()))) &&
            ((this.entidad==null && other.getEntidad()==null) || 
             (this.entidad!=null &&
              this.entidad.equals(other.getEntidad())));
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
        if (getContrato() != null) {
            _hashCode += getContrato().hashCode();
        }
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        if (getFechaFin() != null) {
            _hashCode += getFechaFin().hashCode();
        }
        if (getEntidad() != null) {
            _hashCode += getEntidad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SegurosSeguro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Seguros>Seguro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Contrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Entidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
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
