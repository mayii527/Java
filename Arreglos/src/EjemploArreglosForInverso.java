import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación",
                "Bicicleta Oxford"};
        int count = productos.length;
        /*
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";
        */
        //El metodo sort ordena los elementos de menor a mayor
        Arrays.sort(productos);
        System.out.println("===== USANDO For =====");
        for (int i = 0; i < count; i++){
            System.out.println("En la posicion " + i +" esta el producto: "+ productos[i] );
        }

        System.out.println("===== USANDO For inverso =====");
        for (int i = count - 1; i >= 0; i--){
            System.out.println("En la posicion " + i +" esta el producto: "+ productos[i] );
        }
    }
}
