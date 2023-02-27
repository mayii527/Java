package org.mayii.poointerfaces.imprenta.modelo;

abstract public class Hoja {
     protected String contenido;

    public String getContenido() {
        return contenido;
    }

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();
}
