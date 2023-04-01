import javax.swing.*;

public class Tarea6 {
    public static void main(String[] args) {
        int num = Integer.valueOf(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        int num2 = Integer.valueOf(JOptionPane.showInputDialog(null,"Ingrese otro numero"));
        int num3 = 0;
        int aux = 0;
        int aux2 = 0;


        if (num > 0 && num2 > 0){
            for (int i = 0; i < num2;){
                num3 = num3 + num;
                i++;
            }
            JOptionPane.showMessageDialog(null, num+"  *  "+num2+" = "+num3);
        }

        if (num < 0 && num2 < 0){
            aux = num*-1;
            aux2 = num2*-1;
            for (int i = 0; i < aux2;){
                num3 = num3 + aux;
                i++;
            }
            JOptionPane.showMessageDialog(null, num+"  *  "+num2+" = "+num3);
        }

        if (num < 0 && num2 > 0){
            aux = num*-1;
            for (int i = 0; i < num2;){
                num3 = num3 + aux;
                i++;
            }
            JOptionPane.showMessageDialog(null, num+"  *  "+num2+" = -"+num3);
        }

        if (num > 0 && num2 < 0){
            aux = num2*-1;
            for (int i = 0; i < aux;){
                num3 = num3 + num;
                i++;
            }
            JOptionPane.showMessageDialog(null, num+"  *  "+num2+" = -"+num3);
        }


    }
}
