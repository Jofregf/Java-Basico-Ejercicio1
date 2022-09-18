package Estructuras.de.control.Condicionales;

public class If {
    public static void main(String[] args) {
        // En caso de que solo se quiera evaluar una condicion y que si no se cumple no suceda nada
        int edad = 17;

        if (edad <= 17) {
            System.out.println("La persona es menor de edad");
        }

        // Tambien puede hacerse por medio de una variable

        boolean esMayor = edad <= 18;

        if (esMayor) {
            System.out.println("La persona es menor de edad");
        }
    }
}
