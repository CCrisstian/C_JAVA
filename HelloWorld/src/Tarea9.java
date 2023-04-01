import javax.swing.*;

public class Tarea9 {
    public static void main(String[] args) {

        String mensaje = "Tarea: Calcular el área de un circulo\n\n Por favor ingrese el valor del radio para poder calcular el area del circulo";

        int n = Integer.parseInt(JOptionPane.showInputDialog(mensaje));

       double PI = 3.1416;
       double area = PI * (Math.pow(n,2));

       mensaje = "El valor del radio ingresado es --> radio = "+n+"\n\n";
       mensaje = mensaje + "Formula para calcular el area 'area = PI * (Math.pow(n,2))'\n\n";
       mensaje = mensaje + "Resultado --> Area = "+area;
       JOptionPane.showMessageDialog(null,mensaje);

    }
}
