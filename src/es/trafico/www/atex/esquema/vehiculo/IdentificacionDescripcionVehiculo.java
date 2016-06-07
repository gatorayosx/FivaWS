/**
 * IdentificacionDescripcionVehiculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionDescripcionVehiculo  implements java.io.Serializable {
    private java.lang.String bastidor;

    private java.lang.String nive;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa marca;

    private java.lang.String modelo;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa color;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa procedencia;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa servicio;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoVehiculo;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoIndustria;

    public IdentificacionDescripcionVehiculo() {
    }

    public IdentificacionDescripcionVehiculo(
           java.lang.String bastidor,
           java.lang.String nive,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa marca,
           java.lang.String modelo,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa color,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa procedencia,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa servicio,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoVehiculo,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoIndustria) {
           this.bastidor = bastidor;
           this.nive = nive;
           this.marca = marca;
           this.modelo = modelo;
           this.color = color;
           this.procedencia = procedencia;
           this.servicio = servicio;
           this.tipoVehiculo = tipoVehiculo;
           this.tipoIndustria = tipoIndustria;
    }


    /**
     * Gets the bastidor value for this IdentificacionDescripcionVehiculo.
     * 
     * @return bastidor
     */
    public java.lang.String getBastidor() {
        return bastidor;
    }


    /**
     * Sets the bastidor value for this IdentificacionDescripcionVehiculo.
     * 
     * @param bastidor
     */
    public void setBastidor(java.lang.String bastidor) {
        this.bastidor = bastidor;
    }


    /**
     * Gets the nive value for this IdentificacionDescripcionVehiculo.
     * 
     * @return nive
     */
    public java.lang.String getNive() {
        return nive;
    }


    /**
     * Sets the nive value for this IdentificacionDescripcionVehiculo.
     * 
     * @param nive
     */
    public void setNive(java.lang.String nive) {
        this.nive = nive;
    }


    /**
     * Gets the marca value for this IdentificacionDescripcionVehiculo.
     * 
     * @return marca
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this IdentificacionDescripcionVehiculo.
     * 
     * @param marca
     */
    public void setMarca(es.trafico.www.atex.esquema.CodigoDescripcionAlfa marca) {
        this.marca = marca;
    }


    /**
     * Gets the modelo value for this IdentificacionDescripcionVehiculo.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this IdentificacionDescripcionVehiculo.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the color value for this IdentificacionDescripcionVehiculo.
     * 
     * @return color
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getColor() {
        return color;
    }


    /**
     * Sets the color value for this IdentificacionDescripcionVehiculo.
     * 
     * @param color
     */
    public void setColor(es.trafico.www.atex.esquema.CodigoDescripcionAlfa color) {
        this.color = color;
    }


    /**
     * Gets the procedencia value for this IdentificacionDescripcionVehiculo.
     * 
     * @return procedencia
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getProcedencia() {
        return procedencia;
    }


    /**
     * Sets the procedencia value for this IdentificacionDescripcionVehiculo.
     * 
     * @param procedencia
     */
    public void setProcedencia(es.trafico.www.atex.esquema.CodigoDescripcionAlfa procedencia) {
        this.procedencia = procedencia;
    }


    /**
     * Gets the servicio value for this IdentificacionDescripcionVehiculo.
     * 
     * @return servicio
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getServicio() {
        return servicio;
    }


    /**
     * Sets the servicio value for this IdentificacionDescripcionVehiculo.
     * 
     * @param servicio
     */
    public void setServicio(es.trafico.www.atex.esquema.CodigoDescripcionAlfa servicio) {
        this.servicio = servicio;
    }


    /**
     * Gets the tipoVehiculo value for this IdentificacionDescripcionVehiculo.
     * 
     * @return tipoVehiculo
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipoVehiculo() {
        return tipoVehiculo;
    }


    /**
     * Sets the tipoVehiculo value for this IdentificacionDescripcionVehiculo.
     * 
     * @param tipoVehiculo
     */
    public void setTipoVehiculo(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


    /**
     * Gets the tipoIndustria value for this IdentificacionDescripcionVehiculo.
     * 
     * @return tipoIndustria
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipoIndustria() {
        return tipoIndustria;
    }


    /**
     * Sets the tipoIndustria value for this IdentificacionDescripcionVehiculo.
     * 
     * @param tipoIndustria
     */
    public void setTipoIndustria(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipoIndustria) {
        this.tipoIndustria = tipoIndustria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionDescripcionVehiculo)) return false;
        IdentificacionDescripcionVehiculo other = (IdentificacionDescripcionVehiculo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bastidor==null && other.getBastidor()==null) || 
             (this.bastidor!=null &&
              this.bastidor.equals(other.getBastidor()))) &&
            ((this.nive==null && other.getNive()==null) || 
             (this.nive!=null &&
              this.nive.equals(other.getNive()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.procedencia==null && other.getProcedencia()==null) || 
             (this.procedencia!=null &&
              this.procedencia.equals(other.getProcedencia()))) &&
            ((this.servicio==null && other.getServicio()==null) || 
             (this.servicio!=null &&
              this.servicio.equals(other.getServicio()))) &&
            ((this.tipoVehiculo==null && other.getTipoVehiculo()==null) || 
             (this.tipoVehiculo!=null &&
              this.tipoVehiculo.equals(other.getTipoVehiculo()))) &&
            ((this.tipoIndustria==null && other.getTipoIndustria()==null) || 
             (this.tipoIndustria!=null &&
              this.tipoIndustria.equals(other.getTipoIndustria())));
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
        if (getBastidor() != null) {
            _hashCode += getBastidor().hashCode();
        }
        if (getNive() != null) {
            _hashCode += getNive().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getProcedencia() != null) {
            _hashCode += getProcedencia().hashCode();
        }
        if (getServicio() != null) {
            _hashCode += getServicio().hashCode();
        }
        if (getTipoVehiculo() != null) {
            _hashCode += getTipoVehiculo().hashCode();
        }
        if (getTipoIndustria() != null) {
            _hashCode += getTipoIndustria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionDescripcionVehiculo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>DescripcionVehiculo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bastidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Bastidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Nive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Procedencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoVehiculo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoVehiculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIndustria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoIndustria"));
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
