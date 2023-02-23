package org.mayii.mamiferos.felinos;

import org.mayii.mamiferos.Felino;

public class Guepardo extends Felino {

    public Guepardo(String habitad, String nombreCientifico, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitad, nombreCientifico, altura, largo, peso, tamanoGarras, velocidad);
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
