package Estructuras.de.control.Condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        // se utiliza cuando hay multiples condiciones

        String diaDeLaSemana = "Viernes";

        if (diaDeLaSemana.equals("Lunes")) {
            System.out.println("Mierda de Lunes");
        } else if (diaDeLaSemana.equals("Martes")) {
            System.out.println("Dios de la guerra");
        } else if (diaDeLaSemana.equals("Miercoles")) {
            System.out.println("En la cima de la montania");
        } else if (diaDeLaSemana.equals("Jueves")) {
            System.out.println("Bajando la montania");
        } else if (diaDeLaSemana.equals("Viernes")) {
            System.out.println("Y tu cuerpo lo sabe");
        } else if ((diaDeLaSemana.equals("Sabado")) || (diaDeLaSemana.equals("Domingo"))) {
            System.out.println("Fin de semana...descancito");
        } else {
            System.out.println("No es un dia de la semana");
        }
    }
}
