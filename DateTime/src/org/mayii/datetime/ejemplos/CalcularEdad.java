package org.mayii.datetime.ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {

        System.out.print("Ingrese un fecha de nacimiento con formato yyyy-MM-dd: ");
        Scanner scanner = new Scanner(System.in);
        String fechaSTR = scanner.next();

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.parse(fechaSTR, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        long edad = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        System.out.printf("Tu tienes " + edad + " años de edad.");
    }
}
