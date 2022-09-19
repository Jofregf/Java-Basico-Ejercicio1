package Programacion.Orientada.Objetos.Herencia;

//Debido a que Vehiculo está en un paquete separado, se debe importart
import Programacion.Orientada.Objetos.Clases.Vehiculo;

// La clase camion tendrá sus propios atributos, pero heredará los de Vehiculo(extends).
// los atributos de la clase Vehiculo, los ponemos en protected o public para que sean visibles en este paquete.

public class Camion extends Vehiculo {

    //atributos propios de la clase camion
    double capacidadCarga;

    public Camion(){

    }

}
