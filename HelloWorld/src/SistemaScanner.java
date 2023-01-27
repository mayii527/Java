import java.util.Scanner;

public class SistemaScanner {
    public static void main(String[] args) {
        //Crea un objeto de la clase Scanner, con el metodo System.in(entrada desde consola)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero:");
        //obtiene el input de la línea ingresada en consola
        String numeroStr = scanner.nextLine();
        int numInt = 0;
        try {
            //Convierte numeroStr a un entero
            numInt = Integer.parseInt(numeroStr);
            System.out.println("Número proporcionado: "+ numInt);
            // maneja la exception NumberFormatException o simplemente Exception
        } catch (NumberFormatException exception){
            System.out.println("Error, debe ingresar un número entero:");
            main(args);
            System.exit(0);
        }
    }
}
