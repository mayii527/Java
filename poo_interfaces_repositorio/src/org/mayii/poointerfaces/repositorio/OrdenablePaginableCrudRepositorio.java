package org.mayii.poointerfaces.repositorio;

//implement todas las interfaces en una sola
public interface OrdenablePaginableCrudRepositorio extends OrdenableRepositorio,
        PaginableRepositorio,CrudRepositorio,ContableRepositorio{
}
