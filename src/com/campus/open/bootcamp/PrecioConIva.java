package com.campus.open.bootcamp;

public class PrecioConIva {

    public static void main(String[] args) {

        getPrecioTotal(75.00);
    }

    public static void getPrecioTotal(double precio) {
        float iva = 21.00f;
        double resultado = precio + (precio * (iva/100));
        System.out.println("El precio con IVA incluido es " + resultado);
    }


}
