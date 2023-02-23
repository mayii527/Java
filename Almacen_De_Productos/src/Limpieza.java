public class Limpieza extends Producto{
    private String componentes;
    private double litros;

    public Limpieza(String nombre, double precio,double litros, String componentes) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return  "\t"+componentes;
    }
}
