public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿num1 y num2 son el mismo objeto? - " + (num1 == num2));
        System.out.println();

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("¿num1 y num2 son el mismo objeto? - " + (num1 == num2));
        System.out.println("Por el método EQUALS (compara por valor) num1 y num2 - " + (num1.equals(num2)));
        System.out.println("Por el método intValue (compara por valor) num1 y num2 - " + (num1.intValue() == num2.intValue()));
        System.out.println();

        num2 = 500;
        boolean condición  = num1 > num2;
        System.out.println("num1 > num2 = " + condición);
        System.out.println();

        num2 = 500;
        boolean condición2  =  num1.intValue() < num2.intValue();
        System.out.println("num1.intValue() < num2.intValue() = " + condición2);
    }
}
