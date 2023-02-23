package org.mayii.mamiferos;

import org.mayii.mamiferos.Mamifero;

public class Canino extends Mamifero {

    private String color;
    private float tamanoColmillo;

    public Canino(String habitad, String nombreCientifico, float altura,
                  float largo, float peso, String color, float tamanoColmillo) {
        super(habitad, nombreCientifico, altura, largo, peso);
        this.color = color;
        this.tamanoColmillo = tamanoColmillo;
    }

    public Canino(String habitad, String nombreCientifico, float altura, float largo, float peso) {
        super(habitad, nombreCientifico, altura, largo, peso);
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillo() {
        return tamanoColmillo;
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
