package org.mayii.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiancias;

    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiancias = new ArrayList<>();
    }

    public Curriculum addExperiancia(String exp) {
        experiancias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(contenido)
                .append("\n").append("Profession: ")
                .append(carrera).append("\n")
                .append("Experiancia: ").append("\n");
        for (String exp : experiancias) {
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
