/**
 * LimitacionesLimitacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class LimitacionesLimitacion  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo;

    private java.lang.String registro;

    private java.util.Date fecha;

    private java.lang.String financieraDomicilio;

    private java.lang.String anotacion;

    public LimitacionesLimitacion() {
    }

    public LimitacionesLimitacion(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo,
           java.lang.String registro,
           java.util.Date fecha,
           java.lang.String financieraDomicilio,
           java.lang.String anotacion) {
           this.tipo = tipo;
           this.registro = registro;
           this.fecha = fecha;
           this.financieraDomicilio = financieraDomicilio;
           this.anotacion = anotacion;
    }


    /**
     * Gets the tipo value for this LimitacionesLimitacion.
     * 
     * @return tipo
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this LimitacionesLimitacion.
     * 
     * @param tipo
     */
    public void setTipo(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the registro value for this LimitacionesLimitacion.
     * 
     * @return registro
     */
    public java.lang.String getRegistro() {
        return registro;
    }


    /**
     * Sets the registro value for this LimitacionesLimitacion.
     * 
     * @param registro
     */
    public void setRegistro(java.lang.String registro) {
        this.registro = registro;
    }


    /**
     * Gets the fecha value for this LimitacionesLimitacion.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this LimitacionesLimitacion.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the financieraDomicilio value for this LimitacionesLimitacion.
     * 
     * @return financieraDomicilio
     */
    public java.lang.String getFinancieraDomicilio() {
        return financieraDomicilio;
    }


    /**
     * Sets the financieraDomicilio value for this LimitacionesLimitacion.
     * 
     * @param financieraDomicilio
     */
    public void setFinancieraDomicilio(java.lang.String financieraDomicilio) {
        this.financieraDomicilio = financieraDomicilio;
    }


    /**
     * Gets the anotacion value for this LimitacionesLimitacion.
     * 
     * @return anotacion
     */
    public java.lang.String getAnotacion() {
        return anotacion;
    }


    /**
     * Sets the anotacion value for this LimitacionesLimitacion.
     * 
     * @param anotacion
     */
    public void setAnotacion(java.lang.String anotacion) {
        this.anotacion = anotacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimitacionesLimitacion)) return false;
        LimitacionesLimitacion other = (LimitacionesLimitacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.registro==null && other.getRegistro()==null) || 
             (this.registro!=null &&
              this.registro.equals(other.getRegistro()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.financieraDomicilio==null && other.getFinancieraDomicilio()==null) || 
             (this.financieraDomicilio!=null &&
              this.financieraDomicilio.equals(other.getFinancieraDomicilio()))) &&
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
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getRegistro() != null) {
            _hashCode += getRegistro().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getFinancieraDomicilio() != null) {
            _hashCode += getFinancieraDomicilio().hashCode();
        }
        if (getAnotacion() != null) {
            _hashCode += getAnotacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimitacionesLimitacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Limitaciones>Limitacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Registro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financieraDomicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FinancieraDomicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
