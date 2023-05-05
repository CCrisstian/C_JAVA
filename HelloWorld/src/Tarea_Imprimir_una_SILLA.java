import java.util.Scanner;

public class Tarea_Imprimir_una_SILLA {

    public static String Mostrar_Matriz (String[][] m){
        String Matriz = "";
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                Matriz = Matriz + m[i][j] + "\t";
            }
            Matriz = Matriz + "\n";
        }
        return Matriz;
    }

    public static String[][] Crear_Matriz_SILLA (String[][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                if (j==0){
                    m[i][j] = "1";
                } else{
                    m[i][j] = "0";
                }
            }
        }

        for (int k = 0; k < m.length; k++){
            m[m.length/2][k] = "1";
        }

        for (int l = 0; l < m.length; l++){
            if (l > m.length/2){
                m[l][m.length-1] = "1";
            }
        }
        return m;
    }

    public static void main(String[] args) {
        String Mensaje = "Tarea_Imprimir_una_SILLA\n";
        Mensaje += "A continuación deberá ingresar dos valores (enteros) para construir una matriz\n";
        Mensaje += "Será una matriz de n x n\n";

        System.out.println(Mensaje);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el valor de n (filas x columnas)");

        int n = scanner.nextInt();

        if (n != 0){
            String[][] matriz = new String[n][n];

            System.out.println("\n\tMatriz SILLA\n"+"Filas: "+n+" - "+"Columnas: "+n+"\n");
            System.out.print(Mostrar_Matriz(Crear_Matriz_SILLA(matriz)));
        }else{
            System.out.println("ERROR ");
        }

    }

}
