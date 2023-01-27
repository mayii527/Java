import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String estado;
        double promedio;
        double matematicas;
        double ciencias;
        double ingles;
        System.out.println("Ingresa tu nota de matematicas entre 1.0 y 9.5:");
        matematicas = scanner.nextDouble();

        System.out.println("Ingresa tu nota de ciencias entre 1.0 y 9.5:");
        ciencias = scanner.nextDouble();

        System.out.println("Ingresa tu nota de ingles entre 1.0 y 9.5:");
        ingles = scanner.nextDouble();

        promedio = (matematicas + ciencias + ingles) / 3;
        System.out.println("Promedio = " + promedio);

        //Operador ternario
        estado = promedio >= 5.5 ? "Aprobado" : "Reprobado";
        System.out.println("Estado = " + estado);
    }
}
