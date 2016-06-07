/**
 * SolicitudFiliacionSolicitudPersonaFisica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public class SolicitudFiliacionSolicitudPersonaFisica  implements java.io.Serializable {
    private java.lang.String primerApellido;

    private java.lang.String segundoApellido;

    private java.lang.String nombre;

    private java.util.Date fechaNacimiento;

    private java.lang.Integer anyoNacimiento;

    public SolicitudFiliacionSolicitudPersonaFisica() {
    }

    public SolicitudFiliacionSolicitudPersonaFisica(
           java.lang.String primerApellido,
           java.lang.String segundoApellido,
           java.lang.String nombre,
           java.util.Date fechaNacimiento,
           java.lang.Integer anyoNacimiento) {
           this.primerApellido = primerApellido;
           this.segundoApellido = segundoApellido;
           this.nombre = nombre;
           this.fechaNacimiento = fechaNacimiento;
           this.anyoNacimiento = anyoNacimiento;
    }


    /**
     * Gets the primerApellido value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @return primerApellido
     */
    public java.lang.String getPrimerApellido() {
        return primerApellido;
    }


    /**
     * Sets the primerApellido value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @param primerApellido
     */
    public void setPrimerApellido(java.lang.String primerApellido) {
        this.primerApellido = primerApellido;
    }


    /**
     * Gets the segundoApellido value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @return segundoApellido
     */
    public java.lang.String getSegundoApellido() {
        return segundoApellido;
    }


    /**
     * Sets the segundoApellido value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @param segundoApellido
     */
    public void setSegundoApellido(java.lang.String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


    /**
     * Gets the nombre value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the fechaNacimiento value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @return fechaNacimiento
     */
    public java.util.Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the anyoNacimiento value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @return anyoNacimiento
     */
    public java.lang.Integer getAnyoNacimiento() {
        return anyoNacimiento;
    }


    /**
     * Sets the anyoNacimiento value for this SolicitudFiliacionSolicitudPersonaFisica.
     * 
     * @param anyoNacimiento
     */
    public void setAnyoNacimiento(java.lang.Integer anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolicitudFiliacionSolicitudPersonaFisica)) return false;
        SolicitudFiliacionSolicitudPersonaFisica other = (SolicitudFiliacionSolicitudPersonaFisica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.primerApellido==null && other.getPrimerApellido()==null) || 
             (this.primerApellido!=null &&
              this.primerApellido.equals(other.getPrimerApellido()))) &&
            ((this.segundoApellido==null && other.getSegundoApellido()==null) || 
             (this.segundoApellido!=null &&
              this.segundoApellido.equals(other.getSegundoApellido()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.anyoNacimiento==null && other.getAnyoNacimiento()==null) || 
             (this.anyoNacimiento!=null &&
              this.anyoNacimiento.equals(other.getAnyoNacimiento())));
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
        if (getPrimerApellido() != null) {
            _hashCode += getPrimerApellido().hashCode();
        }
        if (getSegundoApellido() != null) {
            _hashCode += getSegundoApellido().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getAnyoNacimiento() != null) {
            _hashCode += getAnyoNacimiento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolicitudFiliacionSolicitudPersonaFisica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">>SolicitudFiliacion>SolicitudPersonaFisica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primerApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "PrimerApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segundoApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SegundoApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyoNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "AnyoNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
