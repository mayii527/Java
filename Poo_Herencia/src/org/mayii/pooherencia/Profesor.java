package org.mayii.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
