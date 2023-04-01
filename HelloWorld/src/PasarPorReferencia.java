public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10, 11 ,12};
        System.out.println("Iniciamos el método MAIN");

        System.out.println("ANTES de llamar al método TEST");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("\n----------------------------------------------------------\n");

        test(edad);
        System.out.println("DESPUÉS de llamar al método TEST");
        for (int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Finaliza el método MAIN con los datos del Arreglo modificados por el método TEST");
    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el método TEST");

        for (int i = 0; i < edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }

        System.out.println("Aca finaliza el método TEST");
    }

}
