import java.util.Scanner;

public class OrdenadoMayorAMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero:");
        int num1 = scanner.nextInt();

        System.out.println("ingresa un numero:");
        int num2 = scanner.nextInt();

        String mayor = num1 > num2 ?
                "Numero mayor: "+num1+". Numero menor: "+num2:
                "Numero mayor: "+num2+". Numero menor: "+num1;
        System.out.println(mayor);
    }
}
