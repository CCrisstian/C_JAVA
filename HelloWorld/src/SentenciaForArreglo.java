import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Cristian", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;


        for (int i = 0; i < count; i++){
            if ((nombres[i].toLowerCase().contains("cristian".toLowerCase()))|| nombres[i].toLowerCase().contains("pepa".toLowerCase())){
                continue;
            }
            System.out.println(i+" -- "+nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"pepe\" o \"maria\":");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;

        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                if (encontrado){
                    JOptionPane.showMessageDialog(null,buscar + " fue encontrado!");
                } else {
                    JOptionPane.showMessageDialog(null, buscar + " NO fue encontrado en el sistema!");
                }
                break;
            }
            System.out.println("nombres = " + nombres[i]);

        }
    }
}
