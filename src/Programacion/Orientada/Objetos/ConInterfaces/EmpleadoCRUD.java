package Programacion.Orientada.Objetos.ConInterfaces;

import Programacion.Orientada.Objetos.SinInterfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    //solo declara metodos, no los implementa
    //Actua como un contrato, dice que hay  que hacer pero no lo hace

    void guardar(Empleado empleado);

    List<Empleado> verTodos();

    void eliminar(Empleado empleado);
}
