package com.campus.open.bootcamp;

public class TipoDatos {
    public static void main(String[] args) {

        //Tipos de datos primitivos

        // 1_Numericos
        //1.1_Enteros
        byte numero = 2; // ocupan 1 byte
        System.out.println("Este es un tipo de dato numerico byte " + numero);

        short numero2 = 10; // ocupan 2 byte
        System.out.println("Este es un tipo de dato numerico short " + numero2);

        int numero3 = 115; // ocupan 4 byte
        System.out.println("Este es un tipo de dato numerico int " + numero3);

        long numeroGrande = 2612511584625584256L;
        System.out.println("Este es un tipo de dato numerico long " + numeroGrande);

        //1.2_Decimales
        float decimalPequenio = 6.25f; // los float son de menor capacidad que los double
        System.out.println("Este es un tipo de dato numerico float " + decimalPequenio);
        double numeroPi = 3.141592653589793238462643383d;
        System.out.println("Este es un tipo de dato numerico double " + numeroPi);

        //2_Booleanos
        boolean isCasado = false;
        System.out.println("La persona esta casada? " + isCasado);

        boolean tieneGato = true;
        System.out.println("La persona tiene como mascota un gato? " + tieneGato);

        //3_Strings

        String nombreMascota = "Ari";
        System.out.println("El nombre de la mascota es " + nombreMascota);

    }
}
