import java.util.Date;

public class OrdenCompra {
    private String description;
    private Date fecha;
    private ClienteCompra clienteCompra;
    private ProductoCompra[] productoCompras;

    private int idPedido;
    private static int cantidadPedidos = 0;

    public OrdenCompra(String description) {
        this.description = description;
        cantidadPedidos += 1;
        this.idPedido = cantidadPedidos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescription() {
        return description;
    }

    public Date getFecha() {
        return fecha;
    }

    public ClienteCompra getCliente() {
        return clienteCompra;
    }

    public ProductoCompra[] getProductos() {
        return productoCompras;
    }

    public void setProductos(ProductoCompra[] productoCompras) {
        this.productoCompras = productoCompras;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
}

    public void setCliente(ClienteCompra clienteCompra) {
        this.clienteCompra = clienteCompra;
    }

    public double totalpedido(OrdenCompra pedido) {
        double preciosum = 0;
        for (ProductoCompra produc : pedido.getProductos()) {
            preciosum += produc.getPrecio();
        }
        return preciosum;
    }
}
