import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación",
                "Bicicleta Oxford"};
        int count = productos.length;

        //El metodo sort ordena los elementos de menor a mayor
        Arrays.sort(productos);
        // se imprime el array desde el último elemento al primero
        Collections.reverse(Arrays.asList(productos));
        System.out.println("===== USANDO For =====");
        for (int i = 0; i < count; i++){
            System.out.println("En la posicion " + i +" esta el producto: "+ productos[i] );
        }
    }
}
