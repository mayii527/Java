import javax.swing.*;
public class NombreMasLargo {
    public static void main(String[] args) {
        // Imprime el nombre más largo usando el operador ternario.
        String nombre1 = JOptionPane.showInputDialog(null,"Ingresa un primer nombre y apellido:");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingresa un segundo nombre y apellido:");
        String nombre3 = JOptionPane.showInputDialog(null,"Ingresa un tercer nombre y apellido:");

        String nombre = nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length() ?
                nombre1 : nombre2;
        nombre = nombre.split(" ")[0].length() > nombre3.split(" ")[0].length() ?
                nombre : nombre3;

        System.out.println("El nombre mas largo es " + nombre);
    }
}
