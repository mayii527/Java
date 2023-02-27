package org.mayii.poointerfaces.imprenta;

import org.mayii.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Mayii", "Cadavid"),
                "Desarrolladora", "Resumen laboral...");
        cv.addExperiancia("Java")
                .addExperiancia("Python")
                .addExperiancia("JavaScript")
                .addExperiancia("HTML")
                .addExperiancia("CSS");

        Libro libro = new Libro(new Persona("Meghan", "Maxwell"), "Noches blancas",
                Genero.ROMANCE);
        libro.addPagina(new Pagina("Primer capitulo"))
                .addPagina(new Pagina("Segunda pagina"))
                .addPagina(new Pagina("Tercera pagina"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("Mayii", "Cadavid"), "Estudio sobre Microservices");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
