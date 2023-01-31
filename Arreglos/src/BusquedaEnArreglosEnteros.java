import java.util.Scanner;
public class BusquedaEnArreglosEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese cinco enteros: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Ingrese un numero a buscar: ");
        int num = scanner.nextInt();
        int i = 0;
        while (i < numeros.length && numeros[i] != num){
            i++;
        }
        if (i == numeros.length){
            System.out.println("Numero no encontrado");
        } else if (numeros[i] == num) {
            System.out.println("encontrado");
        }

    }
}
