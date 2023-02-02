public class EjemploMatricesString2 {
    public static void main(String[] args) {
        //Inicializacion de una matriz.
        String [][] nombres = {{"mayii","thalii"}, {"milo","sara"}, {"laura","fercho"}};

        System.out.println("ciclo foreach");
        for (String[] fila: nombres) {
            for (String columna: fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}