import java.util.*;
public class EjemploMilo {
        public static void main(String[] args) throws Exception {
            String files = "file1.pdf,file2.jpg,sf.asdf";
            String extensionesPermitidas = "pdf,jpg";
            List<String> lista = new ArrayList<>();
            List<String> listaExt = new ArrayList<>();
            String[] arrLista = files.split(",");
            String[] arrListaExtPermitidas = extensionesPermitidas.split(",");
            for (int i=0; i < arrLista.length; i++){
                lista.add(arrLista[i].substring(arrLista[i].indexOf(".") + 1));
            }
            for (int i=0; i < arrListaExtPermitidas.length; i++){
                listaExt.add(arrListaExtPermitidas[i]);
            }
            System.out.println(listaExt.containsAll(lista));
        }
}
