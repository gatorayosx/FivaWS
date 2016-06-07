/**
 * DatosPersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema;

public class DatosPersonaFisica  implements java.io.Serializable {
    private java.lang.String documentoId;

    private java.lang.String apellido1;

    private java.lang.String apellido2;

    private java.lang.String nombre;

    private java.lang.String sexo;

    private java.util.Date fechaNacimiento;

    public DatosPersonaFisica() {
    }

    public DatosPersonaFisica(
           java.lang.String documentoId,
           java.lang.String apellido1,
           java.lang.String apellido2,
           java.lang.String nombre,
           java.lang.String sexo,
           java.util.Date fechaNacimiento) {
           this.documentoId = documentoId;
           this.apellido1 = apellido1;
           this.apellido2 = apellido2;
           this.nombre = nombre;
           this.sexo = sexo;
           this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the documentoId value for this DatosPersonaFisica.
     * 
     * @return documentoId
     */
    public java.lang.String getDocumentoId() {
        return documentoId;
    }


    /**
     * Sets the documentoId value for this DatosPersonaFisica.
     * 
     * @param documentoId
     */
    public void setDocumentoId(java.lang.String documentoId) {
        this.documentoId = documentoId;
    }


    /**
     * Gets the apellido1 value for this DatosPersonaFisica.
     * 
     * @return apellido1
     */
    public java.lang.String getApellido1() {
        return apellido1;
    }


    /**
     * Sets the apellido1 value for this DatosPersonaFisica.
     * 
     * @param apellido1
     */
    public void setApellido1(java.lang.String apellido1) {
        this.apellido1 = apellido1;
    }


    /**
     * Gets the apellido2 value for this DatosPersonaFisica.
     * 
     * @return apellido2
     */
    public java.lang.String getApellido2() {
        return apellido2;
    }


    /**
     * Sets the apellido2 value for this DatosPersonaFisica.
     * 
     * @param apellido2
     */
    public void setApellido2(java.lang.String apellido2) {
        this.apellido2 = apellido2;
    }


    /**
     * Gets the nombre value for this DatosPersonaFisica.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DatosPersonaFisica.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the sexo value for this DatosPersonaFisica.
     * 
     * @return sexo
     */
    public java.lang.String getSexo() {
        return sexo;
    }


    /**
     * Sets the sexo value for this DatosPersonaFisica.
     * 
     * @param sexo
     */
    public void setSexo(java.lang.String sexo) {
        this.sexo = sexo;
    }


    /**
     * Gets the fechaNacimiento value for this DatosPersonaFisica.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this DatosPersonaFisica.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosPersonaFisica)) return false;
        DatosPersonaFisica other = (DatosPersonaFisica) obj;
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
            ((this.apellido1==null && other.getApellido1()==null) || 
             (this.apellido1!=null &&
              this.apellido1.equals(other.getApellido1()))) &&
            ((this.apellido2==null && other.getApellido2()==null) || 
             (this.apellido2!=null &&
              this.apellido2.equals(other.getApellido2()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.sexo==null && other.getSexo()==null) || 
             (this.sexo!=null &&
              this.sexo.equals(other.getSexo()))) &&
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
        if (getDocumentoId() != null) {
            _hashCode += getDocumentoId().hashCode();
        }
        if (getApellido1() != null) {
            _hashCode += getApellido1().hashCode();
        }
        if (getApellido2() != null) {
            _hashCode += getApellido2().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getSexo() != null) {
            _hashCode += getSexo().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosPersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">datosPersona>Fisica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "DocumentoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Apellido1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Apellido2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Sexo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "FechaNacimiento"));
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
