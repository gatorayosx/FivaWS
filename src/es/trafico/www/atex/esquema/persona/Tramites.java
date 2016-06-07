/**
 * Tramites.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.persona;

public class Tramites  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.Tramite[] expediciones;

    private es.trafico.www.atex.esquema.Tramite[] prorrogas;

    private es.trafico.www.atex.esquema.Tramite[] duplicados;

    public Tramites() {
    }

    public Tramites(
           es.trafico.www.atex.esquema.Tramite[] expediciones,
           es.trafico.www.atex.esquema.Tramite[] prorrogas,
           es.trafico.www.atex.esquema.Tramite[] duplicados) {
           this.expediciones = expediciones;
           this.prorrogas = prorrogas;
           this.duplicados = duplicados;
    }


    /**
     * Gets the expediciones value for this Tramites.
     * 
     * @return expediciones
     */
    public es.trafico.www.atex.esquema.Tramite[] getExpediciones() {
        return expediciones;
    }


    /**
     * Sets the expediciones value for this Tramites.
     * 
     * @param expediciones
     */
    public void setExpediciones(es.trafico.www.atex.esquema.Tramite[] expediciones) {
        this.expediciones = expediciones;
    }


    /**
     * Gets the prorrogas value for this Tramites.
     * 
     * @return prorrogas
     */
    public es.trafico.www.atex.esquema.Tramite[] getProrrogas() {
        return prorrogas;
    }


    /**
     * Sets the prorrogas value for this Tramites.
     * 
     * @param prorrogas
     */
    public void setProrrogas(es.trafico.www.atex.esquema.Tramite[] prorrogas) {
        this.prorrogas = prorrogas;
    }


    /**
     * Gets the duplicados value for this Tramites.
     * 
     * @return duplicados
     */
    public es.trafico.www.atex.esquema.Tramite[] getDuplicados() {
        return duplicados;
    }


    /**
     * Sets the duplicados value for this Tramites.
     * 
     * @param duplicados
     */
    public void setDuplicados(es.trafico.www.atex.esquema.Tramite[] duplicados) {
        this.duplicados = duplicados;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tramites)) return false;
        Tramites other = (Tramites) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.expediciones==null && other.getExpediciones()==null) || 
             (this.expediciones!=null &&
              java.util.Arrays.equals(this.expediciones, other.getExpediciones()))) &&
            ((this.prorrogas==null && other.getProrrogas()==null) || 
             (this.prorrogas!=null &&
              java.util.Arrays.equals(this.prorrogas, other.getProrrogas()))) &&
            ((this.duplicados==null && other.getDuplicados()==null) || 
             (this.duplicados!=null &&
              java.util.Arrays.equals(this.duplicados, other.getDuplicados())));
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
        if (getExpediciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpediciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpediciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProrrogas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProrrogas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProrrogas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDuplicados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicados(), i);
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
        new org.apache.axis.description.TypeDesc(Tramites.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Tramites"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expediciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Expediciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Expedicion"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prorrogas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Prorrogas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Prorroga"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duplicados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Duplicado"));
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
