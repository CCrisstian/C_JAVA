import javax.swing.*;

public class tarea {
    public static void main(String[] args) {
        String resultado ="";

        String nombre1 = JOptionPane.showInputDialog(null,"Ingrese el 1er nombre");
        String nombre2 = JOptionPane.showInputDialog(null,"Ingrese el 2do nombre");
        String nombre3 = JOptionPane.showInputDialog(null,"Ingrese el 3er nombre");

        resultado = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2) + "_";
        resultado = resultado + nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2) + "_";
        resultado = resultado + nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        System.out.println("nombre1 ingresado = " + nombre1);
        System.out.println("nombre2 ingresado = " + nombre2);
        System.out.println("nombre3 ingresado = " + nombre3);
        System.out.println();
        System.out.println("Conversion realizada - Resultado devuelto");
        System.out.println();
        System.out.println(resultado);
        
    }
}
