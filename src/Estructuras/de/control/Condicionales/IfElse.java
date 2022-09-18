package Estructuras.de.control.Condicionales;

public class IfElse {
    public static void main(String[] args) {
        // Se usa si quiere evaluarse una condicion, que en caso de cumplirse
        // se realiza una cosa diferente a que si no se cumple

        int edad = 17;

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }

        // Puede hacerse lo mismo de guardar la condicion en una variable

        boolean esMayor = edad >= 18;

        if (esMayor) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}
