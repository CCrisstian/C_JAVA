import javax.swing.*;
import java.lang.reflect.Array;

public class tarea4InstruccionNombres {
    public static void main(String[] args) {
        String nom1 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido de la 1ra persona");
        String[] nombre1 = nom1.split(" ");

        String nom2 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido de la 2da persona");
        String[] nombre2 = nom2.split(" ");

        String nom3 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido de la 3ra persona");
        String[] nombre3 = nom3.split(" ");

        int largo1 = nombre1[0].length();
        int largo2 = nombre2[0].length();
        int largo3 = nombre3[0].length();

        String resultado="";

        if (largo1 > largo2 && largo1 > largo3) {resultado = "El nombre mas largo es "+nom1;}
        if (largo2 > largo1 && largo2 > largo3) {resultado = "El nombre mas largo es  "+nom2;}
        if (largo3 > largo1 && largo3 > largo2) {resultado = "El nombre mas largo es  "+nom3;}

        System.out.println(resultado);
    }
}
