/**
 * ExamenesExamen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.persona;

public class ExamenesExamen  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso;

    private java.util.Date fecha;

    private es.trafico.www.atex.esquema.Jefatura jefatura;

    private es.trafico.www.atex.esquema.Sucursal sucursal;

    private java.lang.String autoescuela;

    private java.lang.String centroMedico;

    private java.lang.String situacion;

    private es.trafico.www.atex.esquema.persona.Resultado[] resultados;

    public ExamenesExamen() {
    }

    public ExamenesExamen(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso,
           java.util.Date fecha,
           es.trafico.www.atex.esquema.Jefatura jefatura,
           es.trafico.www.atex.esquema.Sucursal sucursal,
           java.lang.String autoescuela,
           java.lang.String centroMedico,
           java.lang.String situacion,
           es.trafico.www.atex.esquema.persona.Resultado[] resultados) {
           this.tipoPermiso = tipoPermiso;
           this.fecha = fecha;
           this.jefatura = jefatura;
           this.sucursal = sucursal;
           this.autoescuela = autoescuela;
           this.centroMedico = centroMedico;
           this.situacion = situacion;
           this.resultados = resultados;
    }


    /**
     * Gets the tipoPermiso value for this ExamenesExamen.
     * 
     * @return tipoPermiso
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipoPermiso() {
        return tipoPermiso;
    }


    /**
     * Sets the tipoPermiso value for this ExamenesExamen.
     * 
     * @param tipoPermiso
     */
    public void setTipoPermiso(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }


    /**
     * Gets the fecha value for this ExamenesExamen.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this ExamenesExamen.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the jefatura value for this ExamenesExamen.
     * 
     * @return jefatura
     */
    public es.trafico.www.atex.esquema.Jefatura getJefatura() {
        return jefatura;
    }


    /**
     * Sets the jefatura value for this ExamenesExamen.
     * 
     * @param jefatura
     */
    public void setJefatura(es.trafico.www.atex.esquema.Jefatura jefatura) {
        this.jefatura = jefatura;
    }


    /**
     * Gets the sucursal value for this ExamenesExamen.
     * 
     * @return sucursal
     */
    public es.trafico.www.atex.esquema.Sucursal getSucursal() {
        return sucursal;
    }


    /**
     * Sets the sucursal value for this ExamenesExamen.
     * 
     * @param sucursal
     */
    public void setSucursal(es.trafico.www.atex.esquema.Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    /**
     * Gets the autoescuela value for this ExamenesExamen.
     * 
     * @return autoescuela
     */
    public java.lang.String getAutoescuela() {
        return autoescuela;
    }


    /**
     * Sets the autoescuela value for this ExamenesExamen.
     * 
     * @param autoescuela
     */
    public void setAutoescuela(java.lang.String autoescuela) {
        this.autoescuela = autoescuela;
    }


    /**
     * Gets the centroMedico value for this ExamenesExamen.
     * 
     * @return centroMedico
     */
    public java.lang.String getCentroMedico() {
        return centroMedico;
    }


    /**
     * Sets the centroMedico value for this ExamenesExamen.
     * 
     * @param centroMedico
     */
    public void setCentroMedico(java.lang.String centroMedico) {
        this.centroMedico = centroMedico;
    }


    /**
     * Gets the situacion value for this ExamenesExamen.
     * 
     * @return situacion
     */
    public java.lang.String getSituacion() {
        return situacion;
    }


    /**
     * Sets the situacion value for this ExamenesExamen.
     * 
     * @param situacion
     */
    public void setSituacion(java.lang.String situacion) {
        this.situacion = situacion;
    }


    /**
     * Gets the resultados value for this ExamenesExamen.
     * 
     * @return resultados
     */
    public es.trafico.www.atex.esquema.persona.Resultado[] getResultados() {
        return resultados;
    }


    /**
     * Sets the resultados value for this ExamenesExamen.
     * 
     * @param resultados
     */
    public void setResultados(es.trafico.www.atex.esquema.persona.Resultado[] resultados) {
        this.resultados = resultados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExamenesExamen)) return false;
        ExamenesExamen other = (ExamenesExamen) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoPermiso==null && other.getTipoPermiso()==null) || 
             (this.tipoPermiso!=null &&
              this.tipoPermiso.equals(other.getTipoPermiso()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.jefatura==null && other.getJefatura()==null) || 
             (this.jefatura!=null &&
              this.jefatura.equals(other.getJefatura()))) &&
            ((this.sucursal==null && other.getSucursal()==null) || 
             (this.sucursal!=null &&
              this.sucursal.equals(other.getSucursal()))) &&
            ((this.autoescuela==null && other.getAutoescuela()==null) || 
             (this.autoescuela!=null &&
              this.autoescuela.equals(other.getAutoescuela()))) &&
            ((this.centroMedico==null && other.getCentroMedico()==null) || 
             (this.centroMedico!=null &&
              this.centroMedico.equals(other.getCentroMedico()))) &&
            ((this.situacion==null && other.getSituacion()==null) || 
             (this.situacion!=null &&
              this.situacion.equals(other.getSituacion()))) &&
            ((this.resultados==null && other.getResultados()==null) || 
             (this.resultados!=null &&
              java.util.Arrays.equals(this.resultados, other.getResultados())));
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
        if (getTipoPermiso() != null) {
            _hashCode += getTipoPermiso().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getJefatura() != null) {
            _hashCode += getJefatura().hashCode();
        }
        if (getSucursal() != null) {
            _hashCode += getSucursal().hashCode();
        }
        if (getAutoescuela() != null) {
            _hashCode += getAutoescuela().hashCode();
        }
        if (getCentroMedico() != null) {
            _hashCode += getCentroMedico().hashCode();
        }
        if (getSituacion() != null) {
            _hashCode += getSituacion().hashCode();
        }
        if (getResultados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExamenesExamen.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Examenes>Examen"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPermiso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoPermiso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoescuela");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Autoescuela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroMedico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CentroMedico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Situacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Resultados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Resultado"));
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
