import javax.swing.*;

public class Ejemplo_Matrices_Marco {
    public static String Mostrar_Matriz (int[][] matriz){
        String Matriz = "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                Matriz = Matriz + matriz[i][j] + "\t";
            }
            Matriz = Matriz + "\n";
        }
        return Matriz;
    }

    public static void main(String[] args) {
        int[][]matriz = new int[5][5];
        System.out.println("matriz - sin valores");
        System.out.println(Mostrar_Matriz(matriz));

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length;j++){
                if (i == 0 || i == matriz.length - 1 || j ==0 || j == matriz[i].length - 1 || i == j) {
                    matriz[i][j] = 1;
                }
            }
        }
        System.out.println("matriz - con valores");
        System.out.println(Mostrar_Matriz(matriz));
        JOptionPane.showMessageDialog(null,Mostrar_Matriz(matriz));

    }
}
