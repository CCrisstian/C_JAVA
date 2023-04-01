public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        boolean prueba = false;

        /* while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;


        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;

        do {
            System.out.println("Esto NUNCA se va a ejecutar");
        } while (prueba);*/

        prueba = true;
        i = 0;

        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);
    }
}
