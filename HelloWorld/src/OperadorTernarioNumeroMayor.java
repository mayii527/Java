import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingresa el numero: " + i);
            numeros[i] = scanner.nextInt();
            mayor = numeros[i] > mayor ? numeros[i]: mayor;
        }
        System.out.println("mayor = " + mayor);
    }
}
