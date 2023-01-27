import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdadJavaUtilDate {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la fecha de tu nacimiento de la siguiente manera \"yyyy-MM-dd\"");
        String fecha = scanner.next();

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaUsuario = f.parse(fecha);
        System.out.println("Fecha de nacimiento: " + f.format(fechaUsuario));

        Date fechaActual = new Date();
        System.out.println("fecha actual: " + f.format(fechaActual));

        f = new SimpleDateFormat("yyyyMMdd");
            
        int nacimiento = Integer.parseInt(f.format(fechaUsuario));
        int anioActual = Integer.parseInt(f.format(fechaActual));
            
        int edad = (anioActual - nacimiento) / 10000;
        System.out.println("Tu edad es: " + edad);
    }
}