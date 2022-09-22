package Ejercicio.Tema789;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicios789 {

    //Escribe el código que devuelva una cadena al revés.
    // Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    public static class TextoReves {
        public static void main(String[] args) {

            String saludo = "Hola mundo";
            StringBuilder metodos = new StringBuilder(saludo);
            String reves = metodos.reverse().toString();
            System.out.println(reves);
        }
    }

    //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static class ArrayUnidimensional {
        public static void main(String[] args) {
            String[] arrayLenguajes = {"Java", "JavaScript", "Python"};
            for (String lenguaje : arrayLenguajes){
                System.out.println(lenguaje);
            }
        }
    }

    //Crea un array bidimensional de enteros y recórrelo,
    // mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static class ArrayBidimensional {
        public static void main(String[] args) {
            Integer[][] numeros = {
                    {1, 2, 3, 4},
                    {100, 200, 300, 400}
            };

            for(int i = 0; i < numeros.length; i++){
                for(int j = 0; j < numeros[i].length; j++){
                    System.out.println("Fila: "+ i +" Columna: " + j +"\n el valor es: " + numeros[i][j]+"\n");
                }
            }
        }
    }

    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
    //Elimina el 2o(posicion 1) y 3er(posicion 2) elemento y muestra el resultado final.
    public static class EjercicioVector {
        public static void main(String[] args) {

            Vector<String> mascotas = new Vector<>();
            mascotas.add("Cachi");
            mascotas.add("Tina");
            mascotas.add("Beli");
            mascotas.add("Kitty");
            mascotas.add("Ari");

            System.out.println("vector con todos los datos: " + mascotas);

            //Borro de atras para adelante para que no se reasignen los indices luego de eliminar
            mascotas.remove(2);
            mascotas.remove(1);

            System.out.println("vector luego de eliminar el 2do y 3er elemento: " + mascotas);

            //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto
            // si tuviésemos 1000 elementos para ser añadidos al mismo.
            System.out.println("Se desperdicia memoria, ya que al sobrepasar la capacidad por defecto," +
                    " la dimension del vector se duplica");
        }
    }

    //Crea un ArrayList de tipo String, con 4 elementos.
    // Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    public static class EjercicioArrayList {
        public static void main(String[] args) {

            ArrayList<String> listaVerduras = new ArrayList<>();
            listaVerduras.add("Tomates");
            listaVerduras.add("Paltas");
            listaVerduras.add("Papas");
            listaVerduras.add("Zanahorias");

            LinkedList<String> linkedListVerduras = new LinkedList<>();

            for (String verdura : listaVerduras){
                linkedListVerduras.add(verdura);
                System.out.println("Los elementos del ArrayList: " + verdura);
            }

            for(String elementos : linkedListVerduras){
                System.out.println("Los elementos de la LinkedList: " + elementos);
            }
        }
    }

    //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
    // Por último, vuelve a recorrerlo y muestra el ArrayList final.
    // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

    public static class ArrayListNumeros {
        public static void main(String[] args) {

            ArrayList<Integer> ciclonumeros = new ArrayList<>();
            for (int i = 1; i <=10 ; i++){
                ciclonumeros.add(i);
            }
            System.out.println(ciclonumeros);
            for(int i = 0; i < ciclonumeros.size(); i++){
                if(ciclonumeros.get(i) % 2 == 0) {
                    ciclonumeros.remove(i);
                }
            }
            System.out.println(ciclonumeros);
        }
    }
    /*
    Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
     a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
     Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
     Finalmente, mostraremos en cualquier caso: "Demo de código".
     */
    public static class DivideporCero {

        public static int Dividir(int num1, int num2) throws ArithmeticException{
            return num1/num2;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Agrega los numeros que deseas dividir");
            System.out.println("numero1: ");
            int num1 = scanner.nextInt();
            System.out.println("numero2: ");
            int num2 = scanner.nextInt();
            try {
                System.out.println("El resultado es: " + Dividir(num1, num2));
            }catch (ArithmeticException e){
                System.out.println("Esto no puede hacerse " + e.getMessage());
            }finally {
                System.out.println("Demo de código");
            }
        }
    }
    /*
    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    La tarea de la función será realizar la copia del fichero dado en el
    parámetro "fileIn" al fichero dado en "fileOut".
   */
    public static class CopiaFichero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el archivo: ");
            String fileIn = scanner.nextLine();
            System.out.println("Ingrese el archivo");
            String fileOut = scanner.nextLine();
            copiar(fileIn, fileOut);
        }

        public static void copiar(String fileIn, String fileOut) {
            try{
                InputStream in = new FileInputStream(fileIn);
                byte[] files = in.readAllBytes();
                in.close();

                PrintStream out = new PrintStream(fileOut);
                out.write(files);
                out.close();
            }catch(Exception e){
                System.out.println("La exception es: " + e.getMessage());
            }
        }
    }
    /*
    Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
    un HashMap y un ArrayList, LinkedList o array.
    SE CREA UNA APP DONDE SE LEE UN FICHERO, Y LUEGO ESE FICHERO PUEDE COPIARSE EN LA UBICACION DADA
    */
    public static class CopiarImagen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el archivo: ");
            String fileIn = scanner.nextLine();
            System.out.println("Ingrese el archivo");
            String fileOut = scanner.nextLine();
            leerArchivo(fileIn, fileOut);


        }

        public static void leerArchivo(String fileIn, String fileOut) {

            int contador = 0;
//            int[] datosEntrada = new int[contador];
            Vector<Integer> datosEntrada = new Vector<>();

            try {
                FileInputStream archivoLectura = new FileInputStream(fileIn);
                boolean finalArchivo = false;
                while (!finalArchivo) {
                    int byteLectura = archivoLectura.read();
                    if(byteLectura != -1) {
                        datosEntrada.add(contador, byteLectura);
                    } else {
                        finalArchivo = true;
                    }
                    //System.out.println(datosEntrada);
                    contador++;
                }
                archivoLectura.close();
            } catch (IOException e) {
                System.out.println("Error al acceder al archivo" + e.getMessage());
            }
            System.out.println("la cantidad de byte es: " + contador);
            crearArchivo(datosEntrada, fileOut);
        }

        public static void crearArchivo(Vector datosNuevos, String fileOut){
            try {
                FileOutputStream nuevoArchivo = new FileOutputStream(fileOut);
                for(int i = 0; i < datosNuevos.size(); i++) {
                    nuevoArchivo.write((Integer) datosNuevos.get(i));
                }
                nuevoArchivo.close();
            }catch(IOException e){
                System.out.println("Error al crear el archivo: " + e.getMessage());

            }
        }
    }
}
