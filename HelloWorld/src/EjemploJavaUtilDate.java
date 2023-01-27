import java.text.SimpleDateFormat;
import java.util.Date;
public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        // imprime la fecha actual
        System.out.println("fecha = " + fecha);
        //  formatear la fecha
        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy G 'a las' HH:mm:ss z");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
