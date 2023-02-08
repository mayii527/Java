public class Automovil {
    private String fabricante, modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private TipoAutomovil tipo;

    //Constructor vació
    public Automovil() {
    }

    //constructor
    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String detalle() {
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = ").append(this.fabricante);
        sb.append("\nmodelo = ").append(this.modelo);
        sb.append("\ncolor = ").append(this.color);
        sb.append("\ncilindrada = ").append(this.motor.getCilindrada());
        sb.append("\nTipo = ").append(this.getTipo().getNombre());
        sb.append("\nPuertas = ").append(this.getTipo().getNumeroPuerta());
        sb.append("\nDescription = ").append(this.getTipo().getDescription());
        return sb.toString();
    }

    public String acelerar(int rpm) {
        return "el auto " + fabricante + " acelerando a " + rpm + " rpm.";
    }

    public String frenar() {
        return "el auto " + fabricante + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        int capacidadEstanque = 40;
        return km / (capacidadEstanque * porcentajeBencina);
    }
}
