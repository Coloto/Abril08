package com.softtek.modelo.ejercicio3;

public class Cochecin implements IVehiculo {
    private int deposito;

    public Cochecin() {
    }

    public Cochecin(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (deposito>0){
            return "Coche en movimiento";
        } else {
            return "El coche no tiene combustible";
        }
    }
}
