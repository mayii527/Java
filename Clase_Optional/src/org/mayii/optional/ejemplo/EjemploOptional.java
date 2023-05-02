package org.mayii.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Mayii";
        Optional<String> opt = Optional.of(nombre);

        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());

        if (opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }
    }
}
