import java.lang.reflect.Method;

public class EjemploMetodoGETCLASS {
    public static void main(String[] args) {

        String texto = "Hola que tal!";

        Class strClass = texto.getClass();
        System.out.println("strClass getName ---> " + strClass.getName());
        System.out.println("strClass getSimpleName ---> " + strClass.getSimpleName());
        System.out.println("strClass getPackage ---> " + strClass.getPackage());
        System.out.println("strClass getPackageName ---> " + strClass.getPackageName());
        System.out.println("strClass ---> " + strClass);

        System.out.println("\n \n"); /*DOBLE SALTO DE LINEA*/

        for (Method método : strClass.getMethods()){
            System.out.println("método = " + método.getName());
        }
        System.out.println("\n \n"); /*DOBLE SALTO DE LINEA*/

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass ---> " + intClass);
        System.out.println("intClass.getName ---> " + intClass.getName());
        System.out.println("intClass.getSimpleName ---> " + intClass.getSimpleName());
        System.out.println("intClass.getPackage ---> " + intClass.getPackage());
        System.out.println("intClass.getPackage.getName ---> " + intClass.getPackage().getName());
        System.out.println("intClass.getSuperclass ---> " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass.getSuperclass ---> " + intClass.getSuperclass().getSuperclass());
        System.out.println("\n \n"); /*DOBLE SALTO DE LINEA*/

        Class objtClass = intClass.getSuperclass().getSuperclass();
        for (Method método : objtClass.getMethods()){
            System.out.println("método.getName ---> " + método.getName());
        }



    }
}
