/**
 * ItvsItv.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class ItvsItv  implements java.io.Serializable {
    private java.util.Date fechaItv;

    private java.util.Date fechaCaducidad;

    private java.lang.String estacion;

    private es.trafico.www.atex.esquema.Provincia provincia;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa motivoItv;

    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa resultado;

    private java.lang.String anotacion;

    private java.util.Date fechaFinAnterior;

    private java.lang.Integer kilometraje;

    private java.lang.Integer cuentaHoras;

    private es.trafico.www.atex.esquema.vehiculo.ItvsItvDefectosDefecto[] defectos;

    public ItvsItv() {
    }

    public ItvsItv(
           java.util.Date fechaItv,
           java.util.Date fechaCaducidad,
           java.lang.String estacion,
           es.trafico.www.atex.esquema.Provincia provincia,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa motivoItv,
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa resultado,
           java.lang.String anotacion,
           java.util.Date fechaFinAnterior,
           java.lang.Integer kilometraje,
           java.lang.Integer cuentaHoras,
           es.trafico.www.atex.esquema.vehiculo.ItvsItvDefectosDefecto[] defectos) {
           this.fechaItv = fechaItv;
           this.fechaCaducidad = fechaCaducidad;
           this.estacion = estacion;
           this.provincia = provincia;
           this.motivoItv = motivoItv;
           this.resultado = resultado;
           this.anotacion = anotacion;
           this.fechaFinAnterior = fechaFinAnterior;
           this.kilometraje = kilometraje;
           this.cuentaHoras = cuentaHoras;
           this.defectos = defectos;
    }


    /**
     * Gets the fechaItv value for this ItvsItv.
     * 
     * @return fechaItv
     */
    public java.util.Date getFechaItv() {
        return fechaItv;
    }


    /**
     * Sets the fechaItv value for this ItvsItv.
     * 
     * @param fechaItv
     */
    public void setFechaItv(java.util.Date fechaItv) {
        this.fechaItv = fechaItv;
    }


    /**
     * Gets the fechaCaducidad value for this ItvsItv.
     * 
     * @return fechaCaducidad
     */
    public java.util.Date getFechaCaducidad() {
        return fechaCaducidad;
    }


    /**
     * Sets the fechaCaducidad value for this ItvsItv.
     * 
     * @param fechaCaducidad
     */
    public void setFechaCaducidad(java.util.Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }


    /**
     * Gets the estacion value for this ItvsItv.
     * 
     * @return estacion
     */
    public java.lang.String getEstacion() {
        return estacion;
    }


    /**
     * Sets the estacion value for this ItvsItv.
     * 
     * @param estacion
     */
    public void setEstacion(java.lang.String estacion) {
        this.estacion = estacion;
    }


    /**
     * Gets the provincia value for this ItvsItv.
     * 
     * @return provincia
     */
    public es.trafico.www.atex.esquema.Provincia getProvincia() {
        return provincia;
    }


    /**
     * Sets the provincia value for this ItvsItv.
     * 
     * @param provincia
     */
    public void setProvincia(es.trafico.www.atex.esquema.Provincia provincia) {
        this.provincia = provincia;
    }


    /**
     * Gets the motivoItv value for this ItvsItv.
     * 
     * @return motivoItv
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getMotivoItv() {
        return motivoItv;
    }


    /**
     * Sets the motivoItv value for this ItvsItv.
     * 
     * @param motivoItv
     */
    public void setMotivoItv(es.trafico.www.atex.esquema.CodigoDescripcionAlfa motivoItv) {
        this.motivoItv = motivoItv;
    }


    /**
     * Gets the resultado value for this ItvsItv.
     * 
     * @return resultado
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this ItvsItv.
     * 
     * @param resultado
     */
    public void setResultado(es.trafico.www.atex.esquema.CodigoDescripcionAlfa resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the anotacion value for this ItvsItv.
     * 
     * @return anotacion
     */
    public java.lang.String getAnotacion() {
        return anotacion;
    }


    /**
     * Sets the anotacion value for this ItvsItv.
     * 
     * @param anotacion
     */
    public void setAnotacion(java.lang.String anotacion) {
        this.anotacion = anotacion;
    }


    /**
     * Gets the fechaFinAnterior value for this ItvsItv.
     * 
     * @return fechaFinAnterior
     */
    public java.util.Date getFechaFinAnterior() {
        return fechaFinAnterior;
    }


    /**
     * Sets the fechaFinAnterior value for this ItvsItv.
     * 
     * @param fechaFinAnterior
     */
    public void setFechaFinAnterior(java.util.Date fechaFinAnterior) {
        this.fechaFinAnterior = fechaFinAnterior;
    }


    /**
     * Gets the kilometraje value for this ItvsItv.
     * 
     * @return kilometraje
     */
    public java.lang.Integer getKilometraje() {
        return kilometraje;
    }


    /**
     * Sets the kilometraje value for this ItvsItv.
     * 
     * @param kilometraje
     */
    public void setKilometraje(java.lang.Integer kilometraje) {
        this.kilometraje = kilometraje;
    }


    /**
     * Gets the cuentaHoras value for this ItvsItv.
     * 
     * @return cuentaHoras
     */
    public java.lang.Integer getCuentaHoras() {
        return cuentaHoras;
    }


    /**
     * Sets the cuentaHoras value for this ItvsItv.
     * 
     * @param cuentaHoras
     */
    public void setCuentaHoras(java.lang.Integer cuentaHoras) {
        this.cuentaHoras = cuentaHoras;
    }


    /**
     * Gets the defectos value for this ItvsItv.
     * 
     * @return defectos
     */
    public es.trafico.www.atex.esquema.vehiculo.ItvsItvDefectosDefecto[] getDefectos() {
        return defectos;
    }


    /**
     * Sets the defectos value for this ItvsItv.
     * 
     * @param defectos
     */
    public void setDefectos(es.trafico.www.atex.esquema.vehiculo.ItvsItvDefectosDefecto[] defectos) {
        this.defectos = defectos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItvsItv)) return false;
        ItvsItv other = (ItvsItv) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaItv==null && other.getFechaItv()==null) || 
             (this.fechaItv!=null &&
              this.fechaItv.equals(other.getFechaItv()))) &&
            ((this.fechaCaducidad==null && other.getFechaCaducidad()==null) || 
             (this.fechaCaducidad!=null &&
              this.fechaCaducidad.equals(other.getFechaCaducidad()))) &&
            ((this.estacion==null && other.getEstacion()==null) || 
             (this.estacion!=null &&
              this.estacion.equals(other.getEstacion()))) &&
            ((this.provincia==null && other.getProvincia()==null) || 
             (this.provincia!=null &&
              this.provincia.equals(other.getProvincia()))) &&
            ((this.motivoItv==null && other.getMotivoItv()==null) || 
             (this.motivoItv!=null &&
              this.motivoItv.equals(other.getMotivoItv()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.anotacion==null && other.getAnotacion()==null) || 
             (this.anotacion!=null &&
              this.anotacion.equals(other.getAnotacion()))) &&
            ((this.fechaFinAnterior==null && other.getFechaFinAnterior()==null) || 
             (this.fechaFinAnterior!=null &&
              this.fechaFinAnterior.equals(other.getFechaFinAnterior()))) &&
            ((this.kilometraje==null && other.getKilometraje()==null) || 
             (this.kilometraje!=null &&
              this.kilometraje.equals(other.getKilometraje()))) &&
            ((this.cuentaHoras==null && other.getCuentaHoras()==null) || 
             (this.cuentaHoras!=null &&
              this.cuentaHoras.equals(other.getCuentaHoras()))) &&
            ((this.defectos==null && other.getDefectos()==null) || 
             (this.defectos!=null &&
              java.util.Arrays.equals(this.defectos, other.getDefectos())));
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
        if (getFechaItv() != null) {
            _hashCode += getFechaItv().hashCode();
        }
        if (getFechaCaducidad() != null) {
            _hashCode += getFechaCaducidad().hashCode();
        }
        if (getEstacion() != null) {
            _hashCode += getEstacion().hashCode();
        }
        if (getProvincia() != null) {
            _hashCode += getProvincia().hashCode();
        }
        if (getMotivoItv() != null) {
            _hashCode += getMotivoItv().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getAnotacion() != null) {
            _hashCode += getAnotacion().hashCode();
        }
        if (getFechaFinAnterior() != null) {
            _hashCode += getFechaFinAnterior().hashCode();
        }
        if (getKilometraje() != null) {
            _hashCode += getKilometraje().hashCode();
        }
        if (getCuentaHoras() != null) {
            _hashCode += getCuentaHoras().hashCode();
        }
        if (getDefectos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefectos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefectos(), i);
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
        new org.apache.axis.description.TypeDesc(ItvsItv.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Itvs>Itv"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaItv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaItv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCaducidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaCaducidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provincia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Provincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">Provincia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoItv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MotivoItv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaFinAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaFinAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kilometraje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Kilometraje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaHoras");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CuentaHoras"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Defectos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>>Itvs>Itv>Defectos>Defecto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Defecto"));
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
