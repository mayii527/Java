package org.mayii.api.stream.ejemplos;

import java.util.Arrays;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Mayii", "Sara", "Thali", "Fernando");
        nombres.forEach(System.out::println);

        System.out.println("__________________________________________________");

        String[] arr = {"Mayii", "Sara", "Thali", "Fernando"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);
    }
}
