package Estructuras.de.control.Repeticion;

public class ForEach {
    public static void main(String[] args) {

        String[] mascotas = {"Tina" , "Beli", "Kitty", "Gris", "Cachi", "Ari", "Pipi"};

        for (String nombre : mascotas) {
            System.out.println(nombre);
        }

        int[] arraysNumeros = {2, 4, 6, 8};
        int suma = 0;
        for (int numero : arraysNumeros){
            suma = suma + numero;
        }
        System.out.println(suma);
    }
}
