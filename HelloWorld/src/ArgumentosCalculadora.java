public class ArgumentosCalculadora {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Ingresa la operacion y dos enteros");
            System.exit(-1);
            main(args);
        }

        String operacion = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int resultado = 0;

        switch (operacion) {
                 case "suma" -> resultado = num1 + num2;
                 case "resta" -> resultado = num1 - num2;
                 case "division" -> resultado = num1 / num2;
                 case "miltiplicacion" -> resultado = num1 * num2;
                 default -> System.out.println("Ingresa una operacion.");
             }
        System.out.println("el resultado es:  " + resultado);
    }
}
