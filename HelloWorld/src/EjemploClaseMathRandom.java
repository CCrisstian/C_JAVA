import java.util.Arrays;
import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        System.out.println("Crear un número ALEATORIO - RANDOM entre [0 - 1] usando Math.random()");
        double random = Math.random();
        System.out.println("random = " + random +"\n");
        System.out.println("========================================================================================\n");

        System.out.println("Obtener un número ALEATORIO - RANDOM entre [0 - 7] usando Math.random()\n");
        System.out.println("Usando 'random *= 7'\n");
        random *= 7;
        System.out.println("random = " + random);
        random = Math.floor(random);
        System.out.println("Redondeando hacia abajo el valor (random = "+random+")");
        System.out.println("Convirtiendo el valor double (random = "+random+") a un valor int (random = "+((int)random)+")\n");
        System.out.println("========================================================================================\n");

        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        System.out.println("Arreglo Colores = " + (Arrays.toString(colores)) +"\n");
        double random2 = Math.random();
        random2 *= colores.length;
        System.out.println("random2 = " + random2);
        random2 = Math.floor(random2);
        System.out.println("Redondeando HACIA ABAJO random2 = " + random2 + " ---> convirtiendo en un entero random2 = "+((int)random2));
        System.out.println("Colores[posición = "+ ((int)random2) +"] = " + colores[(int)random2]);
        System.out.println("========================================================================================\n");

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        long randomLong = randomObj.nextLong();
        System.out.println("randomInt = " + randomInt);
        System.out.println("randomLong = " + randomLong + "\n");

        int n = 25;
        System.out.println("Pasando un valor como parámetro, por lo que los random´s varían entre [0 - "+n+"). Es decir, no toman el valor "+n);
        randomInt = randomObj.nextInt(n);
        randomLong = randomObj.nextLong(n);
        System.out.println("randomInt = " + randomInt);
        System.out.println("randomLong = " + randomLong + "\n");

        int n2 = 15;
        System.out.println("Pasando dos valores como parámetros, por lo que los random´s varían entre ["+n2+" - "+n+"). Es decir, no toma el valor "+n);
        randomInt = n2 + randomObj.nextInt(n-n2);
        randomLong = n2 + randomObj.nextLong(n-n2);
        System.out.println("randomInt = " + randomInt);
        System.out.println("randomLong = " + randomLong + "\n");

        System.out.println("Colocando 'n-n2+1' para que el rango incluya el valor "+n+"\n["+n2+" - "+n+"]");
        randomInt = n2 + randomObj.nextInt(n-n2+1);
        randomLong = n2 + randomObj.nextLong(n-n2+1);
        System.out.println("randomInt = " + randomInt);
        System.out.println("randomLong = " + randomLong + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("Volviendo a trabajar con el Arreglo 'colores' esta vez usando 'randomInt' ");
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("Arreglo Colores --> " + (Arrays.toString(colores)));
        System.out.println("randomInt = " + randomInt);
        System.out.println("Colores[posición = "+ (randomInt) +"] --> " + colores[randomInt].toUpperCase());



    }
}
