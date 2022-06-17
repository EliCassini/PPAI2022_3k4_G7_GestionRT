package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.soporte.Modelo;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
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




    public void buscarDatosRT(List<CentroDeInvestigacion> centrosDeInvestigacion){
        String nombreCI="";
        if (this.buscarEstadoActual()==true){
            /*
            En teoria esta seria la dependencia con el Centro de Investigacion
            Con esto, sabriamos si el nombre del CI al cual pertenece el RT
             */
            for (CentroDeInvestigacion ci: centrosDeInvestigacion) {
               if(ci.esTuRecursoTecnologico(this)==true){
                   nombreCI= ci.getNombre();
               }
            }
            /*
            Faltan modeloYmarca + nroInventario
            Verificar que debemos devolver, si un objeto con todos los datos o una lista
             */
        }
       Object datosRt= new Object();


        //return datosRt;
    }
    /**
     * Buscamos el EstadoActual del Recurso Tecnologico y verificamos que sea un Estado Reservable
     * @return Booleano si es Reservable
     */
    public Boolean buscarEstadoActual(){
        Boolean esReservable= false;
        if(!cambiosEstadosRT.isEmpty()){
            for (CambioEstadoRT c:cambiosEstadosRT) {
                if(c.esEstadoActual()){
                    esReservable= c.esReservable();
                    break;
                    }
                }
            }
        return esReservable;
    }


}
