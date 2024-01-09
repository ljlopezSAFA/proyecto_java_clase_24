package org.example.practica1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la cadena de prueba");
        String cadena = scanner.nextLine();

        //EJERCICIO 1
        String cadenaEnMinusculas = ManipuladorCadenas.pasarAMinusculas(cadena);
        System.out.println("Tu cadena en minusculas: " + cadenaEnMinusculas);

        //EJERCICIO 2
        String cadenaenMayusculas = ManipuladorCadenas.pasarAMayusculas(cadena);
        System.out.println("Tu cadena en mayúsculas: " + cadenaenMayusculas);

        //EJERCICIO 3
        String  prueba = "Martes"; // "setraM"
        System.out.println(ManipuladorCadenas.invertirCadena(prueba));

        //EJERCICIO 4
        System.out.println(ManipuladorCadenas.contadorVocales("aeioufgrtfgrtra"));

        //EJERCICIO 5
        System.out.println(ManipuladorCadenas.concatenar("hola", "adios", "---"));

        //EJERCICIO 7
        System.out.println(ManipuladorCadenas.contadorVocal("holala", 'a'));
    }



}
