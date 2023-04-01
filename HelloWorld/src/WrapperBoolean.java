public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primitivoBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primitivoBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = true;

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);
        System.out.println();

        System.out.println("Comparando dos OBJETOS BOOLEAN (por la INSTANCIA) - objetoBoolean = objetoBoolean2 -> " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando dos OBJETOS BOOLEAN (por la INSTANCIA) - objetoBoolean EQUALS objetoBoolean2 -> " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparando dos OBJETOS BOOLEAN (por la INSTANCIA) - objetoBoolean2 = objetoBoolean3 -> " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando dos OBJETOS BOOLEAN (por la INSTANCIA) - objetoBoolean = objetoBoolean3 -> " + (objetoBoolean == objetoBoolean3));
        System.out.println();

        boolean primitivoBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primitivoBoolean2 = " + primitivoBoolean2);
    }
}
