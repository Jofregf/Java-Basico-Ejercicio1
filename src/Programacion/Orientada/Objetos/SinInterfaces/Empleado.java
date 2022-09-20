package Programacion.Orientada.Objetos.SinInterfaces;

public class Empleado {

    String nombre;
    int edad;
    double salario;
    boolean activo;

    public Empleado(){

    }

    public Empleado(String nombre, int edad, double salario, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.activo = activo;
    }

    // generamos este metodo para que al imprimir los empleados, nos muestre los datos y no la referencia en memoria
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", activo=" + activo +
                '}';
    }
}
