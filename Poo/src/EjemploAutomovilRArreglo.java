import java.util.Arrays;

public class EjemploAutomovilRArreglo {
    public static void main(String[] args) {

        Automovil hyundai = new Automovil("Hyundai", "Elantra");
        hyundai.setColor(Color.BLANCO);
        hyundai.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        hyundai.setTipo(TipoAutomovil.SEDAN);
        hyundai.setEstanque(new Estanque(60));
        hyundai.setConductor(new Persona("Mayii", "Cadavid"));

        Automovil mazda = new Automovil("Mazda","BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.COOPER);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(new Persona("Thaliana", "Andrade"));

        Automovil nissan = new Automovil("Nissan", "Versa");
        nissan.setColor(Color.AZUL);
        nissan.setMotor(new Motor(4.0,TipoMotor.BENCINA));
        nissan.setTipo(TipoAutomovil.CAMIONETA);
        nissan.setEstanque(new Estanque(30));
        nissan.setConductor(new Persona("Shara", "Cadavid"));

        Automovil[] autos = new Automovil[3];
        autos[0] = nissan;
        autos[1] = mazda;
        autos[2] = hyundai;

        //Organizando los autos en orden alphabetic.
        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++){
            System.out.println(i+": "+autos[i]);
        }
    }
}