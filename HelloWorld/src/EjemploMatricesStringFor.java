import javax.swing.*;

public class EjemploMatricesStringFor {

    public static void main(String[] args) {

        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};


        System.out.println("\nIterando con foreach: ");
        for (String[] fila: nombres) {
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }


    }
}
