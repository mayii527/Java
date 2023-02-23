package org.mayii.mamiferos.caninos;

import org.mayii.mamiferos.Canino;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitad, String nombreCientifico, float altura, float largo,
                 float peso, String color, float tamanoColmillo, int fuerzaMordida) {
        super(habitad, nombreCientifico, altura, largo, peso, color, tamanoColmillo);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
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
