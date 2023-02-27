package org.mayii.poointerfaces.imprenta;

import org.mayii.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Mayii Cadavid", "Dessarrolladora", "Resumen laboral...");
        cv.addExperiancia("Java");
        cv.addExperiancia("Python");
        cv.addExperiancia("JavaScript");
        cv.addExperiancia("HTML");
        cv.addExperiancia("CSS");

        Libro libro = new Libro("Meghan Maxwell", "Noches blancas", Genero.ROMANCE);
        libro.addPagina(new Pagina("Primer capitulo"))
                .addPagina(new Pagina("Segunda pagina"))
                .addPagina(new Pagina("Tercera pagina"));

        Informe informe = new Informe("Martin Fowler", "James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
