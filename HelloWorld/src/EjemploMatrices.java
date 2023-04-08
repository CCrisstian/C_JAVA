import javax.swing.*;

public class EjemploMatrices {

    public static void main(String[] args) {

        int[][] números = new int[2][4];

        números[0][0] = 1;
        números[0][1] = 2;
        números[0][2] = 3;
        números[0][3] = 4;

        números[1][0] = 11;
        números[1][1] = 12;
        números[1][2] = 13;
        números[1][3] = 14;

        System.out.println("PRIMER elemento de la matriz --> "+números[0][0]);
        System.out.println("ULTIMO elemento de la matriz --> "+números[números.length-1][números[1].length-1]);
        System.out.println("Número de filas "+números.length);
        System.out.println("Número de columnas "+números[0].length);

        int num1 = números[0][0];
        int num2 = números[0][1];
        int num3 = números[0][2];
        int num4 = números[0][3];
        int num5 = números[1][0];
        int num6 = números[1][1];
        int num7 = números[1][2];
        int num8 = números[1][3];
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);


    }
}
