package com.softtek.modelo.ejercicio4;

public class TallerMecanica implements ITaller{

    public TallerMecanica() {
    }

    @Override
    public String reparar(Cochecito c) {
        return "TallerMecanica reparando coche " + c.getModelo() + " con matricula " + c.getMatricula();
    }
}
