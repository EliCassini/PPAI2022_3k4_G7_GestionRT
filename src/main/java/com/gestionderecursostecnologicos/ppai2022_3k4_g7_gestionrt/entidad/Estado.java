package com.gestionderecursostecnologicos.ppai2022_3k4_g7_gestionrt.entidad;

public class Estado {
    private String nombre;
    private String ambito;
    private String descripcion;
    private boolean reservable;
    private boolean cancelable;

    public void Estado(String nombre,String ambito,boolean reservable,boolean cancelable){
        this.nombre = nombre;
        this.ambito = ambito;
        this.reservable = reservable;
        this.cancelable = cancelable;
    }

    // ------------- Getter -----------------
    public String getNombre() {
        return this.nombre;
    }

    public boolean esReservable () {
        return this.reservable;
    }
    public boolean esCancelable() {
        return this.cancelable;
    }

    // ------------- Setter -----------------


}
