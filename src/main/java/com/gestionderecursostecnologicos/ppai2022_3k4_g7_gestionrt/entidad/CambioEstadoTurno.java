package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import java.util.Date;

public class CambioEstadoTurno {
    private Date fechaInicio;
    private Date fechaFin;
    private Estado estadoTurno;

    public void CambioEstadoTurno(Estado estadoTurno) {
        this.fechaFin = new Date();
        this.estadoTurno = estadoTurno;
    }

    // ------------- Getters ------------------
    public Boolean esEstadoActual(){
        return this.fechaFin == null;
    }

    public Boolean esReservable() {
        return this.estadoTurno.esReservable();
    }
    public Boolean esCancelable () {
        return this.estadoTurno.esCancelable();
    }
}
