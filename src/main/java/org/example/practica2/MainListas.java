package org.example.practica2;

import java.util.ArrayList;
import java.util.List;

public class MainListas {

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();


        System.out.println(ManipuladorListas.agregarElementoAlFinal(miLista,"Solomillo"));
        System.out.println(ManipuladorListas.agregarElementoAlFinal(miLista,"Ensaladilla"));

    }
}
