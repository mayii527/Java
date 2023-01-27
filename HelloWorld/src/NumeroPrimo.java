import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa un numero entero:");
            int numero = scanner.nextInt();
            int cantidadModuloCero = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0){
                    cantidadModuloCero += 1;
                }
            }
            String numeroP = cantidadModuloCero == 2 ? "es primo": "no es primo";
            System.out.println("numeroP = " + numeroP);
        }catch (Exception exception){
            System.out.println("El numero ingresado debe ser un entero");
            main(args);
        }
    }
}