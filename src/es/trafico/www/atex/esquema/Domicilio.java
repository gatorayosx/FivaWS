/**
 * Domicilio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema;

public class Domicilio  implements java.io.Serializable {
    private java.lang.String calle;

    private java.lang.String pueblo;

    private java.lang.String municipio;

    private es.trafico.www.atex.esquema.Provincia provincia;

    private java.lang.String codigoPostal;

    public Domicilio() {
    }

    public Domicilio(
           java.lang.String calle,
           java.lang.String pueblo,
           java.lang.String municipio,
           es.trafico.www.atex.esquema.Provincia provincia,
           java.lang.String codigoPostal) {
           this.calle = calle;
           this.pueblo = pueblo;
           this.municipio = municipio;
           this.provincia = provincia;
           this.codigoPostal = codigoPostal;
    }


    /**
     * Gets the calle value for this Domicilio.
     * 
     * @return calle
     */
    public java.lang.String getCalle() {
        return calle;
    }


    /**
     * Sets the calle value for this Domicilio.
     * 
     * @param calle
     */
    public void setCalle(java.lang.String calle) {
        this.calle = calle;
    }


    /**
     * Gets the pueblo value for this Domicilio.
     * 
     * @return pueblo
     */
    public java.lang.String getPueblo() {
        return pueblo;
    }


    /**
     * Sets the pueblo value for this Domicilio.
     * 
     * @param pueblo
     */
    public void setPueblo(java.lang.String pueblo) {
        this.pueblo = pueblo;
    }


    /**
     * Gets the municipio value for this Domicilio.
     * 
     * @return municipio
     */
    public java.lang.String getMunicipio() {
        return municipio;
    }


    /**
     * Sets the municipio value for this Domicilio.
     * 
     * @param municipio
     */
    public void setMunicipio(java.lang.String municipio) {
        this.municipio = municipio;
    }


    /**
     * Gets the provincia value for this Domicilio.
     * 
     * @return provincia
     */
    public es.trafico.www.atex.esquema.Provincia getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this Domicilio.
     * 
     * @param provincia
     */
    public void setProvincia(es.trafico.www.atex.esquema.Provincia provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the codigoPostal value for this Domicilio.
     * 
     * @return codigoPostal
     */
    public java.lang.String getCodigoPostal() {
        return codigoPostal;
    }


    /**
     * Sets the codigoPostal value for this Domicilio.
     * 
     * @param codigoPostal
     */
    public void setCodigoPostal(java.lang.String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Domicilio)) return false;
        Domicilio other = (Domicilio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calle==null && other.getCalle()==null) || 
             (this.calle!=null &&
              this.calle.equals(other.getCalle()))) &&
            ((this.pueblo==null && other.getPueblo()==null) || 
             (this.pueblo!=null &&
              this.pueblo.equals(other.getPueblo()))) &&
            ((this.municipio==null && other.getMunicipio()==null) || 
             (this.municipio!=null &&
              this.municipio.equals(other.getMunicipio()))) &&
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
            ((this.codigoPostal==null && other.getCodigoPostal()==null) || 
             (this.codigoPostal!=null &&
              this.codigoPostal.equals(other.getCodigoPostal())));
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
        if (getCalle() != null) {
            _hashCode += getCalle().hashCode();
        }
        if (getPueblo() != null) {
            _hashCode += getPueblo().hashCode();
        }
        if (getMunicipio() != null) {
            _hashCode += getMunicipio().hashCode();
        }
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getCodigoPostal() != null) {
            _hashCode += getCodigoPostal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Domicilio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Domicilio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Calle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pueblo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Pueblo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Municipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">Provincia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPostal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoPostal"));
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
