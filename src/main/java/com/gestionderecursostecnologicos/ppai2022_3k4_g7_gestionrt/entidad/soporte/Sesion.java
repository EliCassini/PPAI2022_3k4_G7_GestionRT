package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.soporte;

import java.util.Date;

public class Sesion {
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private Usuario usuario;
    // ---------------- Constructor --------------------
    public Sesion(Usuario usuario) {
        this.usuario = usuario;
        this.fechaHoraInicio = new Date();
    }
    public void finSesion() {
        this.fechaHoraFin = new Date();
    }
    // ------------------ Getters ----------------------

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }
    public Date getGetFechaHoraFin() {
        return fechaHoraFin;
    }
    public Usuario getUsuario() {
        return usuario;
    }
}


// ---------------- Constructor --------------------
// ------------------ Getters ----------------------
// ------------------ Setters ----------------------