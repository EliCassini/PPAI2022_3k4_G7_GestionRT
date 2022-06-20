package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import java.util.Date;
import java.util.List;

public class Turno {
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private Date fechaCreacion;
    private AsignacionCientifico cientificoAsignado;
    private List<CambioEstadoTurno> cambiosDeEstado;

    public void Turno (Date fechaHoraInicioTurno,Date fechaHoraFinTurno,Estado estadoInicial){
        this.fechaHoraInicio = fechaHoraInicioTurno;
        this.fechaHoraFin = fechaHoraFinTurno;
        this.fechaCreacion = new Date();
        this.cambiosDeEstado.add( new CambioEstadoTurno(estadoInicial) ); // deberia poder ingresar como parametro el estado del cambio de turno
    }

    public boolean esPosteriorFechaHoraActual () {
        return this.fechaHoraInicio.after(new Date());
    }
    public CambioEstadoTurno obtenerCambioEstadoActual() {
        for (CambioEstadoTurno cambioIndividual : this.cambiosDeEstado) {
            if(cambioIndividual.esEstadoActual()) { return cambioIndividual; }
        }
        return null;
    }

    public void reservarTurno (Estado estadoReservado){
        CambioEstadoTurno cambioActual = obtenerCambioEstadoActual();
        cambioActual.setFechaHoraHasta();
        CambioEstadoTurno nuevoCambioEstado = new CambioEstadoTurno(estadoReservado);
    }

}
