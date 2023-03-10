package org.mayii.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploException {
    public static void main(String[] args) throws DivisionPorZeroException {

        Calculadora cal = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingresa un entero: ");
        int divisor;
        double division;

        try {
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println(division);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepción, ingresa un valor numérico: " + nfe.getMessage());
            main(args);


        } catch (DivisionPorZeroException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
            main(args);

        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción.");
            main(args);
        }
        System.out.println("Continuemos con el flujo de nuestra aplicación");
    }
}
