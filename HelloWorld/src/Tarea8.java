import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tarea8 {
    public static void main(String[] args) {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String f = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento con el siguiente formato 'yyyy-MM-dd'");

        int AñoActual = 0;
        int MesActual = 0;
        int DiaActual = 0;
        int Edad = 0;
        int Mes = 0;
        int Dia = 0;
        String Aux = "";
        String Mensaje = "";

        for (int i = 0; i < 4; i++){
            Aux = Aux + f.charAt(i);
        }
        Edad = Integer.valueOf(Aux);
        Aux = "";

        for (int i = 5; i < 7; i++){
            Aux = Aux + f.charAt(i);
        }
        Mes = Integer.valueOf(Aux);
        Aux = "";

        for (int i = 8; i < 10; i++){
            Aux = Aux + f.charAt(i);
        }
        Dia = Integer.valueOf(Aux);

        try {
            Date fechaIngr = formato.parse(f);
            String fechaIngresada = formato.format(fechaIngr);
            Mensaje = "Fecha ingresada --- " + fechaIngresada + "\n";

            Calendar calendario = Calendar.getInstance();
            Date fecha = calendario.getTime();
            String fechaConFormato = formato.format(fecha);
            Mensaje = Mensaje + "Fecha Actual --- " + fechaConFormato + "\n";
            Mensaje = Mensaje + "------------------------------------------------------\n";

            AñoActual = calendario.get(Calendar.YEAR);
            Edad = AñoActual - Edad;

            Mensaje = Mensaje + "Su edad APROXIMADA es de " + Edad + " años \n";
            Mensaje = Mensaje + "------------------------------------------------------\n";

            MesActual = calendario.get(Calendar.MONTH);
            MesActual = ++MesActual;
            DiaActual = calendario.get(Calendar.DAY_OF_MONTH);

            if (MesActual > Mes){
                Mensaje = Mensaje +"Su edad EXACTA es de " + Edad + " años";
            } else if (MesActual < Mes) {
                    Mensaje = Mensaje +"Su edad EXACTA es de " + --Edad + " años";
                }   else if ( (MesActual == Mes)&&(DiaActual >= Dia) ){
                        Mensaje = Mensaje +"Su edad EXACTA es de " + Edad + " años";
                    }   else if ( (MesActual == Mes)&&(DiaActual < Dia) ){
                            Mensaje = Mensaje +"Su edad EXACTA es de " + --Edad + " años";
                         }


            JOptionPane.showMessageDialog(null, Mensaje);

        }catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
