package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import GestionRT.entidad.soporte.Modelo;

import java.util.Date;
import java.util.List;

public class RecursoTecnologico {
    private int nroInventario;
    private Date fechaAlta;
    private Modelo modelo;
    private int periodicidadMant;  // periodicidad de mantenimiento en dias
    private int duracionMant;   // duracionMant
    private List<Turno> listaTurno;
    private List<CambioEstadoRT> cambiosEstadosRT;
    private AsignacionRespTecnologico responsableTecnologico;
    private List<CaracteristicaDelRecurso> caracteristica;
    private TipoRecursoTecnologico tipoDeRecurso;



    public RecursoTecnologico(int nroInventario, Date fechaAlta, Modelo modelo, int periodicidadMant, int duracionMant, List<Turno> listaTurno, List<CambioEstadoRT> cambiosEstadosRT, AsignacionRespTecnologico responsableTecnologico, List<CaracteristicaDelRecurso> caracteristica, TipoRecursoTecnologico tipoDeRecurso) {
        this.nroInventario = nroInventario;
        this.fechaAlta = fechaAlta;
        this.modelo = modelo;
        this.periodicidadMant = periodicidadMant;
        this.duracionMant = duracionMant;
        this.listaTurno = listaTurno;
        this.cambiosEstadosRT = cambiosEstadosRT;
        this.responsableTecnologico = responsableTecnologico;
        this.caracteristica = caracteristica;
        this.tipoDeRecurso = tipoDeRecurso;
    }

    /**
     * Esta función llama al método esTipo de la clase TipoRecursoTeconológico para la validación de tipoRT
     * @param tipoRecursoTecnologico
     * @return
     */
    public Boolean esTuTipo(String tipoRecursoTecnologico){
        return this.tipoDeRecurso.esTipo(tipoRecursoTecnologico);
    }




    public Object buscarDatosRT(List<CentroDeInvestigacion> centrosDeInvestigacion){
        Object datosRt= new Object();

        return datosRt;
    }

    public Estado buscarEstadoActual(){
        Estado estadoActual= new Estado();
        if()
        return estadoActual;
    }


}
