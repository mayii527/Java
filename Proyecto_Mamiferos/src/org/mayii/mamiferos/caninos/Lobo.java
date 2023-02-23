package org.mayii.mamiferos.caninos;

import org.mayii.mamiferos.Canino;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitad, String nombreCientifico, float altura, float largo,
                float peso, String color, float tamanoColmillo, int numCamada, String especieLobo) {
        super(habitad, nombreCientifico, altura, largo, peso, color, tamanoColmillo);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return super.comer();
    }

    @Override
    public String dormir() {
        return super.dormir();
    }

    @Override
    public String correr() {
        return super.correr();
    }

    @Override
    public String comunicarse() {
        return super.comunicarse();
    }
}
