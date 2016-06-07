/**
 * SancionesSancion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.persona;

public class SancionesSancion  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa autoridad;

    private java.lang.String expediente;

    private java.util.Date fecha;

    private java.util.Date fechaFin;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoSancion;

    private java.lang.String duracion;

    private java.lang.String motivo;

    private java.lang.String anotacion;

    public SancionesSancion() {
    }

    public SancionesSancion(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa autoridad,
           java.lang.String expediente,
           java.util.Date fecha,
           java.util.Date fechaFin,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoSancion,
           java.lang.String duracion,
           java.lang.String motivo,
           java.lang.String anotacion) {
           this.autoridad = autoridad;
           this.expediente = expediente;
           this.fecha = fecha;
           this.fechaFin = fechaFin;
           this.tipoSancion = tipoSancion;
           this.duracion = duracion;
           this.motivo = motivo;
           this.anotacion = anotacion;
    }


    /**
     * Gets the autoridad value for this SancionesSancion.
     * 
     * @return autoridad
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getAutoridad() {
        return autoridad;
    }


    /**
     * Sets the autoridad value for this SancionesSancion.
     * 
     * @param autoridad
     */
    public void setAutoridad(es.trafico.www.atex.esquema.CodigoDescripcionAlfa autoridad) {
        this.autoridad = autoridad;
    }


    /**
     * Gets the expediente value for this SancionesSancion.
     * 
     * @return expediente
     */
    public java.lang.String getExpediente() {
        return expediente;
    }


    /**
     * Sets the expediente value for this SancionesSancion.
     * 
     * @param expediente
     */
    public void setExpediente(java.lang.String expediente) {
        this.expediente = expediente;
    }


    /**
     * Gets the fecha value for this SancionesSancion.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this SancionesSancion.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the fechaFin value for this SancionesSancion.
     * 
     * @return fechaFin
     */
    public java.util.Date getFechaFin() {
        return fechaFin;
    }


    /**
     * Sets the fechaFin value for this SancionesSancion.
     * 
     * @param fechaFin
     */
    public void setFechaFin(java.util.Date fechaFin) {
        this.fechaFin = fechaFin;
    }


    /**
     * Gets the tipoSancion value for this SancionesSancion.
     * 
     * @return tipoSancion
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipoSancion() {
        return tipoSancion;
    }


    /**
     * Sets the tipoSancion value for this SancionesSancion.
     * 
     * @param tipoSancion
     */
    public void setTipoSancion(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoSancion) {
        this.tipoSancion = tipoSancion;
    }


    /**
     * Gets the duracion value for this SancionesSancion.
     * 
     * @return duracion
     */
    public java.lang.String getDuracion() {
        return duracion;
    }


    /**
     * Sets the duracion value for this SancionesSancion.
     * 
     * @param duracion
     */
    public void setDuracion(java.lang.String duracion) {
        this.duracion = duracion;
    }


    /**
     * Gets the motivo value for this SancionesSancion.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this SancionesSancion.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the anotacion value for this SancionesSancion.
     * 
     * @return anotacion
     */
    public java.lang.String getAnotacion() {
        return anotacion;
    }


    /**
     * Sets the anotacion value for this SancionesSancion.
     * 
     * @param anotacion
     */
    public void setAnotacion(java.lang.String anotacion) {
        this.anotacion = anotacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SancionesSancion)) return false;
        SancionesSancion other = (SancionesSancion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoridad==null && other.getAutoridad()==null) || 
             (this.autoridad!=null &&
              this.autoridad.equals(other.getAutoridad()))) &&
            ((this.expediente==null && other.getExpediente()==null) || 
             (this.expediente!=null &&
              this.expediente.equals(other.getExpediente()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.fechaFin==null && other.getFechaFin()==null) || 
             (this.fechaFin!=null &&
              this.fechaFin.equals(other.getFechaFin()))) &&
            ((this.tipoSancion==null && other.getTipoSancion()==null) || 
             (this.tipoSancion!=null &&
              this.tipoSancion.equals(other.getTipoSancion()))) &&
            ((this.duracion==null && other.getDuracion()==null) || 
             (this.duracion!=null &&
              this.duracion.equals(other.getDuracion()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
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
        if (getAutoridad() != null) {
            _hashCode += getAutoridad().hashCode();
        }
        if (getExpediente() != null) {
            _hashCode += getExpediente().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getFechaFin() != null) {
            _hashCode += getFechaFin().hashCode();
        }
        if (getTipoSancion() != null) {
            _hashCode += getTipoSancion().hashCode();
        }
        if (getDuracion() != null) {
            _hashCode += getDuracion().hashCode();
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getAnotacion() != null) {
            _hashCode += getAnotacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SancionesSancion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Sanciones>Sancion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoridad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Autoridad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expediente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Expediente"));
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
        elemField.setFieldName("fechaFin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoSancion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoSancion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duracion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duracion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Motivo"));
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
