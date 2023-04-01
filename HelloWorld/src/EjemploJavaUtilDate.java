import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();
        System.out.println("fecha ---> " + fecha + "\n");

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr ---> " + fechaStr +"\n");

        long j = 0;
        for (int i = 0; i < 100000000; i++){
            j += i;
        }
        System.out.println("j = " + j +"\n");

        Date fecha2 = new Date();
        long tiempofinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for --> " + tiempofinal +"\n");



    }
}
