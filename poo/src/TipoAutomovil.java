public enum TipoAutomovil {
    SEDAN("Sedan", 4,"Auto normal"),
    CONVERTIBLE("Convertible", 2,"Auto deportivo"),
    CAMIONETA("Camioneta", 4,"Auto Grande"),
    COOPER("Cooper", 2,"Auto pequeño deportivo"),
    FURGON("Furgon", 2,"Auto utilitario");

    private  final String nombre;
    private  final int numeroPuerta;
    private  final String description;

    TipoAutomovil(String nombre, int numeroPuerta, String description) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescription() {
        return description;
    }
}
