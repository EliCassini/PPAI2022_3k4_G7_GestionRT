package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import java.util.HashSet;

public class Facultad {
    private String nombre;
    private String direccion;
    private HashSet <CentroInvestigacion> centrosInvestigacion = new HashSet<CentroInvestigacion>();
    private PersonalCientifico responsable;


    // ---------------- Constructor --------------------
    public Facultad (String nombre, String direccion) {
        if ( nombre == null || direccion == null ) {
            throw new RuntimeException("Datos faltantes nombre de facultad o direccion ");
        }
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // ------------------ Getters ----------------------

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {return direccion;}
    public HashSet<CentroInvestigacion> getCentrosInvestigacion() { return centrosInvestigacion; }
    public PersonalCientifico getResponsable() {
        return responsable;
    }

    // ------------------ Setters ----------------------

    public void addCentrosInvestigacion( CentroInvestigacion ci ) {this.centrosInvestigacion.add(ci); }
    public void setResponsable(PersonalCientifico responsable) {this.responsable = responsable; }

}
