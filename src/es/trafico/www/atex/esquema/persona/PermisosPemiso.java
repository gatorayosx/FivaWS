/**
 * PermisosPemiso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.persona;

public class PermisosPemiso  implements java.io.Serializable {
    private java.util.Date fechaInicio;

    private java.util.Date fechaFin;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso;

    public PermisosPemiso() {
    }

    public PermisosPemiso(
           java.util.Date fechaInicio,
           java.util.Date fechaFin,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso) {
           this.fechaInicio = fechaInicio;
           this.fechaFin = fechaFin;
           this.tipoPermiso = tipoPermiso;
    }


    /**
     * Gets the fechaInicio value for this PermisosPemiso.
     * 
     * @return fechaInicio
     */
    public java.util.Date getFechaInicio() {
        return fechaInicio;
    }


    /**
     * Sets the fechaInicio value for this PermisosPemiso.
     * 
     * @param fechaInicio
     */
    public void setFechaInicio(java.util.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    /**
     * Gets the fechaFin value for this PermisosPemiso.
     * 
     * @return fechaFin
     */
    public java.util.Date getFechaFin() {
        return fechaFin;
    }


    /**
     * Sets the fechaFin value for this PermisosPemiso.
     * 
     * @param fechaFin
     */
    public void setFechaFin(java.util.Date fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Gets the tipoPermiso value for this PermisosPemiso.
     * 
     * @return tipoPermiso
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipoPermiso() {
        return tipoPermiso;
    }


    /**
     * Sets the tipoPermiso value for this PermisosPemiso.
     * 
     * @param tipoPermiso
     */
    public void setTipoPermiso(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PermisosPemiso)) return false;
        PermisosPemiso other = (PermisosPemiso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaInicio==null && other.getFechaInicio()==null) || 
             (this.fechaInicio!=null &&
              this.fechaInicio.equals(other.getFechaInicio()))) &&
            ((this.fechaFin==null && other.getFechaFin()==null) || 
             (this.fechaFin!=null &&
              this.fechaFin.equals(other.getFechaFin()))) &&
            ((this.tipoPermiso==null && other.getTipoPermiso()==null) || 
             (this.tipoPermiso!=null &&
              this.tipoPermiso.equals(other.getTipoPermiso())));
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
        if (getFechaInicio() != null) {
            _hashCode += getFechaInicio().hashCode();
        }
        if (getFechaFin() != null) {
            _hashCode += getFechaFin().hashCode();
        }
        if (getTipoPermiso() != null) {
            _hashCode += getTipoPermiso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PermisosPemiso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Permisos>Pemiso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("tipoPermiso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoPermiso"));
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
