import java.util.Scanner;

public class EjercicioNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[7];
        
        for (int i = 0;i < arreglo.length; i++){
            System.out.println("ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }
        
        int mayor = 0;
        for (int i = 0;i < arreglo.length; i++){
            mayor = mayor > arreglo[i]? mayor: arreglo[i];
        } 
        System.out.println("El numero mayor es: " + mayor);
    }
}
