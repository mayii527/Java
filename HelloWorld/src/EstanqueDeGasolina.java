import java.util.Scanner;

public class EstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad actual de litros que tenga el estanque:");
        int cantidLitros = scanner.nextInt();

        if (cantidLitros == 70) {
            System.out.println("Estanque lleno, "
                    .concat(String.valueOf(cantidLitros))+"/70 Litros.");
        } else if (cantidLitros >= 60 && cantidLitros < 70) {
            System.out.println("Estanque casi lleno, "
                    .concat(String.valueOf(cantidLitros))+"/70 Litros.");
        } else if (cantidLitros >= 40 && cantidLitros < 60) {
            System.out.println("Estanque a 3/4, "
                    .concat(String.valueOf(cantidLitros))+"/70 Litros.");
        } else if (cantidLitros >= 35 && cantidLitros < 40) {
            System.out.println("Estanque a la mitad, "
                    .concat(String.valueOf(cantidLitros))+"/70 Litros.");
        }else if (cantidLitros >= 20 && cantidLitros < 35) {
            System.out.println("Estanque con cantidad suficiente, "
                    .concat(String.valueOf(cantidLitros))+"/70 Litros.");
        }else {
            System.out.println("Estanque con cantidad insuficiente, "
                    .concat(String.valueOf(cantidLitros))+"/70 Litros.");
        }
    }
}
