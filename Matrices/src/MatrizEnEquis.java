import java.util.Scanner;
public class MatrizEnEquis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño de la matriz: ");
        int tamanoMatriz = scanner.nextInt();

        if (tamanoMatriz == 0){
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < tamanoMatriz; i++){
            for (int j = 0; j < tamanoMatriz; j++){
                if (i == j || j == tamanoMatriz -1 - i){
                    System.out.print("x");
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
