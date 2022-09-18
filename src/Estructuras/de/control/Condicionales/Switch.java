package Estructuras.de.control.Condicionales;

public class Switch {
    public static void main(String[] args) {

        // Tambien evaluan multiples condiciones

        String dia = "Domingasdfas";

        switch(dia) {
            case "Lunes":
                System.out.println("Iniciamos la semana, animooooo!!!!");
                break;
            case "Martes":
                System.out.println("Pasamos el primer dia");
                break;
            case "Miercoles":
                System.out.println("Llegamos a la cima");
                break;
            case "Jueves":
                System.out.println("Cuesta abajoooooooo");
                break;
            case "Viernes":
                System.out.println("Hoy es viernes y tu cuerpo lo sabe");
                break;
            case "Sabado":
            case "Domingo":
                System.out.println("Estamos en el finde");
                break;
            default:
                System.out.println("Ehhh eso no es un dia");
        }
    }
}
