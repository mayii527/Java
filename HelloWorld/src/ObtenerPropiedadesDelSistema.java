import java.util.Properties;
public class ObtenerPropiedadesDelSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String java = System.getProperty("user.version");
        System.out.println("java = " + java);

        //lista todas las propiedades
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
