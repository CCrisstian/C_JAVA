import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2019,Calendar.SEPTEMBER, 25, 18,20,10);

        calendario.set(Calendar.YEAR,2020);
        calendario.set(Calendar.MONTH,Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH,25);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        //calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,125);

        Date fecha = calendario.getTime();
        System.out.println("fecha SIN formato --> " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha CON formato ---> " + fechaConFormato + "\n");

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();
        System.out.println("fecha2 (fecha ACTUAL) --> " + fecha2 + "\n");
        System.out.println("======================================================================== \n");

        System.out.println("Usando fecha.after - fecha.before - fecha.equals");
        if (fecha.after(fecha2)){
            System.out.println("Fecha del usuario es POSTERIOR que fecha2 \n");
        } else if (fecha.before(fecha2)) {
            System.out.println("Fecha del usuario es ANTERIOR que fecha2 \n");
        } else if (fecha.equals(fecha2)) {
            System.out.println("Fecha del usuario es IGUAL que fecha2 \n");
        }
        System.out.println("======================================================================== \n");

        System.out.println("Usando fecha.comparteTo > 0 - fecha.comparteTo < 0 - fecha.comparteTo = 0");
        if ((fecha.compareTo(fecha2)) > 0){
            System.out.println("Fecha del usuario es POSTERIOR que fecha2");
        } else if ((fecha.compareTo(fecha2)) < 0) {
            System.out.println("Fecha del usuario es ANTERIOR que fecha2");
        } else if ((fecha.compareTo(fecha2)) == 0) {
            System.out.println("Fecha del usuario es IGUAL que fecha2");
        }
    }
}
