package org.mayii.optional.ejemplo.repositorio;

import org.mayii.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);

}
