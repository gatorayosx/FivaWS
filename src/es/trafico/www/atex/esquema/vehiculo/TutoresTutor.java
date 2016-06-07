/**
 * TutoresTutor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class TutoresTutor  implements java.io.Serializable {
    private java.lang.String documentoId;

    private java.lang.String tramite;

    private java.util.Date fechaTramite;

    public TutoresTutor() {
    }

    public TutoresTutor(
           java.lang.String documentoId,
           java.lang.String tramite,
           java.util.Date fechaTramite) {
           this.documentoId = documentoId;
           this.tramite = tramite;
           this.fechaTramite = fechaTramite;
    }


    /**
     * Gets the documentoId value for this TutoresTutor.
     * 
     * @return documentoId
     */
    public java.lang.String getDocumentoId() {
        return documentoId;
    }


    /**
     * Sets the documentoId value for this TutoresTutor.
     * 
     * @param documentoId
     */
    public void setDocumentoId(java.lang.String documentoId) {
        this.documentoId = documentoId;
    }


    /**
     * Gets the tramite value for this TutoresTutor.
     * 
     * @return tramite
     */
    public java.lang.String getTramite() {
        return tramite;
    }


    /**
     * Sets the tramite value for this TutoresTutor.
     * 
     * @param tramite
     */
    public void setTramite(java.lang.String tramite) {
        this.tramite = tramite;
    }


    /**
     * Gets the fechaTramite value for this TutoresTutor.
     * 
     * @return fechaTramite
     */
    public java.util.Date getFechaTramite() {
        return fechaTramite;
    }


    /**
     * Sets the fechaTramite value for this TutoresTutor.
     * 
     * @param fechaTramite
     */
    public void setFechaTramite(java.util.Date fechaTramite) {
        this.fechaTramite = fechaTramite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TutoresTutor)) return false;
        TutoresTutor other = (TutoresTutor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentoId==null && other.getDocumentoId()==null) || 
             (this.documentoId!=null &&
              this.documentoId.equals(other.getDocumentoId()))) &&
            ((this.tramite==null && other.getTramite()==null) || 
             (this.tramite!=null &&
              this.tramite.equals(other.getTramite()))) &&
            ((this.fechaTramite==null && other.getFechaTramite()==null) || 
             (this.fechaTramite!=null &&
              this.fechaTramite.equals(other.getFechaTramite())));
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
        if (getDocumentoId() != null) {
            _hashCode += getDocumentoId().hashCode();
        }
        if (getTramite() != null) {
            _hashCode += getTramite().hashCode();
        }
        if (getFechaTramite() != null) {
            _hashCode += getFechaTramite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TutoresTutor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Tutores>Tutor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tramite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaTramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
