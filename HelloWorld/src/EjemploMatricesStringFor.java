import javax.swing.*;

public class EjemploMatricesStringFor {
    public static String mostrarMatriz(String[][] matriz) {
        String m = "Matriz\n";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                m = m + matriz[i][j] + "  ";
            }
            m = m + "\n";
        }
        return m;
    }
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];
        nombres[0][0] = "pepe";
        nombres[0][1] = "pepa";
        nombres[1][0] = "josefa";
        nombres[1][1] = "paco";
        nombres[2][0] = "lucas";
        nombres[2][1] = "pancha";

        System.out.println("Iterando con for: ");
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nIterando con foreach: ");
        for (String[] fila: nombres) {
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

        JOptionPane.showMessageDialog(null,mostrarMatriz(nombres));

    }
}
