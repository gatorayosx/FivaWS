/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.esquema.persona;

public class Persona  implements java.io.Serializable {
    private es.trafico.www.atex.esquema.DatosPersona identificacionPersona;

    private es.trafico.www.atex.esquema.Domicilio domicilioPersona;

    private es.trafico.www.atex.esquema.persona.Indicadores indicadores;

    private es.trafico.www.atex.esquema.persona.ExamenesExamen[] examenes;

    private es.trafico.www.atex.esquema.persona.IncidenciasIncidencia[] incidencias;

    private es.trafico.www.atex.esquema.persona.Tramites tramites;

    private es.trafico.www.atex.esquema.persona.PermisosPemiso[] permisos;

    private es.trafico.www.atex.esquema.persona.SancionesSancion[] sanciones;

    private es.trafico.www.atex.esquema.persona.MatriculasMatricula[] matriculas;

    public Persona() {
    }

    public Persona(
           es.trafico.www.atex.esquema.DatosPersona identificacionPersona,
           es.trafico.www.atex.esquema.Domicilio domicilioPersona,
           es.trafico.www.atex.esquema.persona.Indicadores indicadores,
           es.trafico.www.atex.esquema.persona.ExamenesExamen[] examenes,
           es.trafico.www.atex.esquema.persona.IncidenciasIncidencia[] incidencias,
           es.trafico.www.atex.esquema.persona.Tramites tramites,
           es.trafico.www.atex.esquema.persona.PermisosPemiso[] permisos,
           es.trafico.www.atex.esquema.persona.SancionesSancion[] sanciones,
           es.trafico.www.atex.esquema.persona.MatriculasMatricula[] matriculas) {
           this.identificacionPersona = identificacionPersona;
           this.domicilioPersona = domicilioPersona;
           this.indicadores = indicadores;
           this.examenes = examenes;
           this.incidencias = incidencias;
           this.tramites = tramites;
           this.permisos = permisos;
           this.sanciones = sanciones;
           this.matriculas = matriculas;
    }


    /**
     * Gets the identificacionPersona value for this Persona.
     * 
     * @return identificacionPersona
     */
    public es.trafico.www.atex.esquema.DatosPersona getIdentificacionPersona() {
        return identificacionPersona;
    }


    /**
     * Sets the identificacionPersona value for this Persona.
     * 
     * @param identificacionPersona
     */
    public void setIdentificacionPersona(es.trafico.www.atex.esquema.DatosPersona identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }


    /**
     * Gets the domicilioPersona value for this Persona.
     * 
     * @return domicilioPersona
     */
    public es.trafico.www.atex.esquema.Domicilio getDomicilioPersona() {
        return domicilioPersona;
    }


    /**
     * Sets the domicilioPersona value for this Persona.
     * 
     * @param domicilioPersona
     */
    public void setDomicilioPersona(es.trafico.www.atex.esquema.Domicilio domicilioPersona) {
        this.domicilioPersona = domicilioPersona;
    }


    /**
     * Gets the indicadores value for this Persona.
     * 
     * @return indicadores
     */
    public es.trafico.www.atex.esquema.persona.Indicadores getIndicadores() {
        return indicadores;
    }


    /**
     * Sets the indicadores value for this Persona.
     * 
     * @param indicadores
     */
    public void setIndicadores(es.trafico.www.atex.esquema.persona.Indicadores indicadores) {
        this.indicadores = indicadores;
    }


    /**
     * Gets the examenes value for this Persona.
     * 
     * @return examenes
     */
    public es.trafico.www.atex.esquema.persona.ExamenesExamen[] getExamenes() {
        return examenes;
    }


    /**
     * Sets the examenes value for this Persona.
     * 
     * @param examenes
     */
    public void setExamenes(es.trafico.www.atex.esquema.persona.ExamenesExamen[] examenes) {
        this.examenes = examenes;
    }


    /**
     * Gets the incidencias value for this Persona.
     * 
     * @return incidencias
     */
    public es.trafico.www.atex.esquema.persona.IncidenciasIncidencia[] getIncidencias() {
        return incidencias;
    }


    /**
     * Sets the incidencias value for this Persona.
     * 
     * @param incidencias
     */
    public void setIncidencias(es.trafico.www.atex.esquema.persona.IncidenciasIncidencia[] incidencias) {
        this.incidencias = incidencias;
    }


