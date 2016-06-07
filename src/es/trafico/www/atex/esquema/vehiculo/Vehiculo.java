/**
 * Vehiculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.vehiculo;

public class Vehiculo  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.vehiculo.Identificacion identificacion;

    private es.trafico.www.atex.esquema.vehiculo.Titular titular;

    private es.trafico.www.atex.esquema.vehiculo.CotitularesCotitular[] cotitulares;

    private es.trafico.www.atex.esquema.Domicilio domicilioVehiculo;

    private es.trafico.www.atex.esquema.vehiculo.DuplicadosDuplicado[] duplicados;

    private es.trafico.www.atex.esquema.vehiculo.PoseedoresPoseedor[] poseedores;

    private es.trafico.www.atex.esquema.vehiculo.TransferenciasTransferencia[] transferencias;

    private es.trafico.www.atex.esquema.vehiculo.BajasBaja[] bajas;

    private es.trafico.www.atex.esquema.vehiculo.ItvsItv[] itvs;

    private es.trafico.www.atex.esquema.vehiculo.LimitacionesLimitacion[] limitaciones;

    private es.trafico.www.atex.esquema.EmbargoPrecinto[] embargos;

    private es.trafico.www.atex.esquema.EmbargoPrecinto[] precintos;

    private es.trafico.www.atex.esquema.AvisoDenegatoria[] avisos;

    private es.trafico.www.atex.esquema.AvisoDenegatoria[] denegatorias;

    private es.trafico.www.atex.esquema.vehiculo.SegurosSeguro[] seguros;

    private es.trafico.www.atex.esquema.vehiculo.ArrendatariosArrendatario[] arrendatarios;

    private es.trafico.www.atex.esquema.vehiculo.TutoresTutor[] tutores;

    private es.trafico.www.atex.esquema.vehiculo.ConductoresHabitualesConductorHabitual[] conductoresHabituales;

    private es.trafico.www.atex.esquema.vehiculo.ServicioAutonomo servicioAutonomo;

    public Vehiculo() {
    }

    public Vehiculo(
           es.trafico.www.atex.esquema.vehiculo.Identificacion identificacion,
           es.trafico.www.atex.esquema.vehiculo.Titular titular,
           es.trafico.www.atex.esquema.vehiculo.CotitularesCotitular[] cotitulares,
           es.trafico.www.atex.esquema.Domicilio domicilioVehiculo,
           es.trafico.www.atex.esquema.vehiculo.DuplicadosDuplicado[] duplicados,
           es.trafico.www.atex.esquema.vehiculo.PoseedoresPoseedor[] poseedores,
           es.trafico.www.atex.esquema.vehiculo.TransferenciasTransferencia[] transferencias,
           es.trafico.www.atex.esquema.vehiculo.BajasBaja[] bajas,
           es.trafico.www.atex.esquema.vehiculo.ItvsItv[] itvs,
           es.trafico.www.atex.esquema.vehiculo.LimitacionesLimitacion[] limitaciones,
           es.trafico.www.atex.esquema.EmbargoPrecinto[] embargos,
           es.trafico.www.atex.esquema.EmbargoPrecinto[] precintos,
           es.trafico.www.atex.esquema.AvisoDenegatoria[] avisos,
           es.trafico.www.atex.esquema.AvisoDenegatoria[] denegatorias,
           es.trafico.www.atex.esquema.vehiculo.SegurosSeguro[] seguros,
           es.trafico.www.atex.esquema.vehiculo.ArrendatariosArrendatario[] arrendatarios,
           es.trafico.www.atex.esquema.vehiculo.TutoresTutor[] tutores,
           es.trafico.www.atex.esquema.vehiculo.ConductoresHabitualesConductorHabitual[] conductoresHabituales,
           es.trafico.www.atex.esquema.vehiculo.ServicioAutonomo servicioAutonomo) {
           this.identificacion = identificacion;
           this.titular = titular;
           this.cotitulares = cotitulares;
           this.domicilioVehiculo = domicilioVehiculo;
           this.duplicados = duplicados;
           this.poseedores = poseedores;
           this.transferencias = transferencias;
           this.bajas = bajas;
           this.itvs = itvs;
           this.limitaciones = limitaciones;
           this.embargos = embargos;
           this.precintos = precintos;
           this.avisos = avisos;
           this.denegatorias = denegatorias;
           this.seguros = seguros;
           this.arrendatarios = arrendatarios;
           this.tutores = tutores;
           this.conductoresHabituales = conductoresHabituales;
           this.servicioAutonomo = servicioAutonomo;
    }


    /**
     * Gets the identificacion value for this Vehiculo.
     * 
     * @return identificacion
     */
    public es.trafico.www.atex.esquema.vehiculo.Identificacion getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this Vehiculo.
     * 
     * @param identificacion
     */
    public void setIdentificacion(es.trafico.www.atex.esquema.vehiculo.Identificacion identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the titular value for this Vehiculo.
     * 
     * @return titular
     */
    public es.trafico.www.atex.esquema.vehiculo.Titular getTitular() {
        return titular;
    }


    /**
     * Sets the titular value for this Vehiculo.
     * 
     * @param titular
     */
    public void setTitular(es.trafico.www.atex.esquema.vehiculo.Titular titular) {
        this.titular = titular;
    }


    /**
     * Gets the cotitulares value for this Vehiculo.
     * 
     * @return cotitulares
     */
    public es.trafico.www.atex.esquema.vehiculo.CotitularesCotitular[] getCotitulares() {
        return cotitulares;
    }


    /**
     * Sets the cotitulares value for this Vehiculo.
     * 
     * @param cotitulares
     */
    public void setCotitulares(es.trafico.www.atex.esquema.vehiculo.CotitularesCotitular[] cotitulares) {
        this.cotitulares = cotitulares;
    }


    /**
     * Gets the domicilioVehiculo value for this Vehiculo.
     * 
     * @return domicilioVehiculo
     */
    public es.trafico.www.atex.esquema.Domicilio getDomicilioVehiculo() {
        return domicilioVehiculo;
    }


    /**
     * Sets the domicilioVehiculo value for this Vehiculo.
     * 
     * @param domicilioVehiculo
     */
    public void setDomicilioVehiculo(es.trafico.www.atex.esquema.Domicilio domicilioVehiculo) {
        this.domicilioVehiculo = domicilioVehiculo;
    }


    /**
     * Gets the duplicados value for this Vehiculo.
     * 
     * @return duplicados
     */
    public es.trafico.www.atex.esquema.vehiculo.DuplicadosDuplicado[] getDuplicados() {
        return duplicados;
    }


    /**
     * Sets the duplicados value for this Vehiculo.
     * 
     * @param duplicados
     */
    public void setDuplicados(es.trafico.www.atex.esquema.vehiculo.DuplicadosDuplicado[] duplicados) {
        this.duplicados = duplicados;
    }


    /**
     * Gets the poseedores value for this Vehiculo.
     * 
     * @return poseedores
     */
    public es.trafico.www.atex.esquema.vehiculo.PoseedoresPoseedor[] getPoseedores() {
        return poseedores;
    }


    /**
     * Sets the poseedores value for this Vehiculo.
     * 
     * @param poseedores
     */
    public void setPoseedores(es.trafico.www.atex.esquema.vehiculo.PoseedoresPoseedor[] poseedores) {
        this.poseedores = poseedores;
    }


    /**
     * Gets the transferencias value for this Vehiculo.
     * 
     * @return transferencias
     */
    public es.trafico.www.atex.esquema.vehiculo.TransferenciasTransferencia[] getTransferencias() {
        return transferencias;
    }


    /**
     * Sets the transferencias value for this Vehiculo.
     * 
     * @param transferencias
     */
    public void setTransferencias(es.trafico.www.atex.esquema.vehiculo.TransferenciasTransferencia[] transferencias) {
        this.transferencias = transferencias;
    }


    /**
     * Gets the bajas value for this Vehiculo.
     * 
     * @return bajas
     */
    public es.trafico.www.atex.esquema.vehiculo.BajasBaja[] getBajas() {
        return bajas;
    }


    /**
     * Sets the bajas value for this Vehiculo.
     * 
     * @param bajas
     */
    public void setBajas(es.trafico.www.atex.esquema.vehiculo.BajasBaja[] bajas) {
        this.bajas = bajas;
    }


    /**
     * Gets the itvs value for this Vehiculo.
     * 
     * @return itvs
     */
    public es.trafico.www.atex.esquema.vehiculo.ItvsItv[] getItvs() {
        return itvs;
    }


    /**
     * Sets the itvs value for this Vehiculo.
     * 
     * @param itvs
     */
    public void setItvs(es.trafico.www.atex.esquema.vehiculo.ItvsItv[] itvs) {
        this.itvs = itvs;
    }


    /**
     * Gets the limitaciones value for this Vehiculo.
     * 
     * @return limitaciones
     */
    public es.trafico.www.atex.esquema.vehiculo.LimitacionesLimitacion[] getLimitaciones() {
        return limitaciones;
    }


    /**
     * Sets the limitaciones value for this Vehiculo.
     * 
     * @param limitaciones
     */
    public void setLimitaciones(es.trafico.www.atex.esquema.vehiculo.LimitacionesLimitacion[] limitaciones) {
        this.limitaciones = limitaciones;
    }


    /**
     * Gets the embargos value for this Vehiculo.
     * 
     * @return embargos
     */
    public es.trafico.www.atex.esquema.EmbargoPrecinto[] getEmbargos() {
        return embargos;
    }


    /**
     * Sets the embargos value for this Vehiculo.
     * 
     * @param embargos
     */
    public void setEmbargos(es.trafico.www.atex.esquema.EmbargoPrecinto[] embargos) {
        this.embargos = embargos;
    }


    /**
     * Gets the precintos value for this Vehiculo.
     * 
     * @return precintos
     */
    public es.trafico.www.atex.esquema.EmbargoPrecinto[] getPrecintos() {
        return precintos;
    }


    /**
     * Sets the precintos value for this Vehiculo.
     * 
     * @param precintos
     */
    public void setPrecintos(es.trafico.www.atex.esquema.EmbargoPrecinto[] precintos) {
        this.precintos = precintos;
    }


    /**
     * Gets the avisos value for this Vehiculo.
     * 
     * @return avisos
     */
    public es.trafico.www.atex.esquema.AvisoDenegatoria[] getAvisos() {
        return avisos;
    }


    /**
     * Sets the avisos value for this Vehiculo.
     * 
     * @param avisos
     */
    public void setAvisos(es.trafico.www.atex.esquema.AvisoDenegatoria[] avisos) {
        this.avisos = avisos;
    }


    /**
     * Gets the denegatorias value for this Vehiculo.
     * 
     * @return denegatorias
     */
    public es.trafico.www.atex.esquema.AvisoDenegatoria[] getDenegatorias() {
        return denegatorias;
    }


    /**
     * Sets the denegatorias value for this Vehiculo.
     * 
     * @param denegatorias
     */
    public void setDenegatorias(es.trafico.www.atex.esquema.AvisoDenegatoria[] denegatorias) {
        this.denegatorias = denegatorias;
    }


    /**
     * Gets the seguros value for this Vehiculo.
     * 
     * @return seguros
     */
    public es.trafico.www.atex.esquema.vehiculo.SegurosSeguro[] getSeguros() {
        return seguros;
    }


    /**
     * Sets the seguros value for this Vehiculo.
     * 
     * @param seguros
     */
    public void setSeguros(es.trafico.www.atex.esquema.vehiculo.SegurosSeguro[] seguros) {
        this.seguros = seguros;
    }


    /**
     * Gets the arrendatarios value for this Vehiculo.
     * 
     * @return arrendatarios
     */
    public es.trafico.www.atex.esquema.vehiculo.ArrendatariosArrendatario[] getArrendatarios() {
        return arrendatarios;
    }


    /**
     * Sets the arrendatarios value for this Vehiculo.
     * 
     * @param arrendatarios
     */
    public void setArrendatarios(es.trafico.www.atex.esquema.vehiculo.ArrendatariosArrendatario[] arrendatarios) {
        this.arrendatarios = arrendatarios;
    }


    /**
     * Gets the tutores value for this Vehiculo.
     * 
     * @return tutores
     */
    public es.trafico.www.atex.esquema.vehiculo.TutoresTutor[] getTutores() {
        return tutores;
    }


    /**
     * Sets the tutores value for this Vehiculo.
     * 
     * @param tutores
     */
    public void setTutores(es.trafico.www.atex.esquema.vehiculo.TutoresTutor[] tutores) {
        this.tutores = tutores;
    }


    /**
     * Gets the conductoresHabituales value for this Vehiculo.
     * 
     * @return conductoresHabituales
     */
    public es.trafico.www.atex.esquema.vehiculo.ConductoresHabitualesConductorHabitual[] getConductoresHabituales() {
        return conductoresHabituales;
    }


    /**
     * Sets the conductoresHabituales value for this Vehiculo.
     * 
     * @param conductoresHabituales
     */
    public void setConductoresHabituales(es.trafico.www.atex.esquema.vehiculo.ConductoresHabitualesConductorHabitual[] conductoresHabituales) {
        this.conductoresHabituales = conductoresHabituales;
    }


    /**
     * Gets the servicioAutonomo value for this Vehiculo.
     * 
     * @return servicioAutonomo
     */
    public es.trafico.www.atex.esquema.vehiculo.ServicioAutonomo getServicioAutonomo() {
        return servicioAutonomo;
    }


    /**
     * Sets the servicioAutonomo value for this Vehiculo.
     * 
     * @param servicioAutonomo
     */
    public void setServicioAutonomo(es.trafico.www.atex.esquema.vehiculo.ServicioAutonomo servicioAutonomo) {
        this.servicioAutonomo = servicioAutonomo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vehiculo)) return false;
        Vehiculo other = (Vehiculo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.titular==null && other.getTitular()==null) || 
             (this.titular!=null &&
              this.titular.equals(other.getTitular()))) &&
            ((this.cotitulares==null && other.getCotitulares()==null) || 
             (this.cotitulares!=null &&
              java.util.Arrays.equals(this.cotitulares, other.getCotitulares()))) &&
            ((this.domicilioVehiculo==null && other.getDomicilioVehiculo()==null) || 
             (this.domicilioVehiculo!=null &&
              this.domicilioVehiculo.equals(other.getDomicilioVehiculo()))) &&
            ((this.duplicados==null && other.getDuplicados()==null) || 
             (this.duplicados!=null &&
              java.util.Arrays.equals(this.duplicados, other.getDuplicados()))) &&
            ((this.poseedores==null && other.getPoseedores()==null) || 
             (this.poseedores!=null &&
              java.util.Arrays.equals(this.poseedores, other.getPoseedores()))) &&
            ((this.transferencias==null && other.getTransferencias()==null) || 
             (this.transferencias!=null &&
              java.util.Arrays.equals(this.transferencias, other.getTransferencias()))) &&
            ((this.bajas==null && other.getBajas()==null) || 
             (this.bajas!=null &&
              java.util.Arrays.equals(this.bajas, other.getBajas()))) &&
            ((this.itvs==null && other.getItvs()==null) || 
             (this.itvs!=null &&
              java.util.Arrays.equals(this.itvs, other.getItvs()))) &&
            ((this.limitaciones==null && other.getLimitaciones()==null) || 
             (this.limitaciones!=null &&
              java.util.Arrays.equals(this.limitaciones, other.getLimitaciones()))) &&
            ((this.embargos==null && other.getEmbargos()==null) || 
             (this.embargos!=null &&
              java.util.Arrays.equals(this.embargos, other.getEmbargos()))) &&
            ((this.precintos==null && other.getPrecintos()==null) || 
             (this.precintos!=null &&
              java.util.Arrays.equals(this.precintos, other.getPrecintos()))) &&
            ((this.avisos==null && other.getAvisos()==null) || 
             (this.avisos!=null &&
              java.util.Arrays.equals(this.avisos, other.getAvisos()))) &&
            ((this.denegatorias==null && other.getDenegatorias()==null) || 
             (this.denegatorias!=null &&
              java.util.Arrays.equals(this.denegatorias, other.getDenegatorias()))) &&
            ((this.seguros==null && other.getSeguros()==null) || 
             (this.seguros!=null &&
              java.util.Arrays.equals(this.seguros, other.getSeguros()))) &&
            ((this.arrendatarios==null && other.getArrendatarios()==null) || 
             (this.arrendatarios!=null &&
              java.util.Arrays.equals(this.arrendatarios, other.getArrendatarios()))) &&
            ((this.tutores==null && other.getTutores()==null) || 
             (this.tutores!=null &&
              java.util.Arrays.equals(this.tutores, other.getTutores()))) &&
            ((this.conductoresHabituales==null && other.getConductoresHabituales()==null) || 
             (this.conductoresHabituales!=null &&
              java.util.Arrays.equals(this.conductoresHabituales, other.getConductoresHabituales()))) &&
            ((this.servicioAutonomo==null && other.getServicioAutonomo()==null) || 
             (this.servicioAutonomo!=null &&
              this.servicioAutonomo.equals(other.getServicioAutonomo())));
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
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getTitular() != null) {
            _hashCode += getTitular().hashCode();
        }
        if (getCotitulares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCotitulares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCotitulares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomicilioVehiculo() != null) {
            _hashCode += getDomicilioVehiculo().hashCode();
        }
        if (getDuplicados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoseedores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoseedores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoseedores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferencias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferencias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferencias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBajas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBajas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBajas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItvs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItvs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItvs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimitaciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitaciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitaciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmbargos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmbargos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmbargos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrecintos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrecintos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrecintos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvisos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvisos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvisos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDenegatorias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDenegatorias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDenegatorias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeguros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeguros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeguros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArrendatarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrendatarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrendatarios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTutores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTutores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTutores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConductoresHabituales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConductoresHabituales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConductoresHabituales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicioAutonomo() != null) {
            _hashCode += getServicioAutonomo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vehiculo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Vehiculo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Identificacion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Titular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Titular"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cotitulares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Cotitulares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Cotitulares"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioVehiculo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "DomicilioVehiculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Domicilio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Duplicados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Duplicados"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poseedores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Poseedores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Poseedores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferencias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Transferencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Transferencias"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bajas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Bajas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Bajas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itvs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Itvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Itvs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Limitaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Limitaciones"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embargos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Embargos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Embargos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precintos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Precintos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Precintos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avisos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Avisos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Avisos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denegatorias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Denegatorias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Denegatorias"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Seguros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Seguros"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrendatarios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Arrendatarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Arrendatarios"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tutores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Tutores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Tutores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conductoresHabituales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "ConductoresHabituales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">ConductoresHabituales"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicioAutonomo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "ServicioAutonomo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">ServicioAutonomo"));
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
