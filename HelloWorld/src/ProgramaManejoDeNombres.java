import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un nombre");
        String nombre1 = scanner.nextLine();
        String nombre2 = scanner.nextLine();
        String nombre3 = scanner.nextLine();

        String nombreEntero = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2).concat("_"));
        nombreEntero = nombreEntero.concat(nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2).concat("_")));
        nombreEntero = nombreEntero.concat(nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2)));
        System.out.println(nombreEntero);

    }
}
