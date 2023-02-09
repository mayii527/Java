import java.util.Objects;
public class EjemploAutomovilRelacionObjetos{
    public static void main(String[] args) {

        Rueda[] ruedaHyundai = new Rueda[5];
        for (int i = 0; i < ruedaHyundai.length; i++){
            ruedaHyundai[i] = new Rueda("Yokohama", 16, 7.5);
        }
        Automovil hyundai = new Automovil("Hyundai", "Elantra");
        hyundai.setColor(Color.BLANCO);
        hyundai.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        hyundai.setTipo(TipoAutomovil.SEDAN);
        hyundai.setEstanque(new Estanque(60));
        hyundai.setConductor(new Persona("Mayii", "Cadavid"));
        hyundai.setRuedas(ruedaHyundai);

        Rueda[] ruedaMazda = new Rueda[5];
        for (int i = 0; i < ruedaMazda.length; i++){
            ruedaMazda[i] = new Rueda("Michelin", 18, 10.5);
        }
        Automovil mazda = new Automovil("Mazda","BT-50");
        mazda.setColor(Color.GRIS);
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.COOPER);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(new Persona("Thaliana", "Andrade"));
        mazda.setRuedas(ruedaMazda);

        Rueda[] ruedaNissan = new Rueda[5];
        for (int i = 0; i < ruedaNissan.length; i++){
            ruedaNissan[i] = new Rueda("Pirelli", 20, 11.5);
        }
        Automovil nissan = new Automovil("Nissan", "Versa");
        nissan.setColor(Color.AZUL);
        nissan.setMotor(new Motor(4.0,TipoMotor.BENCINA));
        nissan.setTipo(TipoAutomovil.CAMIONETA);
        nissan.setEstanque(new Estanque(30));
        nissan.setConductor(new Persona("Shara", "Cadavid"));
        nissan.setRuedas(ruedaNissan);

        System.out.println(hyundai.detalle());
        System.out.println("___________________________________________________________________________________________");
        System.out.println(mazda.detalle());
        System.out.println("___________________________________________________________________________________________");
        System.out.println(nissan.detalle());
        System.out.println("___________________________________________________________________________________________");
        System.out.println("Conductor Hyundai: "+ hyundai.getConductor());
        System.out.println("Ruedas Hyundai: ");
        int auxHyundai = 0;
        Rueda[] arrRuedasHyundai = hyundai.getRuedas();
        for (int i = 0; i < arrRuedasHyundai.length; i++){
            if (Objects.equals(arrRuedasHyundai[0].getFabricante(), arrRuedasHyundai[i].getFabricante())
                    && Objects.equals(arrRuedasHyundai[0].getAro(), arrRuedasHyundai[i].getAro())
                    && Objects.equals(arrRuedasHyundai[0].getAncho(), arrRuedasHyundai[i].getAncho())){
                auxHyundai++;
            }
        }
        if (auxHyundai == arrRuedasHyundai.length){
            System.out.println(arrRuedasHyundai[0].getAro() + " "+ arrRuedasHyundai[0].getFabricante() +" "+ arrRuedasHyundai[0].getAncho());
        }else {
            System.out.println("ruedas diferentes");
        }
        System.out.println();
        System.out.println("Conductor Mazda: "+ mazda.getConductor());
        System.out.println("Ruedas Mazda: ");
        int auxMazda = 0;
        Rueda[] arrRuedasMazda = mazda.getRuedas();
        for (int i = 0; i < arrRuedasMazda.length; i++){
            if(Objects.equals(arrRuedasMazda[0].getFabricante(), arrRuedasMazda[i].getFabricante())
            && Objects.equals(arrRuedasMazda[0].getAro(), arrRuedasMazda[i].getAro())
            && Objects.equals(arrRuedasMazda[0].getAncho(), arrRuedasMazda[i].getAncho())){
                auxMazda++;
            }
        }
        if (auxMazda == arrRuedasMazda.length){
            System.out.println(arrRuedasMazda[0].getAro() + " "+ arrRuedasMazda[0].getFabricante() +" "+ arrRuedasMazda[0].getAncho());
        }else {
            System.out.println("ruedas diferentes");
        }
        System.out.println();
        System.out.println("Conductor Nissan: "+ nissan.getConductor());
        System.out.println("Ruedas Nissan: ");
        int auxNissan = 0;
        Rueda[] arrRuedasNissan = nissan.getRuedas();
        for (int i = 0; i < arrRuedasNissan.length; i++){
            if(Objects.equals(arrRuedasNissan[0].getFabricante(), arrRuedasNissan[i].getFabricante())
                    && Objects.equals(arrRuedasNissan[0].getAro(), arrRuedasNissan[i].getAro())
                    && Objects.equals(arrRuedasNissan[0].getAncho(), arrRuedasNissan[i].getAncho())){
                auxNissan++;
            }
        }
        if (auxNissan == arrRuedasNissan.length){
            System.out.println(arrRuedasNissan[0].getAro() + " "+ arrRuedasNissan[0].getFabricante() +" "+ arrRuedasNissan[0].getAncho());
        }else {
            System.out.println("ruedas diferentes");
        }
    }
}