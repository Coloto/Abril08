package com.softtek.modelo.ejercicio5;

public class Director implements IInforme{
    private IInforme informe;

    public Director() {
    }

    public Director(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