    /**
     * Gets the tramites value for this Persona.
     * 
     * @return tramites
     */
    public es.trafico.www.atex.esquema.persona.Tramites getTramites() {
        return tramites;
    }


    /**
     * Sets the tramites value for this Persona.
     * 
     * @param tramites
     */
    public void setTramites(es.trafico.www.atex.esquema.persona.Tramites tramites) {
        this.tramites = tramites;
    }


    /**
     * Gets the permisos value for this Persona.
     * 
     * @return permisos
     */
    public es.trafico.www.atex.esquema.persona.PermisosPemiso[] getPermisos() {
        return permisos;
    }


    /**
     * Sets the permisos value for this Persona.
     * 
     * @param permisos
     */
    public void setPermisos(es.trafico.www.atex.esquema.persona.PermisosPemiso[] permisos) {
        this.permisos = permisos;
    }


    /**
     * Gets the sanciones value for this Persona.
     * 
     * @return sanciones
     */
    public es.trafico.www.atex.esquema.persona.SancionesSancion[] getSanciones() {
        return sanciones;
    }


    /**
     * Sets the sanciones value for this Persona.
     * 
     * @param sanciones
     */
    public void setSanciones(es.trafico.www.atex.esquema.persona.SancionesSancion[] sanciones) {
        this.sanciones = sanciones;
    }


    /**
     * Gets the matriculas value for this Persona.
     * 
     * @return matriculas
     */
    public es.trafico.www.atex.esquema.persona.MatriculasMatricula[] getMatriculas() {
        return matriculas;
    }


    /**
     * Sets the matriculas value for this Persona.
     * 
     * @param matriculas
     */
    public void setMatriculas(es.trafico.www.atex.esquema.persona.MatriculasMatricula[] matriculas) {
        this.matriculas = matriculas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacionPersona==null && other.getIdentificacionPersona()==null) || 
             (this.identificacionPersona!=null &&
              this.identificacionPersona.equals(other.getIdentificacionPersona()))) &&
            ((this.domicilioPersona==null && other.getDomicilioPersona()==null) || 
             (this.domicilioPersona!=null &&
              this.domicilioPersona.equals(other.getDomicilioPersona()))) &&
            ((this.indicadores==null && other.getIndicadores()==null) || 
             (this.indicadores!=null &&
              this.indicadores.equals(other.getIndicadores()))) &&
            ((this.examenes==null && other.getExamenes()==null) || 
             (this.examenes!=null &&
              java.util.Arrays.equals(this.examenes, other.getExamenes()))) &&
            ((this.incidencias==null && other.getIncidencias()==null) || 
             (this.incidencias!=null &&
              java.util.Arrays.equals(this.incidencias, other.getIncidencias()))) &&
            ((this.tramites==null && other.getTramites()==null) || 
             (this.tramites!=null &&
              this.tramites.equals(other.getTramites()))) &&
            ((this.permisos==null && other.getPermisos()==null) || 
             (this.permisos!=null &&
              java.util.Arrays.equals(this.permisos, other.getPermisos()))) &&
            ((this.sanciones==null && other.getSanciones()==null) || 
             (this.sanciones!=null &&
              java.util.Arrays.equals(this.sanciones, other.getSanciones()))) &&
            ((this.matriculas==null && other.getMatriculas()==null) || 
             (this.matriculas!=null &&
              java.util.Arrays.equals(this.matriculas, other.getMatriculas())));
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
        if (getIdentificacionPersona() != null) {
            _hashCode += getIdentificacionPersona().hashCode();
        }
        if (getDomicilioPersona() != null) {
            _hashCode += getDomicilioPersona().hashCode();
        }
        if (getIndicadores() != null) {
            _hashCode += getIndicadores().hashCode();
        }
        if (getExamenes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExamenes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExamenes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncidencias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncidencias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncidencias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTramites() != null) {
            _hashCode += getTramites().hashCode();
        }
        if (getPermisos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermisos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermisos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSanciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSanciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSanciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatriculas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatriculas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatriculas(), i);
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
        new org.apache.axis.description.TypeDesc(Persona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Persona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "IdentificacionPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "datosPersona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domicilioPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "DomicilioPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Domicilio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Indicadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Indicadores"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examenes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Examenes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Examenes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidencias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Incidencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Incidencias"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tramites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Tramites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Tramites"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permisos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Permisos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Permisos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Sanciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Sanciones"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Matriculas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Matriculas"));
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
