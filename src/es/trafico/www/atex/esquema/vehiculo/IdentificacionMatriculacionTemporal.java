/**
 * IdentificacionMatriculacionTemporal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionMatriculacionTemporal  implements java.io.Serializable {
    private java.lang.String matriculaAnterior;

    private java.util.Date fechaPrimeraMatriculacion;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporalFechasProrrogaFechaProrroga[] fechasProrroga;

    private java.lang.String anotacion;

    public IdentificacionMatriculacionTemporal() {
    }

    public IdentificacionMatriculacionTemporal(
           java.lang.String matriculaAnterior,
           java.util.Date fechaPrimeraMatriculacion,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporalFechasProrrogaFechaProrroga[] fechasProrroga,
           java.lang.String anotacion) {
           this.matriculaAnterior = matriculaAnterior;
           this.fechaPrimeraMatriculacion = fechaPrimeraMatriculacion;
           this.fechasProrroga = fechasProrroga;
           this.anotacion = anotacion;
    }


    /**
     * Gets the matriculaAnterior value for this IdentificacionMatriculacionTemporal.
     * 
     * @return matriculaAnterior
     */
    public java.lang.String getMatriculaAnterior() {
        return matriculaAnterior;
    }


    /**
     * Sets the matriculaAnterior value for this IdentificacionMatriculacionTemporal.
     * 
     * @param matriculaAnterior
     */
    public void setMatriculaAnterior(java.lang.String matriculaAnterior) {
        this.matriculaAnterior = matriculaAnterior;
    }


    /**
     * Gets the fechaPrimeraMatriculacion value for this IdentificacionMatriculacionTemporal.
     * 
     * @return fechaPrimeraMatriculacion
     */
    public java.util.Date getFechaPrimeraMatriculacion() {
        return fechaPrimeraMatriculacion;
    }


    /**
     * Sets the fechaPrimeraMatriculacion value for this IdentificacionMatriculacionTemporal.
     * 
     * @param fechaPrimeraMatriculacion
     */
    public void setFechaPrimeraMatriculacion(java.util.Date fechaPrimeraMatriculacion) {
        this.fechaPrimeraMatriculacion = fechaPrimeraMatriculacion;
    }


    /**
     * Gets the fechasProrroga value for this IdentificacionMatriculacionTemporal.
     * 
     * @return fechasProrroga
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporalFechasProrrogaFechaProrroga[] getFechasProrroga() {
        return fechasProrroga;
    }


    /**
     * Sets the fechasProrroga value for this IdentificacionMatriculacionTemporal.
     * 
     * @param fechasProrroga
     */
    public void setFechasProrroga(es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporalFechasProrrogaFechaProrroga[] fechasProrroga) {
        this.fechasProrroga = fechasProrroga;
    }


    /**
     * Gets the anotacion value for this IdentificacionMatriculacionTemporal.
     * 
     * @return anotacion
     */
    public java.lang.String getAnotacion() {
        return anotacion;
    }


    /**
     * Sets the anotacion value for this IdentificacionMatriculacionTemporal.
     * 
     * @param anotacion
     */
    public void setAnotacion(java.lang.String anotacion) {
        this.anotacion = anotacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionMatriculacionTemporal)) return false;
        IdentificacionMatriculacionTemporal other = (IdentificacionMatriculacionTemporal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matriculaAnterior==null && other.getMatriculaAnterior()==null) || 
             (this.matriculaAnterior!=null &&
              this.matriculaAnterior.equals(other.getMatriculaAnterior()))) &&
            ((this.fechaPrimeraMatriculacion==null && other.getFechaPrimeraMatriculacion()==null) || 
             (this.fechaPrimeraMatriculacion!=null &&
              this.fechaPrimeraMatriculacion.equals(other.getFechaPrimeraMatriculacion()))) &&
            ((this.fechasProrroga==null && other.getFechasProrroga()==null) || 
             (this.fechasProrroga!=null &&
              java.util.Arrays.equals(this.fechasProrroga, other.getFechasProrroga()))) &&
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
        if (getMatriculaAnterior() != null) {
            _hashCode += getMatriculaAnterior().hashCode();
        }
        if (getFechaPrimeraMatriculacion() != null) {
            _hashCode += getFechaPrimeraMatriculacion().hashCode();
        }
        if (getFechasProrroga() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFechasProrroga());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFechasProrroga(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnotacion() != null) {
            _hashCode += getAnotacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionMatriculacionTemporal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>MatriculacionTemporal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculaAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MatriculaAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPrimeraMatriculacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaPrimeraMatriculacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechasProrroga");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechasProrroga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>>Identificacion>MatriculacionTemporal>FechasProrroga>FechaProrroga"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "FechaProrroga"));
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
