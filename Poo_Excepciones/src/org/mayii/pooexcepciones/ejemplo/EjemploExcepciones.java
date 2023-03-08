package org.mayii.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Ingresa un entero: ");
        try {
            int divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println(division);
        } catch (NumberFormatException nfe){
            System.out.println("Se detecto una excepción, ingresa un valor numérico: " + nfe.getMessage());
            main(args);
        }
        catch (ArithmeticException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
            main(args);

        }
        finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción.");
            main(args);

        }
        System.out.println("Continuemos con el flujo de nuestra aplicación");
    }
}
