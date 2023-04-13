package org.mayii.java8.lambda.task;

import java.util.function.Function;

public class DeleteSpace {
    public static void main(String[] args) {
        /*
        Expresión Lambda que elimina espacios, comas
        y puntos de una frase y además devuelve la frase convertida en mayúscula.
        */

        Function<String, String> phrase = param -> "Frase sin espacios: " + param.replace(" ", "")
                .replace(",", "").replace(".", "").toUpperCase();

        String rf = phrase.apply("Hola mundo, desde Java...");
        System.out.println(rf);
    }
}
