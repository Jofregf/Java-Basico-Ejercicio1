package Programacion.Orientada.Objetos.SinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {

    //Creamos un array list que simulará ser una base de datos
    // Esto de List, es una interface define una serie de metodos pero no los hace,
    // sino que una clase implementa esa interface y realiza esos metodos.
    private List<Empleado> empleados = new ArrayList<>();

    //CREATE-guardar un empleado, en la estructura de datos List<Empleado> empleados
    public void guardar(Empleado empleado){
        empleados.add(empleado);

    }

    // Recuperar empleados
    public List<Empleado> verTodos(){
        return empleados;
    }
}
