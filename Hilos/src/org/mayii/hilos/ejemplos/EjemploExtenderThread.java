package org.mayii.hilos.ejemplos;

import org.mayii.hilos.ejemplos.threads.NombreThreads;

public class EjemploExtenderThread {

    public static void main(String[] args) {
        Thread hilo1 = new NombreThreads("Mayii");
        hilo1.start();

        Thread hilo2 = new NombreThreads("Thaliana");
        hilo2.start();

        System.out.println(hilo1.getState());
    }
}
