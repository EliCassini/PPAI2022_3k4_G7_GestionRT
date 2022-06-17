package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

public class TipoRecursoTecnologico {
    private String nombre;
    private String descripcion;

        public TipoRecursoTecnologico(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // ------------- Getter -----------------

    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;

    }

    // ------------- Setter -----------------

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Este método sirve para validar que el tipo de recurso tecnologico recibido por parámetro es el mismo que el nombre
     * @param tipoRecursoTecnologico
     * @return
     */

    public Boolean esTipo(String tipoRecursoTecnologico){
        return nombre == tipoRecursoTecnologico;
    }

}
