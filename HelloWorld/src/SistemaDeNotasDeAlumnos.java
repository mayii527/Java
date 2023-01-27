import java.util.Scanner;
public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se crea un array de doubles
        double[] notas = new double[20];
        int count = notas.length;
        int countNotasMayores = 0;
        int countNotasInferiores = 0;
        int countNotasUno = 0;
        double notaMinima = 5.0;
        double promedioMayores = 0;
        double promedioInferiores = 0;
        double promedioTotal = 0;
        double sumaMayores = 0;
        double sumaInferiores = 0;
        double sumaTotal = 0;
        //Se recorre el array y se almacena cada nota ingresada
        for (int i = 0; i < count; i++){
            System.out.println("Ingresa la nota: ");
            notas[i] = scanner.nextDouble();
            sumaTotal += notas[i];

            if (notas[i] == 0){
                System.out.println("ERROR");
                break;
            }

            if (notas[i] == 1){
                countNotasUno++;
            }

            if (notas[i] < 4){
                countNotasInferiores++;
                sumaInferiores += notas[i];
            }

            if(notas[i] > notaMinima){
                countNotasMayores++;
                sumaMayores += notas[i];
            }
        }
        promedioMayores = countNotasMayores > 0 ? sumaMayores / countNotasMayores: 0;
        promedioInferiores = sumaInferiores / countNotasInferiores;
        promedioTotal = sumaTotal / count;

        System.out.println("cantidad notas de uno: " + countNotasUno);
        System.out.println("Promedio de notas menores  a 4: "+ promedioInferiores);
        System.out.println("Promedio de notas mayores a 5: "+ promedioMayores);
        System.out.println("Promedio total de las notas ingresadas:  = "+ promedioTotal);

    }
}
