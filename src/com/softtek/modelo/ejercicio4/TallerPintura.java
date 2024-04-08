package com.softtek.modelo.ejercicio4;

public class TallerPintura implements ITaller{

    public TallerPintura() {
    }

    @Override
    public String reparar(Cochecito c) {
        return "TallerPintura reparando coche" + c.getModelo() + " con matricula " + c.getMatricula();
    }
}
