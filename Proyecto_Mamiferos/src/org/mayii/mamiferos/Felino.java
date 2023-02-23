package org.mayii.mamiferos;

public class Felino extends Mamifero{

    private float tamanoGarras;
    private int velocidad;

    public Felino(String habitad, String nombreCientifico, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitad, nombreCientifico, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(String habitad, String nombreCientifico, float altura, float largo, float peso) {
        super(habitad, nombreCientifico, altura, largo, peso);
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
