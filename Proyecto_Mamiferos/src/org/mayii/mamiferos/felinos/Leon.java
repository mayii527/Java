package org.mayii.mamiferos.felinos;

import org.mayii.mamiferos.Felino;

public class Leon extends Felino {

    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitad, String nombreCientifico, float altura, float largo, float peso,
                float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitad, nombreCientifico, altura, largo, peso, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
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
