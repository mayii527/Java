import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat formatPesos = NumberFormat.getCurrencyInstance();
        Lacteos leche = new Lacteos("Leche", 3800, 3, 4);
        Lacteos queso = new Lacteos("Queso", 4200, 1, 25);

        Frutas manzana = new Frutas("Manzana", 1500, 1.5, "rojo");
        Frutas mango = new Frutas("Mango", 3000, 5, "naranja");

        Limpieza detergente = new Limpieza("Jabon",6500,3.5,"Jabon para ropa");
        Limpieza desinfectante = new Limpieza("Alcohol",12000,2,"Desinfectante");

        Producto[] listaProductos = new Producto[6];
        listaProductos[0] = leche;
        listaProductos[1] = queso;
        listaProductos[2] = manzana;
        listaProductos[3] = mango;
        listaProductos[4] = detergente;
        listaProductos[5] = desinfectante;

        System.out.println("Producto\tprecio\t\tcantidad\ttotal\t\t\tAtributos");

        for (Producto producto : listaProductos) {
            String strAtributos = "";
            double cantidadProducto = 0;
            double total = 0;

            if (producto instanceof Lacteos l) {
                cantidadProducto = l.getCantidad();
                total = producto.getPrecio() * cantidadProducto;
                strAtributos = String.valueOf(l.toString());
            }
            else if (producto instanceof Frutas f) {
                cantidadProducto = f.getPeso();
                total = producto.getPrecio() * cantidadProducto;
                strAtributos = f.toString();
            }
            else if (producto instanceof Limpieza limpieza) {
                cantidadProducto = limpieza.getLitros();
                total = producto.getPrecio() * cantidadProducto;
                strAtributos = limpieza.toString();
            }

            System.out.println(producto.getNombre() + "\t\t" + formatPesos.format(producto.getPrecio()) +
                    "\t\t" + cantidadProducto + "\t\t" + formatPesos.format(total) + "\t" + strAtributos);
        }
    }
}