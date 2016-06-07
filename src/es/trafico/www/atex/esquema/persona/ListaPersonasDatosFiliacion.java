/**
 * ListaPersonasDatosFiliacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.persona;

public class ListaPersonasDatosFiliacion  implements java.io.Serializable {
    private java.lang.String filiacion;

    private java.lang.String documentoId;

    private java.util.Date fechaNacimiento;

    public ListaPersonasDatosFiliacion() {
    }

    public ListaPersonasDatosFiliacion(
           java.lang.String filiacion,
           java.lang.String documentoId,
           java.util.Date fechaNacimiento) {
           this.filiacion = filiacion;
           this.documentoId = documentoId;
           this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the filiacion value for this ListaPersonasDatosFiliacion.
     * 
     * @return filiacion
     */
    public java.lang.String getFiliacion() {
        return filiacion;
    }


    /**
     * Sets the filiacion value for this ListaPersonasDatosFiliacion.
     * 
     * @param filiacion
     */
    public void setFiliacion(java.lang.String filiacion) {
        this.filiacion = filiacion;
    }


    /**
     * Gets the documentoId value for this ListaPersonasDatosFiliacion.
     * 
     * @return documentoId
     */
    public java.lang.String getDocumentoId() {
        return documentoId;
    }


    /**
     * Sets the documentoId value for this ListaPersonasDatosFiliacion.
     * 
     * @param documentoId
     */
    public void setDocumentoId(java.lang.String documentoId) {
        this.documentoId = documentoId;
    }


    /**
     * Gets the fechaNacimiento value for this ListaPersonasDatosFiliacion.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this ListaPersonasDatosFiliacion.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListaPersonasDatosFiliacion)) return false;
        ListaPersonasDatosFiliacion other = (ListaPersonasDatosFiliacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filiacion==null && other.getFiliacion()==null) || 
             (this.filiacion!=null &&
              this.filiacion.equals(other.getFiliacion()))) &&
            ((this.documentoId==null && other.getDocumentoId()==null) || 
             (this.documentoId!=null &&
              this.documentoId.equals(other.getDocumentoId()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento())));
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
        if (getFiliacion() != null) {
            _hashCode += getFiliacion().hashCode();
        }
        if (getDocumentoId() != null) {
            _hashCode += getDocumentoId().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListaPersonasDatosFiliacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>ListaPersonas>DatosFiliacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filiacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Filiacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
