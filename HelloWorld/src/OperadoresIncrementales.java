public class OperadoresIncrementales {
    public static void main(String[] args) {
        //Pre-INCREMENTO
        int i = 1;
        int j = ++i;
        System.out.println("Pre-INCREMENTO");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("");

        //Post-INCREMENTO
        System.out.println("Post-INCREMENTO");
        i = 2;
        System.out.println("Inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("");

        //Pre-DECREMENTO
        System.out.println("Pre-DECREMENTO");
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("");

        //Post-DECREMENTO
        System.out.println("post-DECREMENTO");
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));
        System.out.println("j = " + j);
    }
}
