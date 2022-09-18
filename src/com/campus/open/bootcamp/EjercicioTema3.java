package com.campus.open.bootcamp;

public class EjercicioTema3 {
    public static void main(String[] args) {

        String[] palabras = {"hola", "mi" , "nombre", "es", "Ari"};

        String frase = "";
        for (int i = 0; i < palabras.length; i++) {
            frase = frase + " " + palabras[i];
        }
        System.out.println(frase);
    }
}
