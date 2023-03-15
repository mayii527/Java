package org.mayii.ejemplos.set;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        //Ordena los elementos alfabéticamente y no repite elementos.
        Set<String> ts = new TreeSet<>(String::compareTo).descendingSet();
        ts.add("Uno");
        ts.add("Dos");
        ts.add("Tres");
        ts.add("Tres");
        ts.add("Cuatro");
        ts.add("Cinco");
        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>(Integer::compareTo).descendingSet();
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("numeros = " + numeros);
    }
}
