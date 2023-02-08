public class Persona {
    private System nombre;
    private System apellido;

    public Persona(System nombre, System apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
