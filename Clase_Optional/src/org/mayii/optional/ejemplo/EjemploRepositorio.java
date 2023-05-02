package org.mayii.optional.ejemplo;

import org.mayii.optional.ejemplo.models.Computador;
import org.mayii.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.mayii.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        repositorio.filtrar("Asus").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró."));

        //Optional<Computador> pc = repositorio.filtrar("asus");

        /*if (pc.isPresent()){
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/
    }
}
