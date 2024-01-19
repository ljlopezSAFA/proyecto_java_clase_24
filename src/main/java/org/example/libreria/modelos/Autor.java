package org.example.libreria.modelos;

import java.time.LocalDate;

public class Autor {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String paisOrigen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


    public Autor(String nombre, String apellidos, LocalDate fechaNacimiento, String paisOrigen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.paisOrigen = paisOrigen;
    }


    public Autor() {
    }


    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
