package org.mayii.mamiferos;

abstract public class Mamifero {

    private String habitad;
    private String nombreCientifico;
    private float altura;
    private float largo;
    private float peso;

    public Mamifero(String habitad, String nombreCientifico, float altura, float largo, float peso) {
        this.habitad = habitad;
        this.nombreCientifico = nombreCientifico;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

    public String getHabitad() {
        return habitad;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }
}
