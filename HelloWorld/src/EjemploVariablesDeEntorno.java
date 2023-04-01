import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de Ambiente del Sistema ---> " + varEnv);
        
        String username = System.getenv("USERNAME");
        System.out.println("username --> " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome --> " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir --> " + temDir);

        String path = System.getenv("Path");
        System.out.println("path --> " + path + "\n");
        System.out.println("========================================================================\n");

        System.out.println("USANDO varEnv.get \n");
        String path2 = varEnv.get("Path");
        System.out.println("path --> " + path2);
        System.out.println("========================================================================\n");

        System.out.println("listando variables de entorno del sistema usando FOR \n");
        for (String key: varEnv.keySet()){
            System.out.println(key + " --> " + varEnv.get(key));
        }

    }
}
