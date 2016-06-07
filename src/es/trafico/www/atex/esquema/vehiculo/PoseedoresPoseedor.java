/**
 * PoseedoresPoseedor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class PoseedoresPoseedor  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa situacion;

    private java.util.Date fecha;

    private es.trafico.www.atex.esquema.Jefatura jefatura;

    private es.trafico.www.atex.esquema.Sucursal sucursal;

    private java.lang.String filiacion;

    private java.lang.String documentoId;

    private es.trafico.www.atex.esquema.Domicilio domicilio;

    private java.lang.String anotacion;

    public PoseedoresPoseedor() {
    }

    public PoseedoresPoseedor(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa situacion,
           java.util.Date fecha,
           es.trafico.www.atex.esquema.Jefatura jefatura,
           es.trafico.www.atex.esquema.Sucursal sucursal,
           java.lang.String filiacion,
           java.lang.String documentoId,
           es.trafico.www.atex.esquema.Domicilio domicilio,
           java.lang.String anotacion) {
           this.situacion = situacion;
           this.fecha = fecha;
           this.jefatura = jefatura;
           this.sucursal = sucursal;
           this.filiacion = filiacion;
           this.documentoId = documentoId;
           this.domicilio = domicilio;
           this.anotacion = anotacion;
    }


    /**
     * Gets the situacion value for this PoseedoresPoseedor.
     * 
     * @return situacion
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getSituacion() {
        return situacion;
    }


    /**
     * Sets the situacion value for this PoseedoresPoseedor.
     * 
     * @param situacion
     */
    public void setSituacion(es.trafico.www.atex.esquema.CodigoDescripcionAlfa situacion) {
        this.situacion = situacion;
    }


    /**
     * Gets the fecha value for this PoseedoresPoseedor.
     * 
     * @return fecha
     */
    public java.util.Date getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this PoseedoresPoseedor.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Date fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the jefatura value for this PoseedoresPoseedor.
     * 
     * @return jefatura
     */
    public es.trafico.www.atex.esquema.Jefatura getJefatura() {
        return jefatura;
    }


    /**
     * Sets the jefatura value for this PoseedoresPoseedor.
     * 
     * @param jefatura
     */
    public void setJefatura(es.trafico.www.atex.esquema.Jefatura jefatura) {
        this.jefatura = jefatura;
    }


    /**
     * Gets the sucursal value for this PoseedoresPoseedor.
     * 
     * @return sucursal
     */
    public es.trafico.www.atex.esquema.Sucursal getSucursal() {
        return sucursal;
    }


    /**
     * Sets the sucursal value for this PoseedoresPoseedor.
     * 
     * @param sucursal
     */
    public void setSucursal(es.trafico.www.atex.esquema.Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    /**
     * Gets the filiacion value for this PoseedoresPoseedor.
     * 
     * @return filiacion
     */
    public java.lang.String getFiliacion() {
        return filiacion;
    }


    /**
     * Sets the filiacion value for this PoseedoresPoseedor.
     * 
     * @param filiacion
     */
    public void setFiliacion(java.lang.String filiacion) {
        this.filiacion = filiacion;
    }


    /**
     * Gets the documentoId value for this PoseedoresPoseedor.
     * 
     * @return documentoId
     */
    public java.lang.String getDocumentoId() {
        return documentoId;
    }


    /**
     * Sets the documentoId value for this PoseedoresPoseedor.
     * 
     * @param documentoId
     */
    public void setDocumentoId(java.lang.String documentoId) {
        this.documentoId = documentoId;
    }


    /**
     * Gets the domicilio value for this PoseedoresPoseedor.
     * 
     * @return domicilio
     */
    public es.trafico.www.atex.esquema.Domicilio getDomicilio() {
        return domicilio;
    }


    /**
     * Sets the domicilio value for this PoseedoresPoseedor.
     * 
     * @param domicilio
     */
    public void setDomicilio(es.trafico.www.atex.esquema.Domicilio domicilio) {
        this.domicilio = domicilio;
    }


    /**
     * Gets the anotacion value for this PoseedoresPoseedor.
     * 
     * @return anotacion
     */
    public java.lang.String getAnotacion() {
        return anotacion;
    }


    /**
     * Sets the anotacion value for this PoseedoresPoseedor.
     * 
     * @param anotacion
     */
    public void setAnotacion(java.lang.String anotacion) {
        this.anotacion = anotacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PoseedoresPoseedor)) return false;
        PoseedoresPoseedor other = (PoseedoresPoseedor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.situacion==null && other.getSituacion()==null) || 
             (this.situacion!=null &&
              this.situacion.equals(other.getSituacion()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.jefatura==null && other.getJefatura()==null) || 
             (this.jefatura!=null &&
              this.jefatura.equals(other.getJefatura()))) &&
            ((this.sucursal==null && other.getSucursal()==null) || 
             (this.sucursal!=null &&
              this.sucursal.equals(other.getSucursal()))) &&
            ((this.filiacion==null && other.getFiliacion()==null) || 
             (this.filiacion!=null &&
              this.filiacion.equals(other.getFiliacion()))) &&
            ((this.documentoId==null && other.getDocumentoId()==null) || 
             (this.documentoId!=null &&
              this.documentoId.equals(other.getDocumentoId()))) &&
            ((this.domicilio==null && other.getDomicilio()==null) || 
             (this.domicilio!=null &&
              this.domicilio.equals(other.getDomicilio()))) &&
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
        if (getSituacion() != null) {
            _hashCode += getSituacion().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getJefatura() != null) {
            _hashCode += getJefatura().hashCode();
        }
        if (getSucursal() != null) {
            _hashCode += getSucursal().hashCode();
        }
        if (getFiliacion() != null) {
            _hashCode += getFiliacion().hashCode();
        }
        if (getDocumentoId() != null) {
            _hashCode += getDocumentoId().hashCode();
        }
        if (getDomicilio() != null) {
            _hashCode += getDomicilio().hashCode();
        }
        if (getAnotacion() != null) {
            _hashCode += getAnotacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PoseedoresPoseedor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Poseedores>Poseedor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Situacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
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
        elemField.setFieldName("filiacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Filiacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocumentoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Domicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Domicilio"));
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
