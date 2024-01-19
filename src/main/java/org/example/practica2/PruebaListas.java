package org.example.practica2;

import java.util.ArrayList;
import java.util.List;

public class PruebaListas {


    public static void main(String[] args) {


        //CREACION Y DEFINICION DE LISTAS
        //lista = ["verde", "rojo", "azul", "amarillo"]
        List<String> lista = new ArrayList<>();


        //AÑADIR ELEMENTOS
        lista.add("verde");
        lista.add("rojo");
        lista.add("azul");
        lista.add("amarillo");
        lista.add("amarillo");
        lista.add("amarillo");
        lista.add(2,"naranja");
        lista.add(2,"blanco");
        lista.addAll(List.of("púrpura", "marrón", "dorado"));


        //ELIMINAR
        lista.remove("amarillo");
        lista.removeAll(List.of("amarillo", "marrón", "verde"));
        lista.remove(0);


        //OBTENER ELEMENTOS
        String elemento = lista.get(2);
        Integer num = lista.indexOf("naranja");

        //SI UN ELEMENTO ESTA CONTENIDO EN UNA LISTA
        // elemento in lista
        Boolean esta = lista.contains("dorado");
        Boolean noesta = lista.contains("violeta");
        Boolean estan = lista.containsAll(List.of("azul", "naranja"));
        Boolean noestan = lista.containsAll(List.of("azul", "violeta"));




        System.out.println(lista);
        System.out.println(estan);
        System.out.println(noestan);
        System.out.println(num);
        System.out.println(elemento);



        List<String> lista1 = new ArrayList<>(List.of("españa", "portugal", "francia", "italia"));
        List<String> lista2 = List.of("portugal", "italia", "alemania", "Inglaterra");

        lista1.retainAll(lista2);

        System.out.println(lista1);







    }

}
