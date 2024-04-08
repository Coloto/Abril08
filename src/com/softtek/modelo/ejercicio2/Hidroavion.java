package com.softtek.modelo.ejercicio2;

public class Hidroavion extends Avion implements INautico {

    public Hidroavion() {
    }

    @Override
    public String atracar() {
        return "Hidroavion atracando";
    }

    @Override
    public String navegar() {
        return "Hidroavion navegando";
    }
}
