package com.softtek.modelo.ejercicio5;

public class Jefe implements IEmpleado{
    private IInforme informe;

    public Jefe() {
    }

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Tareas del jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
