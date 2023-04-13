package org.mayii.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        System.out.println("________________________ Tipo Stream__________________________");
        Stream<String> nombres = Stream.of("Milú", "Milo", "Lizzy", "Molly");
        nombres.forEach(System.out::println);

        System.out.println("________________________Array__________________________");

        String[] arr = {"Milú", "Milo", "Lizzy", "Molly"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        System.out.println("_______________________List___________________________");
        List<String> lista = new ArrayList<>();
        lista.add("Milú");
        lista.add("Milo");
        lista.add("Lizzy");
        lista.add("Molly");

        lista.stream().forEach(System.out::println);
    }
}
