import javax.swing.*;
import java.util.Scanner;

public class Tarea2MostrarDosNumeros {
    public static void main(String[] args) {
        System.out.println("Para números enteros");
        double num1 = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el 1er numero"));
        double num2 = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese el 2do numero"));
        double max;
        double min;

        max = num1 > num2 ? num1 : num2;
        min = num1 < num2 ? num1 : num2;

        System.out.println("El 1er numero ingresado es = " + num1);
        System.out.println("El 2do numero ingresado es = " + num2);
        System.out.println("-------------------------------------");
        System.out.println("Números ordenados de MAYOR A MENOR: "+max+" - "+min);

    }
}
