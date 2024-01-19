package org.example;

import java.time.*;

public class MainFechas {

    public static void main(String[] args) {


        //DECLARAR FECHAS

        LocalDate fecha = LocalDate.of(2002, Month.OCTOBER, 23);
        LocalDate fechaActual = LocalDate.now();

        LocalTime hora = LocalTime.of(15,10);
        LocalTime horaActual = LocalTime.now();

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        LocalDateTime fechaHora = LocalDateTime.of(1987, 1,15, 11,45,13);

        System.out.println(fecha);
        System.out.println(horaActual);
        System.out.println(fechaHora);


        //OPERACIONES
        Period periodo = Period.between(fecha, fechaActual);
        Integer edad = periodo.getYears();
        System.out.println("Mi edad es " + edad);

        Integer minutos = Math.toIntExact(Duration.between(hora, horaActual).getSeconds())/ 60;
        System.out.println("Han pasado " + minutos + " minutos");

        LocalDateTime finAbono = fechaHoraActual.plusMonths(3);
        System.out.println("La fecha fin de mi abono es : " + finAbono);


        //COMPROBACIONES
        finAbono.isAfter(LocalDateTime.now());


        String dni = "12345678A";


        boolean longitudCorrecta = dni.length() == 9;
        dni.substring(0,8).matches("[0-9]");
        dni.substring(8).matches("[A-Za-z]");






    }


}
