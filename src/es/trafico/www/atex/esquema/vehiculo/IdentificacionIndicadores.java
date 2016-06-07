/**
 * IdentificacionIndicadores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionIndicadores  implements java.io.Serializable {
    private java.lang.String tutela;

    private java.lang.String posesion;

    private java.lang.String limitacionDisposicion;

    private java.lang.String sustraccion;

    private java.lang.String excesoPesoDimension;

    private java.lang.String importacion;

    private java.lang.Boolean cargaEEFF;

    private java.lang.Boolean renting;

    public IdentificacionIndicadores() {
    }

    public IdentificacionIndicadores(
           java.lang.String tutela,
           java.lang.String posesion,
           java.lang.String limitacionDisposicion,
           java.lang.String sustraccion,
           java.lang.String excesoPesoDimension,
           java.lang.String importacion,
           java.lang.Boolean cargaEEFF,
           java.lang.Boolean renting) {
           this.tutela = tutela;
           this.posesion = posesion;
           this.limitacionDisposicion = limitacionDisposicion;
           this.sustraccion = sustraccion;
           this.excesoPesoDimension = excesoPesoDimension;
           this.importacion = importacion;
           this.cargaEEFF = cargaEEFF;
           this.renting = renting;
    }


    /**
     * Gets the tutela value for this IdentificacionIndicadores.
     * 
     * @return tutela
     */
    public java.lang.String getTutela() {
        return tutela;
    }


    /**
     * Sets the tutela value for this IdentificacionIndicadores.
     * 
     * @param tutela
     */
    public void setTutela(java.lang.String tutela) {
        this.tutela = tutela;
    }


    /**
     * Gets the posesion value for this IdentificacionIndicadores.
     * 
     * @return posesion
     */
    public java.lang.String getPosesion() {
        return posesion;
    }


    /**
     * Sets the posesion value for this IdentificacionIndicadores.
     * 
     * @param posesion
     */
    public void setPosesion(java.lang.String posesion) {
        this.posesion = posesion;
    }


    /**
     * Gets the limitacionDisposicion value for this IdentificacionIndicadores.
     * 
     * @return limitacionDisposicion
     */
    public java.lang.String getLimitacionDisposicion() {
        return limitacionDisposicion;
    }


    /**
     * Sets the limitacionDisposicion value for this IdentificacionIndicadores.
     * 
     * @param limitacionDisposicion
     */
    public void setLimitacionDisposicion(java.lang.String limitacionDisposicion) {
        this.limitacionDisposicion = limitacionDisposicion;
    }


    /**
     * Gets the sustraccion value for this IdentificacionIndicadores.
     * 
     * @return sustraccion
     */
    public java.lang.String getSustraccion() {
        return sustraccion;
    }


    /**
     * Sets the sustraccion value for this IdentificacionIndicadores.
     * 
     * @param sustraccion
     */
    public void setSustraccion(java.lang.String sustraccion) {
        this.sustraccion = sustraccion;
    }


    /**
     * Gets the excesoPesoDimension value for this IdentificacionIndicadores.
     * 
     * @return excesoPesoDimension
     */
    public java.lang.String getExcesoPesoDimension() {
        return excesoPesoDimension;
    }


    /**
     * Sets the excesoPesoDimension value for this IdentificacionIndicadores.
     * 
     * @param excesoPesoDimension
     */
    public void setExcesoPesoDimension(java.lang.String excesoPesoDimension) {
        this.excesoPesoDimension = excesoPesoDimension;
    }


    /**
     * Gets the importacion value for this IdentificacionIndicadores.
     * 
     * @return importacion
     */
    public java.lang.String getImportacion() {
        return importacion;
    }


    /**
     * Sets the importacion value for this IdentificacionIndicadores.
     * 
     * @param importacion
     */
    public void setImportacion(java.lang.String importacion) {
        this.importacion = importacion;
    }


    /**
     * Gets the cargaEEFF value for this IdentificacionIndicadores.
     * 
     * @return cargaEEFF
     */
    public java.lang.Boolean getCargaEEFF() {
        return cargaEEFF;
    }


    /**
     * Sets the cargaEEFF value for this IdentificacionIndicadores.
     * 
     * @param cargaEEFF
     */
    public void setCargaEEFF(java.lang.Boolean cargaEEFF) {
        this.cargaEEFF = cargaEEFF;
    }


    /**
     * Gets the renting value for this IdentificacionIndicadores.
     * 
     * @return renting
     */
    public java.lang.Boolean getRenting() {
        return renting;
    }


    /**
     * Sets the renting value for this IdentificacionIndicadores.
     * 
     * @param renting
     */
    public void setRenting(java.lang.Boolean renting) {
        this.renting = renting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionIndicadores)) return false;
        IdentificacionIndicadores other = (IdentificacionIndicadores) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tutela==null && other.getTutela()==null) || 
             (this.tutela!=null &&
              this.tutela.equals(other.getTutela()))) &&
            ((this.posesion==null && other.getPosesion()==null) || 
             (this.posesion!=null &&
              this.posesion.equals(other.getPosesion()))) &&
            ((this.limitacionDisposicion==null && other.getLimitacionDisposicion()==null) || 
             (this.limitacionDisposicion!=null &&
              this.limitacionDisposicion.equals(other.getLimitacionDisposicion()))) &&
            ((this.sustraccion==null && other.getSustraccion()==null) || 
             (this.sustraccion!=null &&
              this.sustraccion.equals(other.getSustraccion()))) &&
            ((this.excesoPesoDimension==null && other.getExcesoPesoDimension()==null) || 
             (this.excesoPesoDimension!=null &&
              this.excesoPesoDimension.equals(other.getExcesoPesoDimension()))) &&
            ((this.importacion==null && other.getImportacion()==null) || 
             (this.importacion!=null &&
              this.importacion.equals(other.getImportacion()))) &&
            ((this.cargaEEFF==null && other.getCargaEEFF()==null) || 
             (this.cargaEEFF!=null &&
              this.cargaEEFF.equals(other.getCargaEEFF()))) &&
            ((this.renting==null && other.getRenting()==null) || 
             (this.renting!=null &&
              this.renting.equals(other.getRenting())));
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
        if (getTutela() != null) {
            _hashCode += getTutela().hashCode();
        }
        if (getPosesion() != null) {
            _hashCode += getPosesion().hashCode();
        }
        if (getLimitacionDisposicion() != null) {
            _hashCode += getLimitacionDisposicion().hashCode();
        }
        if (getSustraccion() != null) {
            _hashCode += getSustraccion().hashCode();
        }
        if (getExcesoPesoDimension() != null) {
            _hashCode += getExcesoPesoDimension().hashCode();
        }
        if (getImportacion() != null) {
            _hashCode += getImportacion().hashCode();
        }
        if (getCargaEEFF() != null) {
            _hashCode += getCargaEEFF().hashCode();
        }
        if (getRenting() != null) {
            _hashCode += getRenting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionIndicadores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>Indicadores"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tutela");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tutela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posesion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Posesion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitacionDisposicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LimitacionDisposicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sustraccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sustraccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excesoPesoDimension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExcesoPesoDimension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Importacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargaEEFF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CargaEEFF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("renting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Renting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
