package org.mayii.java8.lambda;

import org.mayii.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> {
            System.out.println("¡" + nombre + " tiene " + edad + " años!");
        };
        consumidorBi.accept("Mayii", 21);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("¡Hola mundo!  ...  Lambda.");

        List<String> nombres = Arrays.asList("Mayii", "Thalii", "Fernando", "Hunter");
        nombres.forEach(consumidor2);

        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) ->{
          persona.setNombre(nombre);
        };
        asignarNombre.accept(usuario, "Mayii_C21");
        System.out.println("Nombre ususario: " + usuario.getNombre());
    }

}
