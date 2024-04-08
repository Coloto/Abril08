package com.softtek.modelo.ejercicio4;

public class Cochecito {
    private String matricula;
    private String modelo;

    public Cochecito() {
    }

    public Cochecito(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
