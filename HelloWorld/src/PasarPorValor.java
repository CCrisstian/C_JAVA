public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;
        System.out.println("Iniciamos el método MAIN con i = " + i + "\n");

        test(i);
        System.out.println("Finaliza el método MAIN con el valor de i = " + i);

    }

    public static void test(int i){
        System.out.println("Iniciamos el método TEST con i = " + i);
        i = 35;
        System.out.println("Aca finaliza con i = " + i + "\n");

    }

}
