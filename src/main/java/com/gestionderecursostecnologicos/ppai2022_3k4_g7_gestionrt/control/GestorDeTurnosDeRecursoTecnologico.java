package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.control;



import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.RecursoTecnologico;
import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad.TipoRecursoTecnologico;
import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.repository.CentrosDeInvestigacionRepository;
import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.repository.RecursoTecnologicoRepository;
import com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.repository.TipoRecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class GestorDeTurnosDeRecursoTecnologico {

    @Autowired
    private final TipoRecursoRepository tipoRecursoRepository;
    @Autowired
    private final RecursoTecnologicoRepository recursoTecnologicoRepository;

    @Autowired
    private final CentrosDeInvestigacionRepository centrosDeInvestigacionRepository;

    public GestorDeTurnosDeRecursoTecnologico(TipoRecursoRepository tipoRecursoRepository, RecursoTecnologicoRepository recursoTecnologicoRepository, CentrosDeInvestigacionRepository centrosDeInvestigacionRepository) {
        this.tipoRecursoRepository = tipoRecursoRepository;
        this.recursoTecnologicoRepository = recursoTecnologicoRepository;
        this.centrosDeInvestigacionRepository = centrosDeInvestigacionRepository;
    }

    public List<String> opcionReservarTurnoRT(){
      return this.buscarTiposDeRT();
    }
    public List<String> buscarTiposDeRT(){
        List<String> nombresTiposDeRT = new ArrayList<String>();
        if(!tipoRecursoRepository.obtenerTiposDeRecursoTecnologico().isEmpty()){
            for (TipoRecursoTecnologico tr: tipoRecursoRepository.obtenerTiposDeRecursoTecnologico()) {
                nombresTiposDeRT.add(tr.getNombre());
            }
        }
        return nombresTiposDeRT;
    }

    /**
     *
     * @param tipoRecurso Se pasa como parametro el nombre del Tipo de RT seleccionado
     * @return  Activa la funcion buscarRT(tipoRecurso) segun el nombre del Tipo de RT selccionado
     * SE UTILIZA EL VOID PARA LLAMAR A LA FUNCION buscarRT
     * OTRA OP ES DEVOLVER DIRECTAMENTE LA LISTA DE OBJETOS RECURSOS TECNOLOGICOS
     */
    
    public List<Object> tipoDeRTSeleccionado(String tipoRecurso){
       return this.buscarRT(tipoRecurso);
    }

    /**
     *
     * @param tipoRecursoSeleccionado Se pasa como parametro el nombre del Tipo de RT seleccionado
     *
     * @return
     */
    public List<Object> buscarRT(String tipoRecursoSeleccionado){
        List<Object> recursosTecnologicos = new ArrayList<>();
        if(!recursoTecnologicoRepository.obtenerRecursosTecnologicos().isEmpty()){
            for (RecursoTecnologico rt: recursoTecnologicoRepository.obtenerRecursosTecnologicos()) {
              if(rt.esTuTipo(tipoRecursoSeleccionado)){
                 rt.buscarDatosRT(centrosDeInvestigacionRepository.obtenerCentrosDeInvestigacion());
              }
            }
        }

        return recursosTecnologicos;

    }


}
