package org.mayii.ejemplos.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> personas = new HashMap<>();
        personas.put("Mayii", 21);
        personas.put("Thaliana", 4);
        personas.put("Shara", 31);
        personas.put("Milo", 31);
        personas.put("Fernando", 56);

        System.out.println("personas = " + personas);

        //Metodos para eliminar
        personas.remove("Milo");
        System.out.println("personas = " + personas);



    }
}
