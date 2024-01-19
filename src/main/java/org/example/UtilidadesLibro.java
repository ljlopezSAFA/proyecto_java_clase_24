package org.example;

import org.example.libreria.modelos.Libro;
import java.util.List;

public class UtilidadesLibro {


    /**
     * Método que recibiendo dos libros me devuelva el total de páginas de ambos libros
     *
     */
    public static Integer sumaPaginasLibros(Libro libro1, Libro libro2){

        //Obtener páginas del libro1
        Integer numPaginasLibro1 = libro1.getNumPaginas();

        //Obtener las páginas del libro2
        Integer numPaginasLibro2 = libro2.getNumPaginas();

        //Total de páginas
        Integer sumaPaginas = numPaginasLibro1 + numPaginasLibro2;

        //Devolver el resultado
        return sumaPaginas;

    }


    /**
     * Sumar todas las páginas de la lista de libros que le paso
     */
    public static  Integer sumaPaginasLibros(List<Libro> libros){

        Integer sumaPaginas = 0;

        for(Libro libro :libros ){
            sumaPaginas += libro.getNumPaginas();
        }

        return sumaPaginas;

    }




}
