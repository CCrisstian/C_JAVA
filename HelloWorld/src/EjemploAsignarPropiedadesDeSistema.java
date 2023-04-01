import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.out.println("ANTES de System.setProperties(p) \n");
            System.getProperties().list(System.out);
            System.out.println("========================================================================\n");

            System.out.println("DESPUÉS de System.setProperties(p) \n");
            System.setProperties(p);
            System.getProperties().list(System.out);
            System.out.println("========================================================================\n");

            System.out.println("USANDO Properties ps = System.getProperties() \n");
            Properties ps = System.getProperties();
            ps.list(System.out);
            System.out.println("========================================================================\n");

            System.out.println("ps.getProperty(...) --> "+ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
        }
        catch (Exception e){
            System.err.println("No existe el archivo " + e);
            System.exit(1);
        }

    }
}
