package org.example.practica3;

import java.util.*;

public class PruebaMapas {

    public static void main(String[] args) {


        //CREACIÓN DE MAPAS
         Map<String, String> mapa = new HashMap<>();


         //AÑADIR ELEMENTOS /EDITAR
        mapa.put("marca","FIAT");
        mapa.put("modelo", "PUNTO");
        mapa.put("pais", "ITALIA");

        //EDITAR
        mapa.put("pais", "FRANCIA");

        //ELIMINAR
        mapa.remove("pais");
        mapa.put("procedencia", "FRANCIA");


        Set<String> claves = mapa.keySet();

        for(String clave : claves){
            //ACCEDER A VALORES A TRAVÉS DE UNA CLAVE
            System.out.println(clave + "-->" + mapa.get(clave));
        }

        System.out.println(mapa.get("modelo"));


        Map<String, Integer> alumnos = new HashMap<>();
        alumnos.put("Juan", 25);
        alumnos.put("María", 28);
        alumnos.put("Pepe", 19);
        alumnos.put("Cristina", 19);

        if( alumnos.containsKey("Pepe")){
            System.out.println("PEPE ESTA EN EL MAPA");
        }

        if( alumnos.containsValue(30)){
            System.out.println("HAY UN ALUMNO DE 30 AÑOS");
        }

        for(String nombreAlumno : alumnos.keySet()){
            Integer edad = alumnos.get(nombreAlumno); // EDAD
            if(edad ==19){
                System.out.println("El alumno " + nombreAlumno + " tiene 19 años"  );
            }
        }

        List<Integer> edades = new ArrayList<>(alumnos.values());
        System.out.println(edades);











    }
}
