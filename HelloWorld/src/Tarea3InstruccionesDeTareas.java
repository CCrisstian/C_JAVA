import javax.swing.*;

public class Tarea3InstruccionesDeTareas {
    public static void main(String[] args) {
        Double num = Double.valueOf(JOptionPane.showInputDialog(null,"Ingrese la cantidad actual de litros"));
        String estado = " ";

        if(num == 70){estado="Estanque lleno";}
        if(num < 70 && num >= 60){estado="Estanque casi lleno";};
        if(num < 60 && num >= 40){estado="Estanque 3/4";};
        if(num < 40 && num >= 35){estado="Medio Estanque";};
        if(num < 35 && num >= 20){estado="Suficiente";};
        if(num < 20 && num >= 1){estado="Insuficiente";};

        System.out.println();
        System.out.println("Instrucciones de tareas");
        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("La medida actual del Estanque es de = " + num);
        System.out.println();
        System.out.println("El estado actual del Estanque es : "+ estado.toUpperCase());



    }
}
