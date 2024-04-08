package com.softtek.modelo.ejercicio5;

public class Secretario implements IInforme{
    private IInforme informe;
    private String empresa;
    private String email;

    public Secretario() {
    }

    public Secretario(IInforme informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
