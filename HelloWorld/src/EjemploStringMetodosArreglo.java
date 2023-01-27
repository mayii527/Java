public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        trabalenguas=trabalenguas.concat("jhgjh");
        System.out.println("trabalenguas = " + trabalenguas);
        trabalenguas = "camilo";
        System.out.println("trabalenguas = " + trabalenguas);
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        /*for(int i = 0; i < largo; i++){
            System.out.println(arreglo[i]);
        }*/

    }
}
