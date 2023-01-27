public class ConversionDeTipos {
    public static void main(String[] args) {
        // Número entero de tipo string
        String numSTR = "10";
        // convierte un numero tipo string, v a un numero entero
        int numINT = Integer.parseInt(numSTR);
        System.out.println("Número entero: "+ numINT);

        //numero de tipo int
        int otroNumINT = 20;
        //Convierte un numero tipo int, a uno tipo string
        String otroNumSTR = Integer.toString(otroNumINT);
        System.out.println("Número tipo string: "+ otroNumSTR);

        //Convierte un numero tipo int, a uno tipo string usando el metodo valueOf
        otroNumSTR = String.valueOf(otroNumINT);
        System.out.println("Número tipo string, metodo valueOf: "+ otroNumSTR);

    }
}
