package org.mayii.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Thali", "Andrade", 4);
        alumno.setNotaLenguaje(5.5);
        alumno.setNotaMatematicas(4.5);

        AlumnoInternacional alumnoInter = new AlumnoInternacional("Sara", "Cadavid", 31);
        alumnoInter.setPais("Mexico");
        alumnoInter.setNotaIdiomas(3.6);
        alumnoInter.setColegio("Instituto Nacional");
        alumnoInter.setNotaLenguaje(5.5);
        alumnoInter.setNotaMatematicas(4.5);


        Profesor profesor = new Profesor("Mayii", "Cadavid", 21);
        profesor.setAsignatura("Matematicas");

        System.out.println("Alumno: "+alumnoInter.getNombre()+" "+ alumnoInter.getApellido()+
                " |Pais: "+alumnoInter.getPais()+ " | Edad: "+ alumnoInter.getEdad());

        System.out.println("Alumno: "+alumno.getNombre()+" "+ alumno.getApellido()+ " | Edad: "+
                alumno.getEdad());

        System.out.println("Profesor: "+profesor.getNombre()+" "+ profesor.getApellido()+
                " | Edad: "+ profesor.getEdad()+ "| Asignatura: "+ profesor.getAsignatura());
    }
}
