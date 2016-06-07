/**
 * IdentificacionMatriculacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionMatriculacion  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa claseMatriculacion;

    private java.lang.String matricula;

    private java.util.Date fechaMatriculacion;

    private es.trafico.www.atex.esquema.Jefatura jefatura;

    private es.trafico.www.atex.esquema.Sucursal sucursal;

    public IdentificacionMatriculacion() {
    }

    public IdentificacionMatriculacion(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa claseMatriculacion,
           java.lang.String matricula,
           java.util.Date fechaMatriculacion,
           es.trafico.www.atex.esquema.Jefatura jefatura,
           es.trafico.www.atex.esquema.Sucursal sucursal) {
           this.claseMatriculacion = claseMatriculacion;
           this.matricula = matricula;
           this.fechaMatriculacion = fechaMatriculacion;
           this.jefatura = jefatura;
           this.sucursal = sucursal;
    }


    /**
     * Gets the claseMatriculacion value for this IdentificacionMatriculacion.
     * 
     * @return claseMatriculacion
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getClaseMatriculacion() {
        return claseMatriculacion;
    }


    /**
     * Sets the claseMatriculacion value for this IdentificacionMatriculacion.
     * 
     * @param claseMatriculacion
     */
    public void setClaseMatriculacion(es.trafico.www.atex.esquema.CodigoDescripcionAlfa claseMatriculacion) {
        this.claseMatriculacion = claseMatriculacion;
    }


    /**
     * Gets the matricula value for this IdentificacionMatriculacion.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this IdentificacionMatriculacion.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the fechaMatriculacion value for this IdentificacionMatriculacion.
     * 
     * @return fechaMatriculacion
     */
    public java.util.Date getFechaMatriculacion() {
        return fechaMatriculacion;
    }


    /**
     * Sets the fechaMatriculacion value for this IdentificacionMatriculacion.
     * 
     * @param fechaMatriculacion
     */
    public void setFechaMatriculacion(java.util.Date fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }


    /**
     * Gets the jefatura value for this IdentificacionMatriculacion.
     * 
     * @return jefatura
     */
    public es.trafico.www.atex.esquema.Jefatura getJefatura() {
        return jefatura;
    }


    /**
     * Sets the jefatura value for this IdentificacionMatriculacion.
     * 
     * @param jefatura
     */
    public void setJefatura(es.trafico.www.atex.esquema.Jefatura jefatura) {
        this.jefatura = jefatura;
    }


    /**
     * Gets the sucursal value for this IdentificacionMatriculacion.
     * 
     * @return sucursal
     */
    public es.trafico.www.atex.esquema.Sucursal getSucursal() {
        return sucursal;
    }


    /**
     * Sets the sucursal value for this IdentificacionMatriculacion.
     * 
     * @param sucursal
     */
    public void setSucursal(es.trafico.www.atex.esquema.Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionMatriculacion)) return false;
        IdentificacionMatriculacion other = (IdentificacionMatriculacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claseMatriculacion==null && other.getClaseMatriculacion()==null) || 
             (this.claseMatriculacion!=null &&
              this.claseMatriculacion.equals(other.getClaseMatriculacion()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.fechaMatriculacion==null && other.getFechaMatriculacion()==null) || 
             (this.fechaMatriculacion!=null &&
              this.fechaMatriculacion.equals(other.getFechaMatriculacion()))) &&
            ((this.jefatura==null && other.getJefatura()==null) || 
             (this.jefatura!=null &&
              this.jefatura.equals(other.getJefatura()))) &&
            ((this.sucursal==null && other.getSucursal()==null) || 
             (this.sucursal!=null &&
              this.sucursal.equals(other.getSucursal())));
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
        if (getClaseMatriculacion() != null) {
            _hashCode += getClaseMatriculacion().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getFechaMatriculacion() != null) {
            _hashCode += getFechaMatriculacion().hashCode();
        }
        if (getJefatura() != null) {
            _hashCode += getJefatura().hashCode();
        }
        if (getSucursal() != null) {
            _hashCode += getSucursal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionMatriculacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>Matriculacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claseMatriculacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClaseMatriculacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaMatriculacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaMatriculacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jefatura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Jefatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">Jefatura"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sucursal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Sucursal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">Sucursal"));
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
