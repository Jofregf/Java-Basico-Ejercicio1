package Estructuras.de.control.Repeticion;

public class DoWhile {
    public static void main(String[] args) {

        // Este bucle se ejecutara aunque sea una vez aunque la condicion no se esté cumpliendo

        int contador = 0;

        do {
            System.out.println("El contador vale " + contador);
            contador++;
        } while (contador < 3);
    }
}
