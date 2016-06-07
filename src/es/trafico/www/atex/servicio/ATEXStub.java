/**
 * ATEXStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.trafico.www.atex.servicio;

public class ATEXStub extends org.apache.axis.client.Stub implements es.trafico.www.atex.servicio.ATEX_WS {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarMatricula");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SolicitudMatricula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudMatricula"), es.trafico.www.atex.servicio.SolicitudMatricula.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Vehiculo"));
        oper.setReturnClass(es.trafico.www.atex.esquema.vehiculo.Vehiculo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Vehiculo"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "AtexFault"),
                      "es.trafico.www.atex.esquema.vehiculo.AtexFault",
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">AtexFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarBastidor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SolicitudBastidor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudBastidor"), es.trafico.www.atex.servicio.SolicitudBastidor.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Vehiculo"));
        oper.setReturnClass(es.trafico.www.atex.esquema.vehiculo.Vehiculo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Vehiculo"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "AtexFault"),
                      "es.trafico.www.atex.esquema.vehiculo.AtexFault",
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">AtexFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarNive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SolicitudNive"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudNive"), es.trafico.www.atex.servicio.SolicitudNive.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Vehiculo"));
        oper.setReturnClass(es.trafico.www.atex.esquema.vehiculo.Vehiculo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "Vehiculo"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "AtexFault"),
                      "es.trafico.www.atex.esquema.vehiculo.AtexFault",
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">AtexFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPersonaPorDocumento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SolicitudDocumentoId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudDocumentoId"), es.trafico.www.atex.servicio.SolicitudDocumentoId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Persona"));
        oper.setReturnClass(es.trafico.www.atex.esquema.persona.Persona.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Persona"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "AtexFault"),
                      "es.trafico.www.atex.esquema.vehiculo.AtexFault",
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">AtexFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultarPersonaPorFiliacion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", "SolicitudFiliacion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudFiliacion"), es.trafico.www.atex.servicio.SolicitudFiliacion.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">ListaPersonas"));
        oper.setReturnClass(es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "ListaPersonas"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "DatosFiliacion"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", "AtexFault"),
                      "es.trafico.www.atex.esquema.vehiculo.AtexFault",
                      new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">AtexFault"), 
                      true
                     ));
        _operations[4] = oper;

    }

    public ATEXStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ATEXStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ATEXStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>>Examenes>Examen>Resultados");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.Resultado[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", "Resultado");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Examenes>Examen");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.ExamenesExamen.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Incidencias>Incidencia");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.IncidenciasIncidencia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>ListaPersonas>DatosFiliacion");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Matriculas>Matricula");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.MatriculasMatricula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Permisos>Pemiso");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.PermisosPemiso.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Sanciones>Sancion");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.SancionesSancion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Tramites>Duplicados");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Tramite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite");
            qName2 = new javax.xml.namespace.QName("", "Duplicado");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Tramites>Expediciones");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Tramite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite");
            qName2 = new javax.xml.namespace.QName("", "Expedicion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Tramites>Prorrogas");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Tramite[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite");
            qName2 = new javax.xml.namespace.QName("", "Prorroga");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Examenes");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.ExamenesExamen[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Examenes>Examen");
            qName2 = new javax.xml.namespace.QName("", "Examen");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Incidencias");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.IncidenciasIncidencia[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Incidencias>Incidencia");
            qName2 = new javax.xml.namespace.QName("", "Incidencia");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Indicadores");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.Indicadores.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">ListaPersonas");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>ListaPersonas>DatosFiliacion");
            qName2 = new javax.xml.namespace.QName("", "DatosFiliacion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Matriculas");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.MatriculasMatricula[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Matriculas>Matricula");
            qName2 = new javax.xml.namespace.QName("", "Matricula");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Permisos");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.PermisosPemiso[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Permisos>Pemiso");
            qName2 = new javax.xml.namespace.QName("", "Pemiso");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Persona");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.Persona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Resultado");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.Resultado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Sanciones");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.SancionesSancion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">>Sanciones>Sancion");
            qName2 = new javax.xml.namespace.QName("", "Sancion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/persona", ">Tramites");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.persona.Tramites.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>>Identificacion>MatriculacionTemporal>FechasProrroga>FechaProrroga");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporalFechasProrrogaFechaProrroga.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>>Itvs>Itv>Defectos>Defecto");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ItvsItvDefectosDefecto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>DatosTecnicos>NumPlazas");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicosNumPlazas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>MatriculacionTemporal>FechasProrroga");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporalFechasProrrogaFechaProrroga[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>>Identificacion>MatriculacionTemporal>FechasProrroga>FechaProrroga");
            qName2 = new javax.xml.namespace.QName("", "FechaProrroga");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>Rematriculaciones>Rematriculacion");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionRematriculacionesRematriculacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Itvs>Itv>Defectos");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ItvsItvDefectosDefecto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>>Itvs>Itv>Defectos>Defecto");
            qName2 = new javax.xml.namespace.QName("", "Defecto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Arrendatarios>Arrendatario");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ArrendatariosArrendatario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Bajas>Baja");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.BajasBaja.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>ConductoresHabituales>ConductorHabitual");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ConductoresHabitualesConductorHabitual.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Cotitulares>Cotitular");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.CotitularesCotitular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Duplicados>Duplicado");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.DuplicadosDuplicado.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>DatosTecnicos");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionDatosTecnicos.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>DescripcionVehiculo");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionDescripcionVehiculo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>FechasControl");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionFechasControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>Indicadores");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionIndicadores.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>Matriculacion");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>MatriculacionTemporal");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionMatriculacionTemporal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Identificacion>Rematriculaciones");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.IdentificacionRematriculacionesRematriculacion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>>Identificacion>Rematriculaciones>Rematriculacion");
            qName2 = new javax.xml.namespace.QName("", "Rematriculacion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Itvs>Itv");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ItvsItv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Limitaciones>Limitacion");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.LimitacionesLimitacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Poseedores>Poseedor");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.PoseedoresPoseedor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Seguros>Seguro");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.SegurosSeguro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Transferencias>Transferencia");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.TransferenciasTransferencia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Tutores>Tutor");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.TutoresTutor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Arrendatarios");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ArrendatariosArrendatario[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Arrendatarios>Arrendatario");
            qName2 = new javax.xml.namespace.QName("", "Arrendatario");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">AtexFault");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.AtexFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Avisos");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.AvisoDenegatoria[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "AvisoDenegatoria");
            qName2 = new javax.xml.namespace.QName("", "Aviso");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Bajas");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.BajasBaja[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Bajas>Baja");
            qName2 = new javax.xml.namespace.QName("", "Baja");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">ConductoresHabituales");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ConductoresHabitualesConductorHabitual[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>ConductoresHabituales>ConductorHabitual");
            qName2 = new javax.xml.namespace.QName("", "ConductorHabitual");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Cotitulares");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.CotitularesCotitular[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Cotitulares>Cotitular");
            qName2 = new javax.xml.namespace.QName("", "Cotitular");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Denegatorias");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.AvisoDenegatoria[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "AvisoDenegatoria");
            qName2 = new javax.xml.namespace.QName("", "Denegatoria");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Duplicados");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.DuplicadosDuplicado[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Duplicados>Duplicado");
            qName2 = new javax.xml.namespace.QName("", "Duplicado");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Embargos");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.EmbargoPrecinto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "EmbargoPrecinto");
            qName2 = new javax.xml.namespace.QName("", "Embargo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Identificacion");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.Identificacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Itvs");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ItvsItv[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Itvs>Itv");
            qName2 = new javax.xml.namespace.QName("", "Itv");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Limitaciones");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.LimitacionesLimitacion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Limitaciones>Limitacion");
            qName2 = new javax.xml.namespace.QName("", "Limitacion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Poseedores");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.PoseedoresPoseedor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Poseedores>Poseedor");
            qName2 = new javax.xml.namespace.QName("", "Poseedor");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Precintos");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.EmbargoPrecinto[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "EmbargoPrecinto");
            qName2 = new javax.xml.namespace.QName("", "Precinto");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Seguros");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.SegurosSeguro[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Seguros>Seguro");
            qName2 = new javax.xml.namespace.QName("", "Seguro");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">ServicioAutonomo");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.ServicioAutonomo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Titular");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.Titular.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Transferencias");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.TransferenciasTransferencia[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Transferencias>Transferencia");
            qName2 = new javax.xml.namespace.QName("", "Transferencia");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Tutores");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.TutoresTutor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">>Tutores>Tutor");
            qName2 = new javax.xml.namespace.QName("", "Tutor");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema/vehiculo", ">Vehiculo");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.vehiculo.Vehiculo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">datosPersona>Fisica");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.DatosPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">datosPersona>Juridica");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.DatosPersonaJuridica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">EmbargoPrecinto>Autoridad");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.EmbargoPrecintoAutoridad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">Jefatura");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Jefatura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">Provincia");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Provincia.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", ">Sucursal");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Sucursal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "AvisoDenegatoria");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.AvisoDenegatoria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "CodigoDescripcionAlfa");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.CodigoDescripcionAlfa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "datosPersona");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.DatosPersona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Domicilio");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Domicilio.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "EmbargoPrecinto");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.EmbargoPrecinto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/esquema", "Tramite");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.esquema.Tramite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">>SolicitudFiliacion>SolicitudPersonaFisica");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaFisica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">>SolicitudFiliacion>SolicitudPersonaJuridica");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.SolicitudFiliacionSolicitudPersonaJuridica.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">DatosUsuario");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.DatosUsuario.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudBastidor");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.SolicitudBastidor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudDocumentoId");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.SolicitudDocumentoId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudFiliacion");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.SolicitudFiliacion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudMatricula");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.SolicitudMatricula.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.trafico.es/atex/servicio", ">SolicitudNive");
            cachedSerQNames.add(qName);
            cls = es.trafico.www.atex.servicio.SolicitudNive.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarMatricula(es.trafico.www.atex.servicio.SolicitudMatricula solicitudMatricula) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:consultarMatricula");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultarMatricula"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitudMatricula});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.trafico.www.atex.esquema.vehiculo.Vehiculo) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.trafico.www.atex.esquema.vehiculo.Vehiculo) org.apache.axis.utils.JavaUtils.convert(_resp, es.trafico.www.atex.esquema.vehiculo.Vehiculo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.trafico.www.atex.esquema.vehiculo.AtexFault) {
              throw (es.trafico.www.atex.esquema.vehiculo.AtexFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarBastidor(es.trafico.www.atex.servicio.SolicitudBastidor solicitudBastidor) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:consultarBastidor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultarBastidor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitudBastidor});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.trafico.www.atex.esquema.vehiculo.Vehiculo) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.trafico.www.atex.esquema.vehiculo.Vehiculo) org.apache.axis.utils.JavaUtils.convert(_resp, es.trafico.www.atex.esquema.vehiculo.Vehiculo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.trafico.www.atex.esquema.vehiculo.AtexFault) {
              throw (es.trafico.www.atex.esquema.vehiculo.AtexFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.trafico.www.atex.esquema.vehiculo.Vehiculo consultarNive(es.trafico.www.atex.servicio.SolicitudNive solicitudNive) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:consultarNive");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultarNive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitudNive});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.trafico.www.atex.esquema.vehiculo.Vehiculo) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.trafico.www.atex.esquema.vehiculo.Vehiculo) org.apache.axis.utils.JavaUtils.convert(_resp, es.trafico.www.atex.esquema.vehiculo.Vehiculo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.trafico.www.atex.esquema.vehiculo.AtexFault) {
              throw (es.trafico.www.atex.esquema.vehiculo.AtexFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.trafico.www.atex.esquema.persona.Persona consultarPersonaPorDocumento(es.trafico.www.atex.servicio.SolicitudDocumentoId solicitudDocumentoId) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:consultarPersonaPorDocumento");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultarPersonaPorDocumento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitudDocumentoId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.trafico.www.atex.esquema.persona.Persona) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.trafico.www.atex.esquema.persona.Persona) org.apache.axis.utils.JavaUtils.convert(_resp, es.trafico.www.atex.esquema.persona.Persona.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.trafico.www.atex.esquema.vehiculo.AtexFault) {
              throw (es.trafico.www.atex.esquema.vehiculo.AtexFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[] consultarPersonaPorFiliacion(es.trafico.www.atex.servicio.SolicitudFiliacion solicitudFiliacion) throws java.rmi.RemoteException, es.trafico.www.atex.esquema.vehiculo.AtexFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:consultarPersonaPorFiliacion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultarPersonaPorFiliacion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {solicitudFiliacion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.trafico.www.atex.esquema.persona.ListaPersonasDatosFiliacion[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.trafico.www.atex.esquema.vehiculo.AtexFault) {
              throw (es.trafico.www.atex.esquema.vehiculo.AtexFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
