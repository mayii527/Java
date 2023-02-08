public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil hyundai = new Automovil("Hyundai", "Elantra");
        hyundai.setColor(Color.BLANCO);
        hyundai.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        hyundai.setTipo(TipoAutomovil.SEDAN);
        hyundai.setEstanque(new Estanque(60));

        Automovil mazda = new Automovil("Mazda","BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.COOPER);
        mazda.setEstanque(new Estanque());

        Automovil nissan = new Automovil("Nissan", "Versa");
        nissan.setColor(Color.AZUL);
        nissan.setMotor(new Motor(4.0,TipoMotor.BENCINA));
        nissan.setTipo(TipoAutomovil.CAMIONETA);
        nissan.setEstanque(new Estanque(30));

        System.out.println(hyundai.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(nissan.detalle());
        System.out.println();
    }
}
