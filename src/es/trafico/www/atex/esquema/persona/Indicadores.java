/**
 * Indicadores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.persona;

public class Indicadores  implements java.io.Serializable {
    private java.lang.Boolean lentes;

    private java.lang.Boolean condicionRestrictiva;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa funcionAutoescuela;

    private java.lang.Boolean transporteEscolar;

    private java.lang.Boolean mercanciasPeligrosas;

    public Indicadores() {
    }

    public Indicadores(
           java.lang.Boolean lentes,
           java.lang.Boolean condicionRestrictiva,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa funcionAutoescuela,
           java.lang.Boolean transporteEscolar,
           java.lang.Boolean mercanciasPeligrosas) {
           this.lentes = lentes;
           this.condicionRestrictiva = condicionRestrictiva;
           this.funcionAutoescuela = funcionAutoescuela;
           this.transporteEscolar = transporteEscolar;
           this.mercanciasPeligrosas = mercanciasPeligrosas;
    }


    /**
     * Gets the lentes value for this Indicadores.
     * 
     * @return lentes
     */
    public java.lang.Boolean getLentes() {
        return lentes;
    }


    /**
     * Sets the lentes value for this Indicadores.
     * 
     * @param lentes
     */
    public void setLentes(java.lang.Boolean lentes) {
        this.lentes = lentes;
    }


    /**
     * Gets the condicionRestrictiva value for this Indicadores.
     * 
     * @return condicionRestrictiva
     */
    public java.lang.Boolean getCondicionRestrictiva() {
        return condicionRestrictiva;
    }


    /**
     * Sets the condicionRestrictiva value for this Indicadores.
     * 
     * @param condicionRestrictiva
     */
    public void setCondicionRestrictiva(java.lang.Boolean condicionRestrictiva) {
        this.condicionRestrictiva = condicionRestrictiva;
    }


    /**
     * Gets the funcionAutoescuela value for this Indicadores.
     * 
     * @return funcionAutoescuela
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getFuncionAutoescuela() {
        return funcionAutoescuela;
    }


    /**
     * Sets the funcionAutoescuela value for this Indicadores.
     * 
     * @param funcionAutoescuela
     */
    public void setFuncionAutoescuela(es.trafico.www.atex.esquema.CodigoDescripcionAlfa funcionAutoescuela) {
        this.funcionAutoescuela = funcionAutoescuela;
    }


    /**
     * Gets the transporteEscolar value for this Indicadores.
     * 
     * @return transporteEscolar
     */
    public java.lang.Boolean getTransporteEscolar() {
        return transporteEscolar;
    }


    /**
     * Sets the transporteEscolar value for this Indicadores.
     * 
     * @param transporteEscolar
     */
    public void setTransporteEscolar(java.lang.Boolean transporteEscolar) {
        this.transporteEscolar = transporteEscolar;
    }


    /**
     * Gets the mercanciasPeligrosas value for this Indicadores.
     * 
     * @return mercanciasPeligrosas
     */
    public java.lang.Boolean getMercanciasPeligrosas() {
        return mercanciasPeligrosas;
    }


    /**
     * Sets the mercanciasPeligrosas value for this Indicadores.
     * 
     * @param mercanciasPeligrosas
     */
    public void setMercanciasPeligrosas(java.lang.Boolean mercanciasPeligrosas) {
        this.mercanciasPeligrosas = mercanciasPeligrosas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Indicadores)) return false;
        Indicadores other = (Indicadores) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lentes==null && other.getLentes()==null) || 
             (this.lentes!=null &&
              this.lentes.equals(other.getLentes()))) &&
            ((this.condicionRestrictiva==null && other.getCondicionRestrictiva()==null) || 
             (this.condicionRestrictiva!=null &&
              this.condicionRestrictiva.equals(other.getCondicionRestrictiva()))) &&
            ((this.funcionAutoescuela==null && other.getFuncionAutoescuela()==null) || 
             (this.funcionAutoescuela!=null &&
              this.funcionAutoescuela.equals(other.getFuncionAutoescuela()))) &&
            ((this.transporteEscolar==null && other.getTransporteEscolar()==null) || 
             (this.transporteEscolar!=null &&
              this.transporteEscolar.equals(other.getTransporteEscolar()))) &&
            ((this.mercanciasPeligrosas==null && other.getMercanciasPeligrosas()==null) || 
             (this.mercanciasPeligrosas!=null &&
              this.mercanciasPeligrosas.equals(other.getMercanciasPeligrosas())));
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
        if (getLentes() != null) {
            _hashCode += getLentes().hashCode();
        }
        if (getCondicionRestrictiva() != null) {
            _hashCode += getCondicionRestrictiva().hashCode();
        }
        if (getFuncionAutoescuela() != null) {
            _hashCode += getFuncionAutoescuela().hashCode();
        }
        if (getTransporteEscolar() != null) {
            _hashCode += getTransporteEscolar().hashCode();
        }
        if (getMercanciasPeligrosas() != null) {
            _hashCode += getMercanciasPeligrosas().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Indicadores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Indicadores"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lentes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Lentes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicionRestrictiva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CondicionRestrictiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionAutoescuela");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FuncionAutoescuela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transporteEscolar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransporteEscolar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mercanciasPeligrosas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MercanciasPeligrosas"));
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
