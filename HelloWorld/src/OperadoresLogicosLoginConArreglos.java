import java.util.Scanner;

public class OperadoresLogicosLoginConArreglos {
    public static void main(String[] args) {

        //Creamos una instancia de String[*número de elementos del array*]
        String[] usernames = {"Mayii", "Thalii", "mimi"};
        String[] passwords = {"1234", "143", "183"};
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = false;

        System.out.println("Ingresa el usuario:");
        String u = scanner.nextLine();

        System.out.println("Ingresa la contraseña:");
        String c = scanner.nextLine();

        for (int i = 0; i < usernames.length; i++){
            if (usernames[i].equalsIgnoreCase(u) && passwords[i].equalsIgnoreCase(c)){
                autenticado = true;
                System.out.println("Bienvenid@ ".concat(usernames[i]));
                break;
            }
        }
        if (!autenticado){
            System.out.println("Usuario o contraseña incorrecta, intentalo de nuevo.");
        }
    }
}

