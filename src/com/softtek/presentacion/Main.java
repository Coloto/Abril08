package com.softtek.presentacion;

import com.softtek.modelo.ejercicio2.Avion;
import com.softtek.modelo.ejercicio2.Barcaza;
import com.softtek.modelo.ejercicio2.Helicoptero;
import com.softtek.modelo.ejercicio2.Hidroavion;
import com.softtek.modelo.ejercicio3.Cochecin;
import com.softtek.modelo.ejercicio3.Conductor;
import com.softtek.modelo.ejercicio4.Cochecito;
import com.softtek.modelo.ejercicio4.SeguroCoche;
import com.softtek.modelo.ejercicio4.TallerMecanica;
import com.softtek.modelo.ejercicio4.TallerPintura;
import com.softtek.modelo.ejercicio5.*;

public class Main {

    public static void main(String[] args) {

        /*Ejercicio 1
        * Crear la clase abstracta Animal con los métodos abstractos comer() y moverse(). A
        * continuación crearemos varias clases Perro, Pez, Pajaro, Gusano
        * ¿Qué ocurre si no implemento todos los métodos?
          Si no se implementan todos los métodos de una clase que extiende de una clase abstracta,
          salta un error de compilación

        * ¿Puedo crear instancias igualmente?
          Al haber un error de compilación no se podrá instanciar la clase.

        * ¿Puedo modificar parte de la definición de los métodos abstractos?
          Si, se pueden modificar.

        * ¿Puedo utilizar polimorfismo?
          Si, se puede utilizar porlimorfismo.

        * Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.
        * ¿También son abstractas estas clases?
          No, estas clases no son abstractas.
        *
        * */

        //Ejercicio 2
        //ejercicio2();

        //Ejercico 3
        //ejercicio3();

        //Ejercicio 4
        //ejercicio4();

        //Ejercicio 5
        ejercicio5();
    }

    public static void ejercicio2(){
        Avion avion = new Avion();
        System.out.println("AVION \n- " + avion.despegar() + "\n- " + avion.volar() + "\n- " + avion.aterrizar());
        Barcaza barcaza = new Barcaza();
        System.out.println("BARCAZA \n- " + barcaza.navegar() + "\n- " + barcaza.atracar());
        Helicoptero helicoptero = new Helicoptero();
        System.out.println("HELICOPTERO \n- " + helicoptero.despegar() + "\n- " + helicoptero.volar() + "\n- " + helicoptero.aterrizar());
        Hidroavion hidroavion = new Hidroavion();
        System.out.println("HIDROAVION \n- " + hidroavion.navegar() + "\n- " + hidroavion.atracar() + "\n- " + hidroavion.despegar() + "\n- " + hidroavion.volar() + "\n- " + hidroavion.aterrizar());
    }

    public static void ejercicio3(){
        Cochecin coche1 = new Cochecin(100);
        Conductor conductor1 = new Conductor(coche1);

        System.out.println(conductor1.conducir());
    }

    private static void ejercicio4() {
        Cochecito coche1 = new Cochecito("1234 ABC", "Modelo1");
        Cochecito coche2 = new Cochecito("9876 ZYX", "Modelo2");
        TallerMecanica tallerMecanica = new TallerMecanica();
        TallerPintura tallerPintura = new TallerPintura();
        SeguroCoche seguroCoche1 = new SeguroCoche(tallerMecanica, "Aseguradora 1");
        SeguroCoche seguroCoche2 = new SeguroCoche(tallerPintura, "Aseguradora 2");

        System.out.println(tallerMecanica.reparar(coche1));
        System.out.println(tallerMecanica.reparar(coche2));
        System.out.println(tallerPintura.reparar(coche1));
        System.out.println(tallerPintura.reparar(coche2));

        System.out.println(seguroCoche1.reparar(coche1));
        System.out.println(seguroCoche2.reparar(coche2));
    }

    public static void ejercicio5(){
        InformeTrimestre1 informeTrimestre1 = new InformeTrimestre1();
        InformeTrimestre2 informeTrimestre2 = new InformeTrimestre2();

        Director director = new Director(informeTrimestre1);
        Jefe jefe = new Jefe(informeTrimestre1);
        Secretario secretario = new Secretario(informeTrimestre1, "Softtek", "secretario@gmail.com");

        System.out.println("DIRECTOR\n" + director.getInforme());
        System.out.println("JEFE\nInforme: "+ jefe.getInforme() + "\nTareas: " + jefe.getTareas());
        System.out.println("SECRETARIO\n"+ secretario.getInforme());
        secretario.setInforme(informeTrimestre2);
        System.out.println(secretario.getInforme());
    }
}
