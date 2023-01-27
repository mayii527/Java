import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean autenticado = false;
        String usuario = "Mayii";
        String contra = "12345";

        System.out.println("Ingresa el usuario:");
        String u = scanner.nextLine();

        System.out.println("Ingresa la contraseña:");
        String c = scanner.nextLine();


        if (u.equalsIgnoreCase(usuario) && c.equalsIgnoreCase(contra)){
            autenticado = true;
            System.out.println("Bienvenid@ ".concat(usuario));
        }else {
            System.out.println("Usuario o contraseña incorrecta, intentalo de nuevo.");
        }
    }
}

