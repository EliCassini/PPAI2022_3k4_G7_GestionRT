package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.soporte;

public class Modelo {
    private String nombre;
    private Marca marca;

    public String getNombre() {
        return nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    // ------------- Setter -----------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
