package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;


import GestionRT.entidad.soporte.Usuario;

public class PersonalCientifico {
    private int legajo;
    private String nombre;
    private String apellido;
    private int nroDocumento;
    private int nroTelefono;
    private String correoInstitucional;
    private String correoPersonal;
    private Usuario usuarioPersonal;

    // ------------------ Getters ----------------------

    public int getLegajo() {
        return legajo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getNroDocumento() {
        return nroDocumento;
    }
    public int getNroTelefono() {
        return nroTelefono;
    }
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }
    public String getCorreoPersonal() {
        return correoPersonal;
    }
    public Usuario getUsuarioPersonal() {
        return usuarioPersonal;
    }

    // ------------------ Setters ----------------------

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }
    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }
    public void setUsuarioPersonal(Usuario usuarioPersonal) {
        this.usuarioPersonal = usuarioPersonal;
    }


}
