import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaScaner2 {
    public static void main(String[] args) {
        //Crea un objeto de la clase Scanner, con el metodo System.in(entrada desde consola)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:");
        int numInt = 0;
        try {
            //Obtiene la línea y directamente la convierte a un entero
            numInt = scanner.nextInt();
            System.out.println("Número proporcionado: "+ numInt);
            // maneja la exception InputMismatchException o simplemente la Exception
        } catch (InputMismatchException exception){
            System.out.println("Error, debe ingresar un número entero:");
            main(args);
            System.exit(0);
        }
    }
}
