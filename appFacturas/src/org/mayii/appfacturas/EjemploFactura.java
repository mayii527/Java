package org.mayii.appfacturas;
import org.mayii.appfacturas.modelo.*;
import java.util.Scanner;
public class EjemploFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();
        cliente.setNombre(nombreCliente);
        System.out.print("Ingrese su numero de identificacion: ");
        String cc = scanner.nextLine();
        cliente.setCc(cc);

        System.out.print("Ingrese la descripcion de la factura: ");
        String desc = scanner.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();
        for (int i = 0;i < 7; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto N°" + producto.getCodigo() + ": ");
            nombre = scanner.next();
            producto.setNombre(nombre);

            System.out.print("ingrese el precio: ");
            precio = scanner.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingresa la cantidad: ");
            cantidad = scanner.nextInt();

            ItemFactura item = new ItemFactura(cantidad,producto);
            factura.addItemFactura(item);

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}

