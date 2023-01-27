import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        //la clase calendar no permite crear un objeto con el operador new, es una clase abstracta.
        Calendar calendario = Calendar.getInstance();
        calendario.set(2001, Calendar.NOVEMBER, 15);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);
    }
}
 