package org.mayii.pooherencia;

public class AlumnoInternacional extends Alumno {

    private String pais;
    private double notaIdiomas;
    public AlumnoInternacional(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }


}
