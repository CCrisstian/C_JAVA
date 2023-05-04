public class EjemploMatricesSimétrica {
    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean simétrica = true;

        int i,j;
        i = 0;

        while (i < matriz.length && simétrica == true){
            j = 0;
            while (j < i && simétrica == true){
                if (matriz[i][j] != matriz[j][i]){
                    simétrica = false;
                }
                j++;
            }
            i++;
        }

        if (simétrica){
            System.out.println("La matriz es simétrica (usando solo while)");
        }else{
            System.out.println("La matriz NO es simétrica (usando solo while)");
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        simétrica = true;

        i = 0;
        salir:while (i < matriz.length ){
            j = 0;
            while (j < i ){
                if (matriz[i][j] != matriz[j][i]){
                    simétrica = false;
                    break salir;
                }
                j++;
            }
            i++;
        }

        if (simétrica){
            System.out.println("La matriz es simétrica (usando etiquetas y while)");
        }else{
            System.out.println("La matriz NO es simétrica (usando etiquetas y while)");
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        simétrica = true;

        salir:for (i = 0; i < matriz.length;i++ ){
            for (j = 0;j < i; j++ ){
                if (matriz[i][j] != matriz[j][i]){
                    simétrica = false;
                    break salir;
                }
            }
        }

        if (simétrica){
            System.out.println("La matriz es simétrica (usando etiquetas y for)");
        }else{
            System.out.println("La matriz NO es simétrica (usando etiquetas y for)");
        }

    }
}
