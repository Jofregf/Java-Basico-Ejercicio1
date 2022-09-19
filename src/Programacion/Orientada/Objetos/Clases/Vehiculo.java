package Programacion.Orientada.Objetos.Clases;

public class Vehiculo {

    // 1_Atributos

    protected String fabricante; // si a uno de los atributos le colocamos private, solo se puede acceder a el desde la clase en la que esta
    protected String modelo;// Le hemos colocado protected para poder acceder a ella desde otro paquete
    // si lo escribo con mayuscula (Double) es del tipo envoltorio, el cual permite valores como null (usado en BD),
    // si lo escribo en minusculas (double) es de tipo primitivo
    protected int anio;
    protected boolean sport;
    protected double velocidad;
    protected Motor motor; // cuando las clases se hacen muy grandes, se pueden hacer distintas clases asociadas


    // 2_Constructores (nos permiten construir esos objetos)
    //public--> permite que sea visible fuera de la clase
    //nombre --> el nombre que toma el constructor es el mismo de la clase

    public Vehiculo() {

    }
    public Vehiculo(String fabricante, String modelo, int anio, boolean sport, double velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    // 3_Metodos(Comportamiento)
    public void acelerar(int cantidad){
        this.velocidad += cantidad;
    }
}
