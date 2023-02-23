package org.mayii.mamiferos.felinos;

import org.mayii.mamiferos.Felino;

public class Tigre extends Felino {

    private String especiaTigre;

    public String getEspeciaTigre() {
        return especiaTigre;
    }

    public Tigre(String especiaTigre, String habitad, String nombreCientifico, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitad, nombreCientifico, altura, largo, peso, tamanoGarras, velocidad);
        this.especiaTigre = especiaTigre;
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
