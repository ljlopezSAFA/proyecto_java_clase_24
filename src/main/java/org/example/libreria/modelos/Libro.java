package org.example.libreria.modelos;

import org.example.libreria.enumerados.FormatoLibro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Libro {


    //DEFINIR LOS ATRIBUTOS DE UN OBJETO

    //ATRIBUTOS
    private String titulo;

    private Autor autor;

    private String editorial;

    private Integer numPaginas;

    private Double precio;

    private Boolean esActoParaninyos;

    private LocalDate fechaPublicacion;

    private LocalDateTime fechaLanzamiento;

    private FormatoLibro formatoLibro;


    //GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getEsActoParaninyos() {
        return esActoParaninyos;
    }

    public void setEsActoParaninyos(Boolean esActoParaninyos) {
        this.esActoParaninyos = esActoParaninyos;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public FormatoLibro getFormatoLibro() {
        return formatoLibro;
    }

    public void setFormatoLibro(FormatoLibro formatoLibro) {
        this.formatoLibro = formatoLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numPaginas=" + numPaginas +
                ", precio=" + precio +
                ", esActoParaninyos=" + esActoParaninyos +
                ", fechaPublicacion=" + fechaPublicacion +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", formatoLibro=" + formatoLibro +
                '}';
    }

    public Libro(String titulo, Autor autor){
        this.titulo = titulo;
        this.autor = autor;

    }

    public Libro(String titulo, Autor autor, Integer numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Libro( Autor autor, Integer numPaginas){
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Libro(){

    }

    public Libro(Libro libro){
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
    }

    public Libro(String titulo, Autor autor, String editorial, Integer numPaginas, Double precio, Boolean esActoParaninyos, LocalDate fechaPublicacion, LocalDateTime fechaLanzamiento, FormatoLibro formatoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.precio = precio;
        this.esActoParaninyos = esActoParaninyos;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.formatoLibro = formatoLibro;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo)
                && Objects.equals(autor, libro.autor)
                && Objects.equals(editorial, libro.editorial)
                && Objects.equals(numPaginas, libro.numPaginas)
                && Objects.equals(precio, libro.precio)
                && Objects.equals(esActoParaninyos, libro.esActoParaninyos)
                && Objects.equals(fechaPublicacion, libro.fechaPublicacion)
                && Objects.equals(fechaLanzamiento, libro.fechaLanzamiento)
                && formatoLibro == libro.formatoLibro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, editorial, numPaginas, precio, esActoParaninyos, fechaPublicacion, fechaLanzamiento, formatoLibro);
    }
}
