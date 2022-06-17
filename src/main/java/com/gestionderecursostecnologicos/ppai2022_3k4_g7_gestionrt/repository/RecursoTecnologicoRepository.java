package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.repository;

import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.RecursoTecnologico;
import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.soporte.Modelo;

import java.util.ArrayList;
import java.util.List;

public class RecursoTecnologicoRepository {

    List<RecursoTecnologico> recursosTecnologicos= new ArrayList<RecursoTecnologico>();

    Modelo mod1= new Modelo();
    Modelo mod2= new Modelo();

     public List<RecursoTecnologico> obtenerRecursosTecnologicos(){
        return recursosTecnologicos;
    }
}
