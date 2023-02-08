public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil hyundai = new Automovil("Hyundai", "Elantra");
        hyundai.setColor(Color.BLANCO);
        hyundai.setCilindrada(2.0);
        hyundai.setTipo(TipoAutomovil.SEDAN);

        Automovil mazda = new Automovil("Mazda","BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setCilindrada(3.0);
        mazda.setTipo(TipoAutomovil.COOPER);


        Automovil nissan = new Automovil("Nissan", "Versa");
        nissan.setColor(Color.AZUL);
        nissan.setCilindrada(4.0);
        nissan.setTipo(TipoAutomovil.CAMIONETA);

        System.out.println(hyundai.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(nissan.detalle());
        System.out.println();
        System.out.println(hyundai.acelerarFrenar(3000));
        System.out.println("Kilometros por litro " + hyundai.calcularConsumo(300, 0.6f));
    }
}
