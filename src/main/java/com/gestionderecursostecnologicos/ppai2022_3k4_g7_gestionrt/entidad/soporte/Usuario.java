package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.soporte;

public class Usuario {
    private String nombre;
    private String clave;
    private boolean habilitado;

    // ---------------- Constructor --------------------
    public Usuario (String nombre, String clave){
        if ( nombre == null || clave == null ) { throw new RuntimeException("Nombre o clave faltantes...");}
        this.nombre = nombre;
        this.clave = clave;
        setHabilitado(false);
    }

    // ------------------ Misc ----------------------


    // ------------------ Getters ----------------------

    public String getNombre() {return nombre;}
    public String getClave() {
        return clave;
    }
    public boolean isHabilitado() {
        return habilitado;
    }

    // ------------------ Setters ----------------------

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
