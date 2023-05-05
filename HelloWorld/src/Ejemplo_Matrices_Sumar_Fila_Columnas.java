public class Ejemplo_Matrices_Sumar_Fila_Columnas {

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
        int[][] a = {{1,2,3}
                    ,{4,5,6},
                    {7,8,9}};

        System.out.println("Matriz a");
        System.out.println(Mostrar_Matriz(a));

        int sumaFila,sumaColumna;

        for (int i = 0; i < a.length; i++){
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < a[i].length; j++){
                sumaFila += a[i][j];
                sumaColumna += a[j][i];
            }
            System.out.println("Total sumaFila = " + sumaFila);
            System.out.println("Total sumaColumna = " + sumaColumna);
        }

    }
}
