package Programacion.Orientada.Objetos.SinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCrud = new EmpleadoCRUDV1();

        Empleado ari = new Empleado("Ari", 6, 125000.89, true);
        Empleado beli = new Empleado("Belindo", 13, 2500000.74, true);
        Empleado tina = new Empleado("Tina", 23, 158000.58, false);

        // guardar empleados
        empleadoCrud.guardar(ari);
        empleadoCrud.guardar(beli);
        empleadoCrud.guardar(tina);

        // consultar empleados
        List<Empleado> empleados = empleadoCrud.verTodos();
        System.out.println(empleados);
    }
}
