package org.example.practica1;

public class ManipuladorCadenas {

    //EJERCICIO1
    public static String pasarAMinusculas(String texto){
        return texto.toLowerCase();
    }

    //EJERCICIO2
    public static String pasarAMayusculas(String texto){
        return texto.toUpperCase();
    }

    //EJERCICIO3
    public static String invertirCadena(String texto){

        //Convertimos nuestro texto a string builder
        StringBuilder textoBuilder = new StringBuilder(texto);

        //Cambiando el orden del string builder para luego convertirlo nuevamente en String
        return textoBuilder.reverse().toString();

    }

    public static String invertirCadenaAMano(String texto){

        String textoAlReves = "";

        for (int i = texto.length()-1 ; i >= 0; i--){
            textoAlReves += String.valueOf(texto.charAt(i));
        }

        return textoAlReves;
    }


    //EJERCICIO 4
    public static Integer contadorVocales(String texto){

        //for letra in palabra :
        //if letra == "a" or letra == "e"
        //  contador +=1

        Integer contador = 0;

        for(char letra: texto.toCharArray()){
            if(letra == 'a' || letra == 'e'|| letra == 'i' || letra == 'o' || letra == 'u'){
                contador++;
            }
        }

        return contador;
    }


    //EJERCICIO 5
    public static String concatenar(String texto, String texto2, String separador){
        return texto + separador + texto2;
    }

    //EJERCIO 6
    public static Boolean esPalindromo(String texto){

        // texto = textoAlreves
        String textoAlReves = invertirCadena(texto);
        return texto.equals(textoAlReves);
    }

    //EJERCIO 7
    public static Integer contadorVocal(String texto, char vocal){


        Integer contador = 0;

        for(char letra: texto.toCharArray()){
            if(letra == vocal){
                contador++;
            }
        }

        return contador;
    }


    //EJERCICIO 9
    public static Integer contadorConsonantes(String texto){

        //abecedario lunes

        //quitarle los espacios
        texto = texto.replace(" ", "");

        //Calcular tamaño del texto
        Integer tamanyoPalabra = texto.length();
        Integer numVocalesTexto = contadorVocales(texto);

        return tamanyoPalabra - numVocalesTexto;

    }

    }
