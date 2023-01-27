import java.util.Arrays;
public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int count = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        //El metodo sort ordena los elementos de menor a mayor
        Arrays.sort(productos);
        System.out.println("===== USANDO For =====");
        for (int i = 0; i < count; i++){
            System.out.println("En la posicion " + i +" esta el producto: "+ productos[i] );
        }

        System.out.println("===== USANDO Foreach =====");
        for (String prod: productos) {
            System.out.println("producto: "+ prod);
        }

        System.out.println("===== USANDO While =====");
        int i = 0;
        while (i < count){
            System.out.println("En la posicion " + i +" esta el producto: "+ productos[i] );
            i++;
        }

        System.out.println("===== USANDO Do While =====");
        int j = 0;
        do {
            System.out.println("En la posicion " + j +" esta el producto: "+ productos[j] );
            j++;
        }while (j < count);

        int[] numeros = new int[10];
        int countNum = numeros.length;
        for (int k = 0; k < countNum; k++){
            numeros[k] = k * 2;
        }

        for (int k = 0; k < countNum; k++){
            System.out.println("Numeros = " + numeros[k]);
        }

    }
}
