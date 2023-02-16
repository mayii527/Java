package org.mayii.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 12;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Factura generada en dia: ").append(df.format(this.fecha)).append("\n");
        sb.append("Factura N°: ").append(folio)
                .append("\nCliente : ").append(this.cliente.getNombre())
                .append("\t CC: ").append(cliente.getCc())
                .append("\n Descripcion: ").append(this.descripcion)
                .append("\n")
                .append("\n#\tProducto\tPrecio\t\tCant.\t\ttotal\n");


        for (ItemFactura item : this.items) {
            if (item == null) {
                continue;
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t\t")
                    .append(item.getCantidad())
                    .append("\t\t\t")
                    .append(item.calcularImporte())
                    .append("\n_______________________________________________");
        }
        sb.append("\nTotal a pagar: \t\t\t\t\t\t\t")
                .append(calcularTotal());

        return sb.toString();
    }
}
