import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = {"Cristian","admin","pepe"};
        String[] passwords = {"12345","12345","123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese el password");
        String contraseña = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){

            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(contraseña)) ? true : esAutenticado;

            /*if ((usernames[i].equals(usuario) && passwords[i].equals(contraseña))){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usuario).concat("!") : "Username o Password incorrectos";
        System.out.println(mensaje);

        /*if (esAutenticado){
            System.out.println("Bienvenido usuario " .concat(usuario).concat("!"));
        } else {
            System.out.println("Username o Password incorrectos");
            System.out.println("Lo siento, requiere autenticación");
        }*/

    }
}
