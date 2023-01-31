import java.util.Scanner;

public class ArreglosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a, pares, impares;
        a = new int[10];
        int totalPares = 0, totalImpares = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];
        int j = 0, k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }
        System.out.println("pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i] + " ");
        }
        System.out.println("impares");
        for (int i = 0; i < impares.length; i++) {
            System.out.println(impares[i] + " ");
        }

    }
}
