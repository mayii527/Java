package org.mayii.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        System.out.println("________________________ Operador Map__________________________");

        Stream<String> nombres = Stream.of("Milú", "Milo", "Lizzy", "Molly")
                .map(nombre ->{
                    return nombre.toUpperCase();
        });
        nombres.forEach(System.out::println);

    }
}
