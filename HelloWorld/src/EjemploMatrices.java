import javax.swing.*;

public class EjemploMatrices {

    public static String mostrarMatriz(int[][] matriz) {
        String m = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                m = m + (matriz[i][j]) + "\t ";
            }
            m = m + "\n";
        }
        return m;
    }

    public static void main(String[] args) {

        int[][] números = new int[2][4];

        for (int i = 0; i < números.length; i++) {
            for (int j = 0; j < números[i].length; j++) {
                try {
                    números[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para la matriz"));
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Ingreso un valor incorrecto, por favor ingrese un número entero");
                    j--;
                }
            }
        }

        String mensaje = "Matriz a \n";
        mensaje = mensaje + mostrarMatriz(números);
        mensaje = mensaje + "Cantidad de filas --> " + números.length +"\n";
        mensaje = mensaje + "Cantidad de columnas --> " + números[0].length + "\n";
        mensaje = mensaje + "El PRIMER elemento de la matriz es --> " + números[0][0] + "\n";
        mensaje = mensaje + "El ULTIMO elemento de la matriz es --> " + números[números.length-1][números[1].length-1];
        JOptionPane.showMessageDialog(null,mensaje);

    }
}
