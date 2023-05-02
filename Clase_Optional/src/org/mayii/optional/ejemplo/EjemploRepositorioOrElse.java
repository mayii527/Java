package org.mayii.optional.ejemplo;

import org.mayii.optional.ejemplo.models.Computador;
import org.mayii.optional.ejemplo.repositorio.*;

public class EjemploRepositorioOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP", "LA001");

        Computador pc = repositorio.filtrar("asuls").orElse(defecto);
        System.out.println(pc);

    }
}
