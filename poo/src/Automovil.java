public class Automovil {
    private String fabricante, modelo;
    private Color color;
    private double cilindrada;
    private TipoAutomovil tipo;
    //constructor
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    //Constructor vació
    public Automovil(){

    }
    //Setter and Getter.
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = ").append(this.fabricante);
        sb.append("\nmodelo = ").append(this.modelo);
        sb.append("\ncolor = ").append(this.color);
        sb.append("\ncilindrada = ").append(this.cilindrada);
        sb.append("\nTipo = ").append(this.getTipo().getNombre());
        sb.append("\nPuertas = ").append(this.getTipo().getNumeroPuerta());
        sb.append("\nDescription = ").append(this.getTipo().getDescription());
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "el auto " + fabricante + " acelerando a "+ rpm+ " rpm.";
    }
    public String frenar(){
        return "el auto " + fabricante + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        int capacidadEstanque = 40;
        return km / (capacidadEstanque * porcentajeBencina);
    }
}
