import java.util.Arrays;
import java.util.Scanner;

public class BuscarNumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se crea un array de enteros
        int[] numeros = new int[10];
        int count = numeros.length;
        System.out.println("Ingresa 10 números a comparar: ");
        //Se recorre el array y se almacena cada número ingresado
        for (int i = 0; i < count; i++){
            numeros[i] = scanner.nextInt();
        }
        //Se ordena el array de menor a mayor
        Arrays.sort(numeros);
        if (numeros[0] < 10){
            System.out.println("El numero menor es "
                    + numeros[0] + " y es menor que 10!");
        }else {
            System.out.println("El numero menor es "
                    + numeros[0] + " y es igual o mayor que 10");
        }
    }
}