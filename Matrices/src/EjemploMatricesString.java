public class EjemploMatricesString {
    public static void main(String[] args) {
        //Inicializacion de una matriz
        String [][] nombres = new String[3][2];
        //se llena la matriz
        nombres[0][0] = "mayii";
        nombres[0][1] = "thalii";
        nombres[1][0] = "milo";
        nombres[1][1] = "sara";
        nombres[2][0] = "laura";
        nombres[2][1] = "fercho";

        // para recorrer la matriz se usa un for anidado
        System.out.println("ciclo for");
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ciclo foreach");
        for (String[] fila: nombres) {
            for (String columna: fila) {
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}