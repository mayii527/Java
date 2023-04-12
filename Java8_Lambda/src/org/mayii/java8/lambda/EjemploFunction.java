package org.mayii.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        Function<String, String> funcion1 = param -> "Hola que tal! " + param;
        String resultado = funcion1.apply("mayii");
        System.out.println(resultado);

        Function<String, String> function2 = String::toUpperCase;
        System.out.println(function2.apply("mayii"));

        BiFunction<String, String, String> funcion3 = (a,b) -> a.concat(b);
        System.out.println(funcion3.apply("Mayii", "Cadavid"));

    }
}
