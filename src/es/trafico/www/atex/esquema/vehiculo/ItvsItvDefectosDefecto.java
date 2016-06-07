/**
 * ItvsItvDefectosDefecto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class ItvsItvDefectosDefecto  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa gravedad;

    public ItvsItvDefectosDefecto() {
    }

    public ItvsItvDefectosDefecto(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa gravedad) {
           this.tipo = tipo;
           this.gravedad = gravedad;
    }


    /**
     * Gets the tipo value for this ItvsItvDefectosDefecto.
     * 
     * @return tipo
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ItvsItvDefectosDefecto.
     * 
     * @param tipo
     */
    public void setTipo(es.trafico.www.atex.esquema.CodigoDescripcionAlfa tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the gravedad value for this ItvsItvDefectosDefecto.
     * 
     * @return gravedad
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getGravedad() {
        return gravedad;
    }


    /**
     * Sets the gravedad value for this ItvsItvDefectosDefecto.
     * 
     * @param gravedad
     */
    public void setGravedad(es.trafico.www.atex.esquema.CodigoDescripcionAlfa gravedad) {
        this.gravedad = gravedad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItvsItvDefectosDefecto)) return false;
        ItvsItvDefectosDefecto other = (ItvsItvDefectosDefecto) obj;
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
            ((this.gravedad==null && other.getGravedad()==null) || 
             (this.gravedad!=null &&
              this.gravedad.equals(other.getGravedad())));
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
        if (getGravedad() != null) {
            _hashCode += getGravedad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItvsItvDefectosDefecto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>>Itvs>Itv>Defectos>Defecto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gravedad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Gravedad"));
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
