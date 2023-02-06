public class Automovil {
    String fabricante, modelo, color;
    double cilindrada;
    int capacidadEstanque = 40;

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = ").append(this.fabricante);
        sb.append("\nmodelo = ").append(this.modelo);
        sb.append("\ncolor = ").append(this.color);
        sb.append("\ncilindrada = ").append(this.cilindrada);
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
        return km / (capacidadEstanque * porcentajeBencina);
    }
}
