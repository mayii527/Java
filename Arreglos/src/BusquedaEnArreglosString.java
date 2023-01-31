import java.util.Scanner;
public class BusquedaEnArreglosString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[4];

        for (int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese cinco nombres: ");
            nombres[i] = scanner.next();
        }

        System.out.println("Ingrese un nombre a buscar: ");
        String nombre = scanner.next();
        int i = 0;
        for (; i < nombres.length && !nombres[i].equalsIgnoreCase(nombre); i++){}
        if (i == nombres.length){
            System.out.println("Nombre no encontrado");
        } else if (nombres[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
            System.out.println("encontrado");
        }

    }
}
