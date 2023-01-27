public class     EjemploStringConcatenacion {
    public static void main(String[] args) {
         String curso = "Programación en Java";
         String nombre = "Mayii Cadavid Aguilar";
         int num1 = 20;
         int num2 = 1;
         String frase = curso + " by " + nombre;
         System.out.println(frase);
        System.out.println(frase+ " "+(num1 + num2));
        //Otra manera de concatenar texto
        String frase2 = curso.concat(" by ").concat(nombre);
        System.out.println(frase2);

    }
}
