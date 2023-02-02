public class BuscarElementos {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
        };
        int elementoABuscar = 10;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizDeEnteros.length; i++){
            for (j = 0; j < matrizDeEnteros[i].length; j++){
                if (matrizDeEnteros[i][j] == elementoABuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado){
            System.out.println("Se encontró el " + elementoABuscar+ " en las coordenadas " + i + "," + j);
        } else{
            System.out.println(elementoABuscar + " no se encontró en la matriz.");
        }
    }
}
