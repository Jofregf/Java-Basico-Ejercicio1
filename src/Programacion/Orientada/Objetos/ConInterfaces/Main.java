package Programacion.Orientada.Objetos.ConInterfaces;

import Programacion.Orientada.Objetos.SinInterfaces.Empleado;

public class Main {
    static EmpleadoCRUD empleadoCRUD;
    public static void main(String[] args) {

        empleadoCRUD.verTodos();
        empleadoCRUD.guardar(new Empleado());
    }
}
