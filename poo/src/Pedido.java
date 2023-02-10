import java.text.NumberFormat;
import java.util.Date;
public class Pedido {
    public static void main(String[] args) {
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();

        OrdenCompra pedido1 = new OrdenCompra("Productos de cocina");
        pedido1.setCliente(new ClienteCompra("Mayii", "Cadavid"));
        pedido1.setFecha(new Date());
        ProductoCompra[] elementos1 = new ProductoCompra[3];
        elementos1[0] = (new ProductoCompra("Imusa", "Cuchara", 2000));
        elementos1[1] = (new ProductoCompra("Universal", "Hoya a presion", 350000));
        elementos1[2] = (new ProductoCompra("Itacol", "Vaso 8oZ", 5000));
        pedido1.setProductos(elementos1);

        OrdenCompra pedido2 = new OrdenCompra("Ropa deportiva");
        pedido2.setCliente(new ClienteCompra("Thaliana", "Andrade"));
        pedido2.setFecha(new Date());
        ProductoCompra[] elementos2 = new ProductoCompra[3];
        elementos2[0] =(new ProductoCompra("Cervo Sport", "Hoodie Negro", 43000));
        elementos2[1] =(new ProductoCompra("Nike", "Blusa en algodon Blanca", 35000));
        elementos2[2] =(new ProductoCompra("Fila", "Sudadera en algodon Gris", 65000));
        pedido2.setProductos(elementos2);

        OrdenCompra pedido3 = new OrdenCompra("Electrodomésticos");
        pedido3.setCliente(new ClienteCompra("Shara", "Cadavid"));
        pedido3.setFecha(new Date());
        ProductoCompra[] elementos3 = new ProductoCompra[3];
        elementos3[0] = (new ProductoCompra("Haceb", "Nevera", 950000));
        elementos3[1] = (new ProductoCompra("Univeral", "Air Fryer", 400000));
        elementos3[2] = (new ProductoCompra("Imusa", "Microondas", 800000));
        pedido3.setProductos(elementos3);

        System.out.println("Cliente: " + pedido1.getCliente());
        System.out.println("ID pedido: " + pedido1.getIdPedido()+ " | Fecha: " + pedido1.getFecha());
        System.out.println("Descripcion: " + pedido1.getDescription());
        System.out.println("Productos");

        for (ProductoCompra pc:elementos1) {
            System.out.println("Fabricante: "+ pc.getFabricante() +" | Producto: "+ pc.getNombre() +" | Precio: "+ pc.getPrecio());
        }
        System.out.println("Total del pedido: "+ formatoImporte.format(pedido1.totalpedido(pedido1)));
        System.out.println("__________________________________________________________________________________________________-");

        System.out.println("Cliente: " + pedido2.getCliente());
        System.out.println("ID pedido: " + pedido2.getIdPedido()+ " | Fecha: " + pedido2.getFecha());
        System.out.println("Descripcion: " + pedido2.getDescription());
        System.out.println("Productos");

        for (ProductoCompra pc: elementos2){
            System.out.println("Fabricante: "+ pc.getFabricante() +" | Producto: "+ pc.getNombre() +" | Precio: "+ pc.getPrecio());
        }
        System.out.println("Total del pedido: "+ formatoImporte.format(pedido2.totalpedido(pedido2)));
        System.out.println("__________________________________________________________________________________________________-");

        System.out.println("Cliente: " + pedido3.getCliente());
        System.out.println("ID pedido: " + pedido3.getIdPedido()+ " | Fecha: " + pedido3.getFecha());
        System.out.println("Descripcion: " + pedido3.getDescription());
        System.out.println("Productos: ");

        for (ProductoCompra pc: elementos3){
            System.out.println("Fabricante: "+ pc.getFabricante() +" | Producto: "+ pc.getNombre() +" | Precio: "+ pc.getPrecio());
        }
            System.out.println("Total del pedido: "+ formatoImporte.format(pedido3.totalpedido(pedido3)));
    }
}
