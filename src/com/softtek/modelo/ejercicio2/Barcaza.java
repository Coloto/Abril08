package com.softtek.modelo.ejercicio2;

public class Barcaza extends Vehiculo implements INautico {

    public Barcaza() {
    }

    @Override
    public String atracar() {
        return "Barcaza atracando";
    }

    @Override
    public String navegar() {
        return "Barcaza navegando";
    }
}
