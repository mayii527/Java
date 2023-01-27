import javax.swing.*;

public class VentanaDialogo {
    //esta función es para que al usuario le aparezca una ventana indicando que ingrese un número
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingresa un numero");
        //manejar errores en el código, en caso de no ingresar un número
        int num = 0;
        try {
            num = Integer.parseInt(numeroStr);
        } catch (NumberFormatException exception){
            //Abre una nueva ventana con el msm de ERROR
            JOptionPane.showMessageDialog(null, "Error, ingresa un numero");
            //llama nuevamente al metodo main, para volver a correr el código
            main(args);
            //terminar la ejecucion del código, en estatus 0(todo salio bien)
            System.exit(0);
        }
        System.out.println(num);
    }
}
