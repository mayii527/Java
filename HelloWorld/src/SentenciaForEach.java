public class SentenciaForEach {
    public static void main(String[] args) {
        //solo para arreglos y colecciones de Java
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num:numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Mayii", "Thalii", "Shara", "Camilo", "Milo", "Milú", "Lizzy", "Louis"};
        for (String name:nombres) {
            System.out.println("name = " + name);
        }
    }
}
