package Programacion.Orientada.Objetos.ConInterfaces;

import Programacion.Orientada.Objetos.SinInterfaces.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD{
    //se deben implementar los metodos
    // se puede implementar más de una interface

    @Override
    public void guardar(Empleado empleado) {

    }

    @Override
    public List<Empleado> verTodos() {
        return null;
    }

    @Override
    public void eliminar(Empleado empleado) {

    }



}
