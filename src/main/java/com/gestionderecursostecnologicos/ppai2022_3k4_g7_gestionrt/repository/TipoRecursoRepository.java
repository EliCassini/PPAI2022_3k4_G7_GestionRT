package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.repository;

import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.TipoRecursoTecnologico;

import java.util.ArrayList;
import java.util.List;

public class TipoRecursoRepository {

    List<TipoRecursoTecnologico> tiposDeRecurso = new ArrayList<TipoRecursoTecnologico>(List.of(
            new TipoRecursoTecnologico("Opt", "Optico"),
            new TipoRecursoTecnologico("AD500", "Computadora cuantica"),
            new TipoRecursoTecnologico( "FluidX", "Dispositivo de recolecion de fluidos")
            ));

    public List<TipoRecursoTecnologico> obtenerTiposDeRecursoTecnologico(){
        return tiposDeRecurso;
    }
}
