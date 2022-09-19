package Programacion.Orientada.Objetos.Clases;

import Programacion.Orientada.Objetos.Herencia.Camion;
import Programacion.Orientada.Objetos.Herencia.Coche;
import Programacion.Orientada.Objetos.Herencia.Motocicleta;

// La clase Main será el punto de entrada de nuestra aplicación
public class Main {
// static nos dice que el metodo pertenece a esa clase, y se puede acceder a el sin necesidad de crear objetos

    public static void main(String[] args) {

        // Para usar el constructor
        // Clase identificador = new Clase();

        // Crear un objeto usando el constructor vacio

        Motor motorXC40 = new Motor(300, "nafta");
        Vehiculo volvoXC40 = new Vehiculo();
        volvoXC40.fabricante = "Volvo";
        volvoXC40.modelo = "XC40";
        volvoXC40.anio = 2022;
        volvoXC40.sport = true;
        volvoXC40.motor = motorXC40;
        System.out.println(volvoXC40.fabricante + "<--Volvo");
        System.out.println(volvoXC40.modelo + "<--Volvo");
        System.out.println(volvoXC40.motor.combustible + "<--Volvo");
        System.out.println(volvoXC40.motor.caballos + "<--Volvo");


        // Crear un objeto pasando los parametros al constructor
        Motor motor208 = new Motor(250, "nafta");
        Vehiculo peugeot208 = new Vehiculo("Peugeot", "208 LIKE PACK 1.6L", 2022,  false, 0.0, motor208);
        System.out.println(peugeot208.fabricante);
        System.out.println(peugeot208.modelo);
        System.out.println(peugeot208.motor.caballos);
        System.out.println(peugeot208.motor.combustible);
        System.out.println(peugeot208.velocidad);
        peugeot208.acelerar(120);
        System.out.println(peugeot208.velocidad);

        Motor motorBlitz = new Motor(7, "nafta");
        Motocicleta blitz110 = new Motocicleta();
        blitz110.fabricante = "Motomel";
        blitz110.modelo = "Blitz 110 V8";
        blitz110.anio = 2021;
        blitz110.motor = motorBlitz;
        blitz110.baulera = true;

        System.out.println(blitz110.baulera);

        System.out.println("Fin del programa");

        // 3_Polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);


        vehiculo = new Coche();
        vehiculo.acelerar(120);

        vehiculo = new Camion();
        vehiculo.acelerar(70);

        // 4_Clases Abstractas, no pueden instanciarse, solo se instancian las clases hijas
        // cdo no se quiere que se creen objetos de la clase generica


    }
}
