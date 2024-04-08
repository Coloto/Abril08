package com.softtek.modelo.ejercicio3;

public class Conductor {
    private IVehiculo vehiculo;

    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String conducir(){
        return vehiculo.moverse() ;
    }
}
