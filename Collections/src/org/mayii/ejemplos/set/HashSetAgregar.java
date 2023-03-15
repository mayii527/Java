package org.mayii.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetAgregar {
    public static void main(String[] args) {

        //HashSet no permite elementos duplicados.
        Set<String> hs = new HashSet<>();
        hs.add("Uno");
        hs.add("Dos");
        hs.add("Tres");
        hs.add("Cuatro");
        hs.add("Cinco");
        System.out.println(hs);


    }
}
