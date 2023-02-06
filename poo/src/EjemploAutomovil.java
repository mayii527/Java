public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil hyundai = new Automovil("Hyundai", "Elantra");
        hyundai.setColor("Gris");
        hyundai.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda","BT-50");
        mazda.setColor("blanco");
        mazda.setCilindrada(3.0);

        Automovil nissan = new Automovil();
        mazda.setColor("blanco");
        mazda.setCilindrada(3.0);

        System.out.println(hyundai.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(hyundai.acelerarFrenar(3000));
        System.out.println("Kilometros por litro " + hyundai.calcularConsumo(300, 0.6f));
    }
}
