package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CentroDeInvestigacion {
    private String nombre;
    private String sigla;
    private String direccion;
    private String email;
    private int nroResolucion;
    private Date fechaResolucion;
    private String reglamento;
    private Date fechaAlta;
    private Date fechaBaja;
    private String motivoBaja;
    private String caracteristicasGenerales;
    private String edificio;
    private String coordenadas;

    private List<RecursoTecnologico> recursosTecnologicos;

    private AsignacionDirector directorCI;
    private List<AsignacionCientifico> cientificos = new ArrayList<AsignacionCientifico>();

    // ---------------- Constructor --------------------
    public CentroDeInvestigacion (String nombre, String direccion) {
        if ( nombre == null || direccion == null ) {
            throw new RuntimeException("CentroInvestigacion datos faltantes");
        }

        this.nombre = nombre;
        this.direccion = direccion;

    }

    // ------------------ Getters ----------------------

    public String getNombre () { return nombre; }

    // ------------------ Setters ----------------------

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNroResolucion(int nroResolucion) {
        this.nroResolucion = nroResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public void setReglamento(String reglamento) {
        this.reglamento = reglamento;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public void setCaracteristicasGenerales(String caracteristicasGenerales) {
        this.caracteristicasGenerales = caracteristicasGenerales;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public void setDirectorCI(AsignacionDirector directorCI) {
        this.directorCI = directorCI;
    }

    public Boolean esTuRecursoTecnologico(RecursoTecnologico recursoTecnologico) {
        Boolean esTuRecurso = false;
        for (RecursoTecnologico rt: this.recursosTecnologicos) {
            esTuRecurso = rt.equals(recursoTecnologico);
        }
        return esTuRecurso;
    }
}