/**
 * Tramite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema;

public class Tramite  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso;

    private java.util.Date fecha;

    private es.trafico.www.atex.esquema.Jefatura jefatura;

    private es.trafico.www.atex.esquema.Sucursal sucursal;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo;

    private java.lang.String concesionObligatoria;

    private java.lang.String centroMedico;

    private java.lang.String claseAfectacion;

    public Tramite() {
    }

    public Tramite(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso,
           java.util.Date fecha,
           es.trafico.www.atex.esquema.Jefatura jefatura,
           es.trafico.www.atex.esquema.Sucursal sucursal,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo,
           java.lang.String concesionObligatoria,
           java.lang.String centroMedico,
           java.lang.String claseAfectacion) {
           this.tipoPermiso = tipoPermiso;
           this.fecha = fecha;
           this.jefatura = jefatura;
           this.sucursal = sucursal;
           this.tipo = tipo;
           this.concesionObligatoria = concesionObligatoria;
           this.centroMedico = centroMedico;
           this.claseAfectacion = claseAfectacion;
    }


    /**
     * Gets the tipoPermiso value for this Tramite.
     * 
     * @return tipoPermiso
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipoPermiso() {
        return tipoPermiso;
    }


    /**
     * Sets the tipoPermiso value for this Tramite.
     * 
     * @param tipoPermiso
     */
    public void setTipoPermiso(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }


    /**
     * Gets the fecha value for this Tramite.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Tramite.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the jefatura value for this Tramite.
     * 
     * @return jefatura
     */
    public es.trafico.www.atex.esquema.Jefatura getJefatura() {
        return jefatura;
    }


    /**
     * Sets the jefatura value for this Tramite.
     * 
     * @param jefatura
     */
    public void setJefatura(es.trafico.www.atex.esquema.Jefatura jefatura) {
        this.jefatura = jefatura;
    }


    /**
     * Gets the sucursal value for this Tramite.
     * 
     * @return sucursal
     */
    public es.trafico.www.atex.esquema.Sucursal getSucursal() {
        return sucursal;
    }


    /**
     * Sets the sucursal value for this Tramite.
     * 
     * @param sucursal
     */
    public void setSucursal(es.trafico.www.atex.esquema.Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    /**
     * Gets the tipo value for this Tramite.
     * 
     * @return tipo
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Tramite.
     * 
     * @param tipo
     */
    public void setTipo(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the concesionObligatoria value for this Tramite.
     * 
     * @return concesionObligatoria
     */
    public java.lang.String getConcesionObligatoria() {
        return concesionObligatoria;
    }


    /**
     * Sets the concesionObligatoria value for this Tramite.
     * 
     * @param concesionObligatoria
     */
    public void setConcesionObligatoria(java.lang.String concesionObligatoria) {
        this.concesionObligatoria = concesionObligatoria;
    }


    /**
     * Gets the centroMedico value for this Tramite.
     * 
     * @return centroMedico
     */
    public java.lang.String getCentroMedico() {
        return centroMedico;
    }


    /**
     * Sets the centroMedico value for this Tramite.
     * 
     * @param centroMedico
     */
    public void setCentroMedico(java.lang.String centroMedico) {
        this.centroMedico = centroMedico;
    }


    /**
     * Gets the claseAfectacion value for this Tramite.
     * 
     * @return claseAfectacion
     */
    public java.lang.String getClaseAfectacion() {
        return claseAfectacion;
    }


    /**
     * Sets the claseAfectacion value for this Tramite.
     * 
     * @param claseAfectacion
     */
    public void setClaseAfectacion(java.lang.String claseAfectacion) {
        this.claseAfectacion = claseAfectacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tramite)) return false;
        Tramite other = (Tramite) obj;
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
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.concesionObligatoria==null && other.getConcesionObligatoria()==null) || 
             (this.concesionObligatoria!=null &&
              this.concesionObligatoria.equals(other.getConcesionObligatoria()))) &&
            ((this.centroMedico==null && other.getCentroMedico()==null) || 
             (this.centroMedico!=null &&
              this.centroMedico.equals(other.getCentroMedico()))) &&
            ((this.claseAfectacion==null && other.getClaseAfectacion()==null) || 
             (this.claseAfectacion!=null &&
              this.claseAfectacion.equals(other.getClaseAfectacion())));
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
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getConcesionObligatoria() != null) {
            _hashCode += getConcesionObligatoria().hashCode();
        }
        if (getCentroMedico() != null) {
            _hashCode += getCentroMedico().hashCode();
        }
        if (getClaseAfectacion() != null) {
            _hashCode += getClaseAfectacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tramite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPermiso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "TipoPermiso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Fecha"));
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
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concesionObligatoria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "ConcesionObligatoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centroMedico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CentroMedico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claseAfectacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "ClaseAfectacion"));
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
