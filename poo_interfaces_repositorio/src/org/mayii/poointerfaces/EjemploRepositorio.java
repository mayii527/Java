package org.mayii.poointerfaces;

import org.mayii.poointerfaces.modelo.Cliente;
import org.mayii.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Mayii", "Cadavid"));
        repo.crear(new Cliente("Sara", "Aguilar"));
        repo.crear(new Cliente("Camilo", "Agudelo"));
        repo.crear(new Cliente("Fernando", "Narvaez"));

        System.out.println("__________ LISTA CLIENTES __________");
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println();

        System.out.println("__________ PAGINABLE __________");
        List<Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);
        System.out.println();

        System.out.println("__________ ORDENAR ASC __________");
        List<Cliente> ordenASC = repo.listar("nombre", Direccion.ASC);
        ordenASC.forEach(System.out::println);
        System.out.println();

        System.out.println("__________ ORDENAR DESC __________");
        List<Cliente> ordenDESC = repo.listar("nombre", Direccion.DESC);
        ordenASC.forEach(System.out::println);
        System.out.println();

        System.out.println("__________ ELIMINAR CLIENTE __________");
        repo.eliminar(1);
        repo.listar().forEach(System.out::println);
        System.out.println();

        System.out.println("__________ TOTAL __________");
        System.out.println("Total registros: " + repo.total());

    }
}
