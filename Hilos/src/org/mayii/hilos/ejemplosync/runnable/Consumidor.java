package org.mayii.hilos.ejemplosync.runnable;

import org.mayii.hilos.ejemplosync.Panaderia;

public class Consumidor implements Runnable {
    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

    }
}
