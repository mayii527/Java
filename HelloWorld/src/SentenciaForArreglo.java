public class SentenciaForArreglo {
    public static void main(String[] args) {
        //Recorriendo un array con un ciclo for:
         String[] nombres = {"Mayii", "Thalii", "Shara", "Camilo", "Milo", "Milú", "Lizzy", "Louis"};
         int count = nombres.length;
          for (int i = 0; i < count; i++){
             /*Al utilizar el continue, va a omitir los nombre camilo y louis.
             (salta la iteración actual y continua con la siguiente)*/
             if (nombres[i].equalsIgnoreCase("camilo") ||
                     nombres[i].equalsIgnoreCase("louis")){
                 continue;
             }
             System.out.println("nombre: " + nombres[i]);
         }
    }
}
