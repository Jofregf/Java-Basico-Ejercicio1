package Estructuras.de.control.Repeticion;

public class While {
    public static void main(String[] args) {

        // While se ejecutara siempre y cuando se cumpla una condicion

//        int contador = 0;
//
//        while (contador <= 5) {
//            System.out.println(contador);
//            contador++;
//        }

        // Los bucles se pueden romper con una condicion

        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            contador++;
            if (contador == 3) {
                //break; // Al llegar a 3 corta el bucle
                continue; // Al llegar a 3, se salta esa linea y sigue con el ciclo
            }
            System.out.println("El contador vale " + contador);
        }
    }
}
