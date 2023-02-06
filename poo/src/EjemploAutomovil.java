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

        System.out.println("hyundai.fabricante = " + hyundai.fabricante);
        System.out.println("hyundai.fabricante = " + hyundai.modelo);
        System.out.println("hyundai.fabricante = " + hyundai.color);
        System.out.println("hyundai.fabricante = " + hyundai.cilindrada);

        System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.fabricante = " + mazda.modelo);
        System.out.println("mazda.fabricante = " + mazda.color);
        System.out.println("mazda.fabricante = " + mazda.cilindrada);
    }
}
