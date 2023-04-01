import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Tarea5InstruccionesDeTarea {
    public static void main(String[] args) {

        boolean t = true;
        List<Integer> ListaNumeros = new ArrayList<Integer>();

        etiqueta : while (t){

            Scanner s = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int numero = s.nextInt();
            ListaNumeros.add(numero);

            System.out.println("¿Desea continuar S / N?");
            Character respuesta = s.next().charAt(0);
            respuesta = Character.toUpperCase(respuesta);


            if (respuesta == 'N'){t = false;}

        }

        System.out.println("Los números ingresados fueron " + ListaNumeros);
        System.out.println();

        int max = ListaNumeros.size();
        List<Integer> ListaMenoresQue10 = new ArrayList<Integer>();
        for (int i = 0; i < max; i++){
            if (ListaNumeros.get(i) < 10){
                ListaMenoresQue10.add(ListaNumeros.get(i));
            }
        }

        System.out.println("Los números menores que 10 son");
        System.out.println(ListaMenoresQue10);
    }
}
