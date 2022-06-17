package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import java.util.Date;

public class CambioEstadoRT {
    private Date fechaDesde;
    private Date fechaHasta;
    private Estado estado;

    public void CambioEstadoRT (Estado estado) {
        this.fechaDesde = new Date();
        this.estado = estado;
    }

    // ------------- Getter -----------------
    public Estado getEstado() {
        return this.estado;
    }
    public boolean esEstadoActual() {
        return this.fechaHasta == null;
    }
    public boolean esReservable () {
        return this.estado.esReservable();
    }
    // ------------- Setter -----------------
    public void setFinDeCambioDeEstado() {
        this.fechaHasta = new Date();
    }


}
