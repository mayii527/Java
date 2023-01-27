public class ArgumentosLineaComando {
    public static void main(String[] args) {
        // se compila el programa desde la terminal con el comando: "javac nombreArchivo.java"
        //se ejecuta el programa con: "java nombreArchivo" y se pasan los argumentos
        if (args.length == 0){
            System.out.println("Debe ingresar argumentos!");
            System.exit(1);
            main(args);
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumento num " + i + ": " + args[i]);
        }
    }
}
