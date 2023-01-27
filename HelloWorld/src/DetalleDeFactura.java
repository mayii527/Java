import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String nombreFactura;
        double precioProducto1, precioProducto2, impuesto = 0.19, totalConImpuesto, totalPrecios, totalImpuesto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la factura: ");
        nombreFactura = scanner.nextLine();

        System.out.println("Ingresa el precio del producto 1: ");
        precioProducto1 = scanner.nextDouble();

        System.out.println("Ingresa el precio del producto 2: ");
        precioProducto2 = scanner.nextDouble();

        totalPrecios = precioProducto1 + precioProducto2;
        totalImpuesto = totalPrecios * impuesto;
        totalConImpuesto = totalImpuesto + totalPrecios;

        System.out.println("La factura producto de "+nombreFactura+" tiene un total bruto de "+totalPrecios+", con un impuesto de "+totalImpuesto+" y el monto después del impuesto es de "+totalConImpuesto);
    }
}
