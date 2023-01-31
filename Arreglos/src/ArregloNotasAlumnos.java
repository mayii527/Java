import java.util.Scanner;

public class ArregloNotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumNotasHistoria/claseHistoria.length;
        double promedioLenguaje = sumNotasLenguaje/claseLenguaje.length;

        System.out.println("Promedio  de la clase de Matematicas " + promedioMatematicas);
        System.out.println("Promedio  de la clase de Historia " + promedioHistoria);
        System.out.println("Promedio  de la clase de Lenguaje " + promedioLenguaje);
        System.out.println("Promedio total del curso: "
                + (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3);

        System.out.println("ingrese el indice del alumno de 0 a 6: ");
        int id = scanner.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("El promedio del alumno" + id+ "es de: " + promedioAlumno);
    }
}
