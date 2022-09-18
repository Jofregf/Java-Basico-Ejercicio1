package Estructuras.de.control.Repeticion;

public class For {
    public static void main(String[] args) {

        // El bucle for nos permite iterar en arrays

        String[] mascotas = {"Tina" , "Beli", "Kitty", "Gris", "Cachi", "Ari", "Pipi"};

        for (int i = 0; i < mascotas.length; i++) {
            System.out.println(i + " " + mascotas[i]);
        }
    }
}
