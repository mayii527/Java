package org.mayii.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Mayii";
        Optional<String> opt = Optional.of(nombre);

        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());

        opt.ifPresent(s -> System.out.println("Hola " + s));
    }
}
