package org.mayii.poointerfaces.imprenta;
import org.mayii.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Mayii Cadavid","Dessarrolladora","Resumen laboral...");
        cv.addExperiancia("Java");
        cv.addExperiancia("Python");
        cv.addExperiancia("JavaScript");
        cv.addExperiancia("HTML");
        cv.addExperiancia("CSS");

        Informe informe = new Informe("Martin Fowler","James", "Estudio sobre microservicios");
        imprimir(cv);
        imprimir(informe);
    }
    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
