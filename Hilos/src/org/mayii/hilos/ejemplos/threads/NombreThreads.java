package org.mayii.hilos.ejemplos.threads;

public class NombreThreads extends Thread {
    public NombreThreads(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Comineza la ejecucion del hilo: " + getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(i+": " + this.getName());
        }

        System.out.println("Termina la ejecucion del hilo: " + getName());
    }
}
