public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    NARANJA("Naranja"),
    BLANCO("Naranja"),
    GRIS("Gris");

    private final  String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
