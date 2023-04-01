import java.util.Scanner;
import java.util.InputMismatchException;
public class SistemasNumerosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        //String numeroIngresado = scanner.nextLine();
        int numeroDecimal = 0;
        char asccinumerodecimal = 0;

        try{
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroIngresado);
            asccinumerodecimal = (char)numeroDecimal;

        } catch (InputMismatchException e){
            System.out.println("ERROR ingreso un valor NO VALIDO");
            main(args);
            System.exit(0);
        }
        String mensaje = "El numeroDecimal "+numeroDecimal+" en BINARIO es = " +Integer.toBinaryString(numeroDecimal);
        mensaje += "\n El numeroDecimal "+numeroDecimal+" en OCTAL es = "+Integer.toOctalString(numeroDecimal);
        mensaje += "\n El numerodecimal "+numeroDecimal+" en HEXADECIMAL es = "+Integer.toHexString(numeroDecimal);
        mensaje += "\n El numerodecimal "+numeroDecimal+" en ASCII es = "+asccinumerodecimal;
        System.out.println(mensaje);
    }
}
