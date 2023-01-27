import java.lang.reflect.Array;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        //Obtener la extension de un archivo.
        String files = "file1.pdf,file5.pdf,fh.pdf";
        String extensionesPermitidas = "pdf";
        String[] lista = files.split(",");
        int largo = lista.length;
        String[] extension = extensionesPermitidas.split(",");
        int largo2 = extension.length;
        boolean respuesta = true;

        for(int i = 0; i < largo; i++){
            int punto = lista[i].lastIndexOf(".");
            if (!lista[i].substring(punto + 1).equals(extension[0])){
                respuesta = false;
            }
        }
        System.out.println(respuesta);
    }
}