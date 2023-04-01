import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
        String variable = 7 == 5 ? "si es VERDADERO" : "si es FALSO";
        System.out.println("variable = " + variable);

        String estado = "";

        double promedio = 0.0;
        double matemáticas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de Matemáticas en la escala de 2.0 - 7.0");
        matemáticas = scanner.nextDouble();
        System.out.println("Ingrese la nota de Ciencias en la escala de 2.0 - 7.0");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de Historia en la escala de 2.0 - 7.0");
        historia = scanner.nextDouble();

        promedio = (matemáticas+ciencias+historia)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "APROBADO" : "DESAPROBADO";
        System.out.println("estado = " + estado);
        
    }
}
