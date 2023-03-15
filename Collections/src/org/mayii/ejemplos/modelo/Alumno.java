package org.mayii.ejemplos.modelo;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int nota;

    public Alumno() {
    }

    @Override
    public String toString() {
        return nombre + "| Nota: " + nota;
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Alumno a) {
        if (this.nombre == null) {
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
    }
}
