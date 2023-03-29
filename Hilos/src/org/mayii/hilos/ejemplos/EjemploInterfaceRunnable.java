package org.mayii.hilos.ejemplos;

import org.mayii.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla de pascua.")).start();
        new Thread(new ViajeTarea("Cancun.")).start();
        new Thread(new ViajeTarea("Republica de Korea.")).start();
        new Thread(new ViajeTarea("Ciudad de mexico.")).start();
        new Thread(new ViajeTarea("Europa.")).start();
    }
}
