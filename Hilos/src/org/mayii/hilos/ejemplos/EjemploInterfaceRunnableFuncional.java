package org.mayii.hilos.ejemplos;

public class EjemploInterfaceRunnableFuncional {
    public static void main(String[] args) {
        Runnable viaje = () -> {
            {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + ": " + Thread.currentThread().getName());
                    System.out.println("Viajare a " + Thread.currentThread().getName());
                }
            }
        };
        new Thread(viaje, "Isla de pascua.").start();
        new Thread(viaje, "Cancun.").start();
        new Thread(viaje, "Republica de Korea.").start();
        new Thread(viaje, "Ciudad de mexico.").start();
        new Thread(viaje, "Europa.").start();

        System.out.println("Continuando ejecucion");
    }
}
