import javax.swing.*;

public class SistemasNumeros {
    public static void main(String[] args) {

        String numeroIngresado = JOptionPane.showInputDialog(null,"Ingrese un numero");

        try{
            int numeroDecimal = Integer.parseInt(numeroIngresado);
            char asccinumerodecimal = (char)numeroDecimal;
            String mensaje = "El numeroDecimal "+numeroDecimal+" en BINARIO es = " +Integer.toBinaryString(numeroDecimal);
            mensaje += "\n El numeroDecimal "+numeroDecimal+" en OCTAL es = "+Integer.toOctalString(numeroDecimal);
            mensaje += "\n El numerodecimal "+numeroDecimal+" en HEXADECIMAL es = "+Integer.toHexString(numeroDecimal);
            mensaje += "\n El numerodecimal "+numeroDecimal+" en ASCII es = "+asccinumerodecimal;

            JOptionPane.showMessageDialog(null, mensaje);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor ingresado NO VALIDO");
            main(args);
            System.exit(0);
        }

    }
}
