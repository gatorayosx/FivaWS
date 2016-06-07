/**
 * IdentificacionDatosTecnicos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class IdentificacionDatosTecnicos  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.CodigoDescripcionAlfa propulsion;

    private java.lang.Float cilindrada;

    private java.lang.Float potenciaFiscal;

    private java.lang.Integer tara;

    private java.lang.Integer pesoMax;

    private es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicosNumPlazas numPlazas;

    private java.lang.String tipoItv;

    private java.lang.String variante;

    private java.lang.String version;

    private java.lang.String numHomologacion;

    private java.lang.Integer masaMaxTecnica;

    private java.lang.Integer masaEnServicio;

    private java.lang.Float potenciaNetaMax;

    private java.lang.Float relacionPotenciaPeso;

    private java.lang.Integer numPlazasPie;

    public IdentificacionDatosTecnicos() {
    }

    public IdentificacionDatosTecnicos(
           es.trafico.www.atex.esquema.CodigoDescripcionAlfa propulsion,
           java.lang.Float cilindrada,
           java.lang.Float potenciaFiscal,
           java.lang.Integer tara,
           java.lang.Integer pesoMax,
           es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicosNumPlazas numPlazas,
           java.lang.String tipoItv,
           java.lang.String variante,
           java.lang.String version,
           java.lang.String numHomologacion,
           java.lang.Integer masaMaxTecnica,
           java.lang.Integer masaEnServicio,
           java.lang.Float potenciaNetaMax,
           java.lang.Float relacionPotenciaPeso,
           java.lang.Integer numPlazasPie) {
           this.propulsion = propulsion;
           this.cilindrada = cilindrada;
           this.potenciaFiscal = potenciaFiscal;
           this.tara = tara;
           this.pesoMax = pesoMax;
           this.numPlazas = numPlazas;
           this.tipoItv = tipoItv;
           this.variante = variante;
           this.version = version;
           this.numHomologacion = numHomologacion;
           this.masaMaxTecnica = masaMaxTecnica;
           this.masaEnServicio = masaEnServicio;
           this.potenciaNetaMax = potenciaNetaMax;
           this.relacionPotenciaPeso = relacionPotenciaPeso;
           this.numPlazasPie = numPlazasPie;
    }


    /**
     * Gets the propulsion value for this IdentificacionDatosTecnicos.
     * 
     * @return propulsion
     */
    public es.trafico.www.atex.esquema.CodigoDescripcionAlfa getPropulsion() {
        return propulsion;
    }


    /**
     * Sets the propulsion value for this IdentificacionDatosTecnicos.
     * 
     * @param propulsion
     */
    public void setPropulsion(es.trafico.www.atex.esquema.CodigoDescripcionAlfa propulsion) {
        this.propulsion = propulsion;
    }


    /**
     * Gets the cilindrada value for this IdentificacionDatosTecnicos.
     * 
     * @return cilindrada
     */
    public java.lang.Float getCilindrada() {
        return cilindrada;
    }


    /**
     * Sets the cilindrada value for this IdentificacionDatosTecnicos.
     * 
     * @param cilindrada
     */
    public void setCilindrada(java.lang.Float cilindrada) {
        this.cilindrada = cilindrada;
    }


    /**
     * Gets the potenciaFiscal value for this IdentificacionDatosTecnicos.
     * 
     * @return potenciaFiscal
     */
    public java.lang.Float getPotenciaFiscal() {
        return potenciaFiscal;
    }


    /**
     * Sets the potenciaFiscal value for this IdentificacionDatosTecnicos.
     * 
     * @param potenciaFiscal
     */
    public void setPotenciaFiscal(java.lang.Float potenciaFiscal) {
        this.potenciaFiscal = potenciaFiscal;
    }


    /**
     * Gets the tara value for this IdentificacionDatosTecnicos.
     * 
     * @return tara
     */
    public java.lang.Integer getTara() {
        return tara;
    }


    /**
     * Sets the tara value for this IdentificacionDatosTecnicos.
     * 
     * @param tara
     */
    public void setTara(java.lang.Integer tara) {
        this.tara = tara;
    }


    /**
     * Gets the pesoMax value for this IdentificacionDatosTecnicos.
     * 
     * @return pesoMax
     */
    public java.lang.Integer getPesoMax() {
        return pesoMax;
    }


    /**
     * Sets the pesoMax value for this IdentificacionDatosTecnicos.
     * 
     * @param pesoMax
     */
    public void setPesoMax(java.lang.Integer pesoMax) {
        this.pesoMax = pesoMax;
    }


    /**
     * Gets the numPlazas value for this IdentificacionDatosTecnicos.
     * 
     * @return numPlazas
     */
    public es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicosNumPlazas getNumPlazas() {
        return numPlazas;
    }


    /**
     * Sets the numPlazas value for this IdentificacionDatosTecnicos.
     * 
     * @param numPlazas
     */
    public void setNumPlazas(es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicosNumPlazas numPlazas) {
        this.numPlazas = numPlazas;
    }


    /**
     * Gets the tipoItv value for this IdentificacionDatosTecnicos.
     * 
     * @return tipoItv
     */
    public java.lang.String getTipoItv() {
        return tipoItv;
    }


    /**
     * Sets the tipoItv value for this IdentificacionDatosTecnicos.
     * 
     * @param tipoItv
     */
    public void setTipoItv(java.lang.String tipoItv) {
        this.tipoItv = tipoItv;
    }


    /**
     * Gets the variante value for this IdentificacionDatosTecnicos.
     * 
     * @return variante
     */
    public java.lang.String getVariante() {
        return variante;
    }


    /**
     * Sets the variante value for this IdentificacionDatosTecnicos.
     * 
     * @param variante
     */
    public void setVariante(java.lang.String variante) {
        this.variante = variante;
    }


    /**
     * Gets the version value for this IdentificacionDatosTecnicos.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this IdentificacionDatosTecnicos.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the numHomologacion value for this IdentificacionDatosTecnicos.
     * 
     * @return numHomologacion
     */
    public java.lang.String getNumHomologacion() {
        return numHomologacion;
    }


    /**
     * Sets the numHomologacion value for this IdentificacionDatosTecnicos.
     * 
     * @param numHomologacion
     */
    public void setNumHomologacion(java.lang.String numHomologacion) {
        this.numHomologacion = numHomologacion;
    }


    /**
     * Gets the masaMaxTecnica value for this IdentificacionDatosTecnicos.
     * 
     * @return masaMaxTecnica
     */
    public java.lang.Integer getMasaMaxTecnica() {
        return masaMaxTecnica;
    }


    /**
     * Sets the masaMaxTecnica value for this IdentificacionDatosTecnicos.
     * 
     * @param masaMaxTecnica
     */
    public void setMasaMaxTecnica(java.lang.Integer masaMaxTecnica) {
        this.masaMaxTecnica = masaMaxTecnica;
    }


    /**
     * Gets the masaEnServicio value for this IdentificacionDatosTecnicos.
     * 
     * @return masaEnServicio
     */
    public java.lang.Integer getMasaEnServicio() {
        return masaEnServicio;
    }


    /**
     * Sets the masaEnServicio value for this IdentificacionDatosTecnicos.
     * 
     * @param masaEnServicio
     */
    public void setMasaEnServicio(java.lang.Integer masaEnServicio) {
        this.masaEnServicio = masaEnServicio;
    }


    /**
     * Gets the potenciaNetaMax value for this IdentificacionDatosTecnicos.
     * 
     * @return potenciaNetaMax
     */
    public java.lang.Float getPotenciaNetaMax() {
        return potenciaNetaMax;
    }


    /**
     * Sets the potenciaNetaMax value for this IdentificacionDatosTecnicos.
     * 
     * @param potenciaNetaMax
     */
    public void setPotenciaNetaMax(java.lang.Float potenciaNetaMax) {
        this.potenciaNetaMax = potenciaNetaMax;
    }


    /**
     * Gets the relacionPotenciaPeso value for this IdentificacionDatosTecnicos.
     * 
     * @return relacionPotenciaPeso
     */
    public java.lang.Float getRelacionPotenciaPeso() {
        return relacionPotenciaPeso;
    }


    /**
     * Sets the relacionPotenciaPeso value for this IdentificacionDatosTecnicos.
     * 
     * @param relacionPotenciaPeso
     */
    public void setRelacionPotenciaPeso(java.lang.Float relacionPotenciaPeso) {
        this.relacionPotenciaPeso = relacionPotenciaPeso;
    }


    /**
     * Gets the numPlazasPie value for this IdentificacionDatosTecnicos.
     * 
     * @return numPlazasPie
     */
    public java.lang.Integer getNumPlazasPie() {
        return numPlazasPie;
    }


    /**
     * Sets the numPlazasPie value for this IdentificacionDatosTecnicos.
     * 
     * @param numPlazasPie
     */
    public void setNumPlazasPie(java.lang.Integer numPlazasPie) {
        this.numPlazasPie = numPlazasPie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentificacionDatosTecnicos)) return false;
        IdentificacionDatosTecnicos other = (IdentificacionDatosTecnicos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propulsion==null && other.getPropulsion()==null) || 
             (this.propulsion!=null &&
              this.propulsion.equals(other.getPropulsion()))) &&
            ((this.cilindrada==null && other.getCilindrada()==null) || 
             (this.cilindrada!=null &&
              this.cilindrada.equals(other.getCilindrada()))) &&
            ((this.potenciaFiscal==null && other.getPotenciaFiscal()==null) || 
             (this.potenciaFiscal!=null &&
              this.potenciaFiscal.equals(other.getPotenciaFiscal()))) &&
            ((this.tara==null && other.getTara()==null) || 
             (this.tara!=null &&
              this.tara.equals(other.getTara()))) &&
            ((this.pesoMax==null && other.getPesoMax()==null) || 
             (this.pesoMax!=null &&
              this.pesoMax.equals(other.getPesoMax()))) &&
            ((this.numPlazas==null && other.getNumPlazas()==null) || 
             (this.numPlazas!=null &&
              this.numPlazas.equals(other.getNumPlazas()))) &&
            ((this.tipoItv==null && other.getTipoItv()==null) || 
             (this.tipoItv!=null &&
              this.tipoItv.equals(other.getTipoItv()))) &&
            ((this.variante==null && other.getVariante()==null) || 
             (this.variante!=null &&
              this.variante.equals(other.getVariante()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.numHomologacion==null && other.getNumHomologacion()==null) || 
             (this.numHomologacion!=null &&
              this.numHomologacion.equals(other.getNumHomologacion()))) &&
            ((this.masaMaxTecnica==null && other.getMasaMaxTecnica()==null) || 
             (this.masaMaxTecnica!=null &&
              this.masaMaxTecnica.equals(other.getMasaMaxTecnica()))) &&
            ((this.masaEnServicio==null && other.getMasaEnServicio()==null) || 
             (this.masaEnServicio!=null &&
              this.masaEnServicio.equals(other.getMasaEnServicio()))) &&
            ((this.potenciaNetaMax==null && other.getPotenciaNetaMax()==null) || 
             (this.potenciaNetaMax!=null &&
              this.potenciaNetaMax.equals(other.getPotenciaNetaMax()))) &&
            ((this.relacionPotenciaPeso==null && other.getRelacionPotenciaPeso()==null) || 
             (this.relacionPotenciaPeso!=null &&
              this.relacionPotenciaPeso.equals(other.getRelacionPotenciaPeso()))) &&
            ((this.numPlazasPie==null && other.getNumPlazasPie()==null) || 
             (this.numPlazasPie!=null &&
              this.numPlazasPie.equals(other.getNumPlazasPie())));
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
        if (getPropulsion() != null) {
            _hashCode += getPropulsion().hashCode();
        }
        if (getCilindrada() != null) {
            _hashCode += getCilindrada().hashCode();
        }
        if (getPotenciaFiscal() != null) {
            _hashCode += getPotenciaFiscal().hashCode();
        }
        if (getTara() != null) {
            _hashCode += getTara().hashCode();
        }
        if (getPesoMax() != null) {
            _hashCode += getPesoMax().hashCode();
        }
        if (getNumPlazas() != null) {
            _hashCode += getNumPlazas().hashCode();
        }
        if (getTipoItv() != null) {
            _hashCode += getTipoItv().hashCode();
        }
        if (getVariante() != null) {
            _hashCode += getVariante().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getNumHomologacion() != null) {
            _hashCode += getNumHomologacion().hashCode();
        }
        if (getMasaMaxTecnica() != null) {
            _hashCode += getMasaMaxTecnica().hashCode();
        }
        if (getMasaEnServicio() != null) {
            _hashCode += getMasaEnServicio().hashCode();
        }
        if (getPotenciaNetaMax() != null) {
            _hashCode += getPotenciaNetaMax().hashCode();
        }
        if (getRelacionPotenciaPeso() != null) {
            _hashCode += getRelacionPotenciaPeso().hashCode();
        }
        if (getNumPlazasPie() != null) {
            _hashCode += getNumPlazasPie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentificacionDatosTecnicos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>DatosTecnicos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propulsion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Propulsion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cilindrada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cilindrada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PotenciaFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tara");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tara"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pesoMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PesoMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPlazas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumPlazas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>DatosTecnicos>NumPlazas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoItv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoItv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Variante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numHomologacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumHomologacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masaMaxTecnica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MasaMaxTecnica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masaEnServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MasaEnServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potenciaNetaMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PotenciaNetaMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relacionPotenciaPeso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RelacionPotenciaPeso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPlazasPie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumPlazasPie"));
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
