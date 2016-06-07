/**
 * Identificacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class Identificacion  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacion matriculacion;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionDescripcionVehiculo descripcionVehiculo;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicos datosTecnicos;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporal matriculacionTemporal;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionRematriculacionesRematriculacion[] rematriculaciones;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionFechasControl fechasControl;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionIndicadores indicadores;

    public Identificacion() {
    }

    public Identificacion(
           es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacion matriculacion,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionDescripcionVehiculo descripcionVehiculo,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicos datosTecnicos,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporal matriculacionTemporal,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionRematriculacionesRematriculacion[] rematriculaciones,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionFechasControl fechasControl,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionIndicadores indicadores) {
           this.matriculacion = matriculacion;
           this.descripcionVehiculo = descripcionVehiculo;
           this.datosTecnicos = datosTecnicos;
           this.matriculacionTemporal = matriculacionTemporal;
           this.rematriculaciones = rematriculaciones;
           this.fechasControl = fechasControl;
           this.indicadores = indicadores;
    }


    /**
     * Gets the matriculacion value for this Identificacion.
     * 
     * @return matriculacion
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacion getMatriculacion() {
        return matriculacion;
    }


    /**
     * Sets the matriculacion value for this Identificacion.
     * 
     * @param matriculacion
     */
    public void setMatriculacion(es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacion matriculacion) {
        this.matriculacion = matriculacion;
    }


    /**
     * Gets the descripcionVehiculo value for this Identificacion.
     * 
     * @return descripcionVehiculo
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionDescripcionVehiculo getDescripcionVehiculo() {
        return descripcionVehiculo;
    }


    /**
     * Sets the descripcionVehiculo value for this Identificacion.
     * 
     * @param descripcionVehiculo
     */
    public void setDescripcionVehiculo(es.trafico.www.atex.esquema.vehiculo.IdentificacionDescripcionVehiculo descripcionVehiculo) {
        this.descripcionVehiculo = descripcionVehiculo;
    }


    /**
     * Gets the datosTecnicos value for this Identificacion.
     * 
     * @return datosTecnicos
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicos getDatosTecnicos() {
        return datosTecnicos;
    }


    /**
     * Sets the datosTecnicos value for this Identificacion.
     * 
     * @param datosTecnicos
     */
    public void setDatosTecnicos(es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicos datosTecnicos) {
        this.datosTecnicos = datosTecnicos;
    }


    /**
     * Gets the matriculacionTemporal value for this Identificacion.
     * 
     * @return matriculacionTemporal
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporal getMatriculacionTemporal() {
        return matriculacionTemporal;
    }


    /**
     * Sets the matriculacionTemporal value for this Identificacion.
     * 
     * @param matriculacionTemporal
     */
    public void setMatriculacionTemporal(es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporal matriculacionTemporal) {
        this.matriculacionTemporal = matriculacionTemporal;
    }


    /**
     * Gets the rematriculaciones value for this Identificacion.
     * 
     * @return rematriculaciones
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionRematriculacionesRematriculacion[] getRematriculaciones() {
        return rematriculaciones;
    }


    /**
     * Sets the rematriculaciones value for this Identificacion.
     * 
     * @param rematriculaciones
     */
    public void setRematriculaciones(es.trafico.www.atex.esquema.vehiculo.IdentificacionRematriculacionesRematriculacion[] rematriculaciones) {
        this.rematriculaciones = rematriculaciones;
    }


    /**
     * Gets the fechasControl value for this Identificacion.
     * 
     * @return fechasControl
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionFechasControl getFechasControl() {
        return fechasControl;
    }


    /**
     * Sets the fechasControl value for this Identificacion.
     * 
     * @param fechasControl
     */
    public void setFechasControl(es.trafico.www.atex.esquema.vehiculo.IdentificacionFechasControl fechasControl) {
        this.fechasControl = fechasControl;
    }


    /**
     * Gets the indicadores value for this Identificacion.
     * 
     * @return indicadores
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionIndicadores getIndicadores() {
        return indicadores;
    }


    /**
     * Sets the indicadores value for this Identificacion.
     * 
     * @param indicadores
     */
    public void setIndicadores(es.trafico.www.atex.esquema.vehiculo.IdentificacionIndicadores indicadores) {
        this.indicadores = indicadores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Identificacion)) return false;
        Identificacion other = (Identificacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matriculacion==null && other.getMatriculacion()==null) || 
             (this.matriculacion!=null &&
              this.matriculacion.equals(other.getMatriculacion()))) &&
            ((this.descripcionVehiculo==null && other.getDescripcionVehiculo()==null) || 
             (this.descripcionVehiculo!=null &&
              this.descripcionVehiculo.equals(other.getDescripcionVehiculo()))) &&
            ((this.datosTecnicos==null && other.getDatosTecnicos()==null) || 
             (this.datosTecnicos!=null &&
              this.datosTecnicos.equals(other.getDatosTecnicos()))) &&
            ((this.matriculacionTemporal==null && other.getMatriculacionTemporal()==null) || 
             (this.matriculacionTemporal!=null &&
              this.matriculacionTemporal.equals(other.getMatriculacionTemporal()))) &&
            ((this.rematriculaciones==null && other.getRematriculaciones()==null) || 
             (this.rematriculaciones!=null &&
              java.util.Arrays.equals(this.rematriculaciones, other.getRematriculaciones()))) &&
            ((this.fechasControl==null && other.getFechasControl()==null) || 
             (this.fechasControl!=null &&
              this.fechasControl.equals(other.getFechasControl()))) &&
            ((this.indicadores==null && other.getIndicadores()==null) || 
             (this.indicadores!=null &&
              this.indicadores.equals(other.getIndicadores())));
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
        if (getMatriculacion() != null) {
            _hashCode += getMatriculacion().hashCode();
        }
        if (getDescripcionVehiculo() != null) {
            _hashCode += getDescripcionVehiculo().hashCode();
        }
        if (getDatosTecnicos() != null) {
            _hashCode += getDatosTecnicos().hashCode();
        }
        if (getMatriculacionTemporal() != null) {
            _hashCode += getMatriculacionTemporal().hashCode();
        }
        if (getRematriculaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRematriculaciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRematriculaciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFechasControl() != null) {
            _hashCode += getFechasControl().hashCode();
        }
        if (getIndicadores() != null) {
            _hashCode += getIndicadores().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Identificacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Identificacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Matriculacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>Matriculacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionVehiculo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescripcionVehiculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>DescripcionVehiculo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datosTecnicos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DatosTecnicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>DatosTecnicos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculacionTemporal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MatriculacionTemporal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>MatriculacionTemporal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rematriculaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rematriculaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>Rematriculaciones>Rematriculacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Rematriculacion"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechasControl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechasControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>FechasControl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Indicadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>Indicadores"));
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
