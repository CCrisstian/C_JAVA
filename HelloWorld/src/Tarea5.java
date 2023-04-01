import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Tarea5 {
    public static void main(String[] args) {
        int MAX = 20;
        List<Double> ListaNotas = new ArrayList<Double>();
        Double Prom5 = 0.0;
        Double Prom4 = 0.0;
        Double Prom1 = 0.0;
        Double Promedio = 0.0;

        etiqueta:
        for (int i = 0; i < MAX;){
            double num = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese una nota"));

            if (num == 0){
                JOptionPane.showMessageDialog(null, "ERROR");
                break;
            }
            if (1.0<= num && num <= 7.0){
                ListaNotas.add(num);
                if (num > 5.0){Prom5 = Prom5 + 1;};
                if (num < 4.0){Prom4 = Prom4 + 1;};
                if (num == 1.0){Prom1 = Prom1 + 1;};
                Promedio = Promedio + num;
            }
            else{
                JOptionPane.showMessageDialog(null, "Ingreso un valor incorrecto");
                continue etiqueta;
            }
            i++;
            if (i == MAX){
                Prom5 = Prom5 / MAX;

                Prom4 = Prom4 / MAX;
                Prom1 = Prom1 / MAX;
                Promedio = Promedio / MAX;

                System.out.println("Notas = " + ListaNotas);
                System.out.println("Promedio de notas mayores a 5 es de " + Prom5);
                System.out.println("Promedio de notas menores a 4 es de " + Prom4);
                System.out.println("Promedio de notas iguales a 1 es de " + Prom1);
                System.out.println("El promedio de notas es de " + Promedio);
            }
        }


    }

}
