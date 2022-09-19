package Ejercicio.Tema4SmarDevice;

public class Main {
    public static void main(String[] args) {

        SmartPhone dispositivo = new SmartPhone();
        dispositivo.sistOperativo = "android";
        dispositivo.marca = "Samsung";
        dispositivo.modelo = "A32";
        dispositivo.pantalla = 6.4;
        dispositivo.gama = "media";
        dispositivo.tipoPantalla = "FHD + SUPER AMOLED";

        System.out.println("Sistema Operativo: " + dispositivo.sistOperativo);
        System.out.println("Marca: " + dispositivo.marca);
        System.out.println("Modelo: " + dispositivo.modelo);
        System.out.println("Tamanio pantalla: " + dispositivo.pantalla);
        System.out.println("Gama: " + dispositivo.gama);
        System.out.println("Tipo pantalla: " + dispositivo.tipoPantalla);

        SmartWatch reloj = new SmartWatch();
        reloj.sistOperativo = "android";
        reloj.marca = "Xiaomi";
        reloj.modelo = "Mi Smart Band 6";
        reloj.pantalla = 1.56;
        reloj.appSalud = true;
        System.out.println("Sistema Operativo: " + reloj.sistOperativo);
        System.out.println("Marca: " + reloj.marca);
        System.out.println("Modelo: " + reloj.modelo);
        System.out.println("Tamanio pantalla: " + reloj.pantalla);
        System.out.println("Posee app de salud? : " + reloj.appSalud);



    }
}
