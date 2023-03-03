package org.mayii.poointerfaces.repositorio;

import org.mayii.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);

}
