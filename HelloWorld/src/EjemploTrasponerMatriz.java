public class EjemploTrasponerMatriz {

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a,b;
        a = new int[8][4];
        b = new  int[4][8];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = (i+j) * 3;
            }
        }
        System.out.println("\tMatriz a");
        mostrarMatriz(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("\n\tMatriz b (TRASPUESTA de a)");
        mostrarMatriz(b);

    }
}
