public class Frutas extends Producto{
    private double peso;
    private String color;

    public Frutas(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\t" + "Color "+color;
    }
}
