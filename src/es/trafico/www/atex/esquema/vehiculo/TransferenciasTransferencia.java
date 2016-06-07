/**
 * TransferenciasTransferencia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class TransferenciasTransferencia  implements java.io.Serializable {
    private java.util.Date fecha;

    private es.trafico.www.atex.esquema.Jefatura jefatura;

    private es.trafico.www.atex.esquema.Sucursal sucursal;

    private java.lang.String documentoIdAnterior;

    public TransferenciasTransferencia() {
    }

    public TransferenciasTransferencia(
           java.util.Date fecha,
           es.trafico.www.atex.esquema.Jefatura jefatura,
           es.trafico.www.atex.esquema.Sucursal sucursal,
           java.lang.String documentoIdAnterior) {
           this.fecha = fecha;
           this.jefatura = jefatura;
           this.sucursal = sucursal;
           this.documentoIdAnterior = documentoIdAnterior;
    }


    /**
     * Gets the fecha value for this TransferenciasTransferencia.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this TransferenciasTransferencia.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the jefatura value for this TransferenciasTransferencia.
     * 
     * @return jefatura
     */
    public es.trafico.www.atex.esquema.Jefatura getJefatura() {
        return jefatura;
    }


    /**
     * Sets the jefatura value for this TransferenciasTransferencia.
     * 
     * @param jefatura
     */
    public void setJefatura(es.trafico.www.atex.esquema.Jefatura jefatura) {
        this.jefatura = jefatura;
    }


    /**
     * Gets the sucursal value for this TransferenciasTransferencia.
     * 
     * @return sucursal
     */
    public es.trafico.www.atex.esquema.Sucursal getSucursal() {
        return sucursal;
    }


    /**
     * Sets the sucursal value for this TransferenciasTransferencia.
     * 
     * @param sucursal
     */
    public void setSucursal(es.trafico.www.atex.esquema.Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    /**
     * Gets the documentoIdAnterior value for this TransferenciasTransferencia.
     * 
     * @return documentoIdAnterior
     */
    public java.lang.String getDocumentoIdAnterior() {
        return documentoIdAnterior;
    }


    /**
     * Sets the documentoIdAnterior value for this TransferenciasTransferencia.
     * 
     * @param documentoIdAnterior
     */
    public void setDocumentoIdAnterior(java.lang.String documentoIdAnterior) {
        this.documentoIdAnterior = documentoIdAnterior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferenciasTransferencia)) return false;
        TransferenciasTransferencia other = (TransferenciasTransferencia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.jefatura==null && other.getJefatura()==null) || 
             (this.jefatura!=null &&
              this.jefatura.equals(other.getJefatura()))) &&
            ((this.sucursal==null && other.getSucursal()==null) || 
             (this.sucursal!=null &&
              this.sucursal.equals(other.getSucursal()))) &&
            ((this.documentoIdAnterior==null && other.getDocumentoIdAnterior()==null) || 
             (this.documentoIdAnterior!=null &&
              this.documentoIdAnterior.equals(other.getDocumentoIdAnterior())));
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
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getJefatura() != null) {
            _hashCode += getJefatura().hashCode();
        }
        if (getSucursal() != null) {
            _hashCode += getSucursal().hashCode();
        }
        if (getDocumentoIdAnterior() != null) {
            _hashCode += getDocumentoIdAnterior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferenciasTransferencia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Transferencias>Transferencia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Fecha"));
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
        elemField.setFieldName("documentoIdAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentoIdAnterior"));
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
