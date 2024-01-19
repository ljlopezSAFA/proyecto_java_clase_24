package org.example;

import org.example.libreria.enumerados.FormatoLibro;
import org.example.libreria.modelos.Autor;
import org.example.libreria.modelos.Libro;

import java.time.LocalDate;
import java.util.List;


public class MainLibros {

    public static void main(String[] args) {

        //CREAR UN OBJETO LIBRO
        Libro libro = new Libro();
        libro.setTitulo("Harry Potter y la Piedra Filosofal");
        Autor autor = new Autor("JK",  "Rowling", LocalDate.of(1956, 4, 15), "Inglaterra" );
        libro.setAutor(autor);
        libro.setEditorial("Anaya");
        libro.setPrecio(15.6);
        libro.setFormatoLibro(FormatoLibro.TAPA_DURA);
        libro.setNumPaginas(150);


        Libro libro2 = new Libro("Harry Potter y la Cámara Secreta", autor, 350);
        System.out.println(libro);
        System.out.println(libro2);

        boolean sonIguales = libro.equals(libro2);

        Integer total = UtilidadesLibro.sumaPaginasLibros(List.of(libro, libro, libro2));

        System.out.println(total);













    }
}
