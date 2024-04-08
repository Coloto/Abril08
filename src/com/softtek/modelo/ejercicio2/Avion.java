package com.softtek.modelo.ejercicio2;

public class Avion extends Vehiculo implements IObjetoVolador {
    public Avion() {
    }

    @Override
    public String despegar() {
        return "Avion despegando";
    }

    @Override
    public String aterrizar() {
        return "Avion aterrizando";
    }

    @Override
    public String volar() {
        return "Avion volando";
    }
}
