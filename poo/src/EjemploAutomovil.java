public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil hyundai = new Automovil();

        hyundai.fabricante = "Hyundai";
        hyundai.modelo = "Elantra";
        hyundai.color = "Gris";
        hyundai.cilindrada = 2.0;

        Automovil mazda = new Automovil();

        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.color = "blanco";
        mazda.cilindrada = 3.0;

        System.out.println(hyundai.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println(hyundai.acelerarFrenar(3000));
        System.out.println("Kilometros por litro " + hyundai.calcularConsumo(300, 0.6f));
    }
}
