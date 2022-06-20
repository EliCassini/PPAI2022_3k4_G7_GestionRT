package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

import java.util.Date;

public class AsignacionCientifico {
    private Date fechaDesde;
    private Date fechaHasta;
    private PersonalCientifico cientifico;

    public AsignacionCientifico (PersonalCientifico cientifico) {
        this.fechaDesde = new Date();
        this.cientifico = cientifico;
    }

    public boolean esCientificoActivo() {
        return this.fechaHasta == null;
    }


}
