import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        /*char num = 'z';

        switch (num){
            case '0':
                System.out.println("El numero es 0");
                break;
            case '1':
                System.out.println("El numero es 1");
                break;
            case '2':
                System.out.println("El numero es 2");
                break;
            case '3':
                System.out.println("El numero es 3");
                break;
            case  'a':
                System.out.println("El caracter es a");
            default:
                System.out.println("Numero o caracter desconocido");
        }*/

        /*String nombre = "Juan";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case  "Cristian":
                System.out.println("Hola "+ nombre+ "");
                break;
            case  "pepe":
                System.out.println("Hola "+nombre);
                break;
            default:
                System.out.println("Usuario desconocido!");
        }*/

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 -12");
        int mes = s.nextInt();
        String nombreMes= null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
                break;
        }
        System.out.println("nombreMes = " + nombreMes);

    }
}
