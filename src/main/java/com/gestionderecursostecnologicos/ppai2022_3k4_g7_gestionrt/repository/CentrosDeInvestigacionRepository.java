package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.repository;

import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.CentroDeInvestigacion;

import java.util.ArrayList;
import java.util.List;

public class CentrosDeInvestigacionRepository {
    List<CentroDeInvestigacion> centrosDeInvestigacion= new ArrayList<CentroDeInvestigacion>();

    public List<CentroDeInvestigacion> obtenerCentrosDeInvestigacion(){
        return centrosDeInvestigacion;
    }
}
