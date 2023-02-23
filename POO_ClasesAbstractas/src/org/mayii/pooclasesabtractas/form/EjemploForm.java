package org.mayii.pooclasesabtractas.form;

import org.mayii.pooclasesabtractas.form.elementos.*;
import org.mayii.pooclasesabtractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("Username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "JavaScript"))
        .addOpcion(new Opcion("4", "TypeScript"))
        .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHTML() {
                return "<input disabled name='"+this.nombre
                        +"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("Este campo esta deshabilitado");
        username.setValor("Mayii_C21");
        password.setValor("Mortadela1");
        email.setValor("mayicadavid.527@gmail.com");
        edad.setValor("21");
        experiencia.setValor("Mas de 10 años de experiencia.");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                email,
                password,
                experiencia,
                edad,
                lenguaje,
                saludar);
        /*
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        */

        for (ElementoForm e : elementos) {
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        }
    }
}
