package org.mayii.optional.ejemplo;

import org.mayii.optional.ejemplo.models.Computador;
import org.mayii.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.mayii.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioOrElseThrow {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("asuls").orElseThrow();
        System.out.println(pc);

    }
}
