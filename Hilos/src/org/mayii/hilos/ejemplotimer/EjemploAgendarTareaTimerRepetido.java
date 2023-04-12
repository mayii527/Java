package org.mayii.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerRepetido {
    public static void main(String[] args) {

        AtomicInteger count = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                int i = count.getAndDecrement();
                if (i > 0) {
                    System.out.println("Tarea " + i + " realizada en " + new Date() + "| Nombre del Thread: " +
                            Thread.currentThread().getName());
                } else {
                    System.out.println("Finalizado");
                    timer.cancel();
                }
            }
        }, 5000, 10000);
        System.out.println("Agendamos una tarea para 5 segundos mas...");
    }
}
