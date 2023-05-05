public class Ejemplo_Matrices_Sumar {

    public static String Mostrar_Matriz (int[][] matriz){
        String Matriz = "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
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

        int[][] b = {{10,20,30},
                    {40,50,60},
                    {70,80,90}};

        System.out.println("Matriz a");
        System.out.println(Mostrar_Matriz(a));

        System.out.println("Matriz b");
        System.out.println(Mostrar_Matriz(b));

        int[][] suma = new int[3][3];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < b.length; j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matriz suma");
        System.out.println(Mostrar_Matriz(suma));

    }
}
