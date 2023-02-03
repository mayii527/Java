import java.util.Scanner;
public class MatrizImprimirSilla {
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
                if (j == 0 || i == tamanoMatriz / 2 ||
                        j == tamanoMatriz - 1 && i > tamanoMatriz / 2){
                    System.out.print("h");
                }else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
