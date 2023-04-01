public class Caracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = "+caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("¿decimal = caracter? " + (decimal == caracter));
        char simbolo = '@';

        System.out.println("simbolo = " + simbolo);
        System.out.println("¿simbolo = caracter? " + (simbolo == caracter));
        System.out.println("\n");

        var caracter2 = '\u0040';
        var decimal2 = 64;
        System.out.println("¿decimal2 = caracter2? " + (decimal2 == caracter2));

        char espacio = '\u0020';
        char retroceso = '\b';

        System.out.println("Hola mundo"+espacio+"MUNDO");
        System.out.println("Hola mundo"+retroceso+"MUNDO");
        System.out.println("Hola mundo"+retroceso+retroceso+"MUNDO");

        char tabulador = '\t';
        System.out.println("Hola mundo"+tabulador+"MUNDO");
        System.out.println("Hola \tMUNDO");

        char nuevaLinea = '\n';
        System.out.println("Hola mundo"+nuevaLinea+"MUNDO");
        System.out.println("Hola \nMUNDO");
        
        char retornoCarro = '\r';
        System.out.println("retornoCarro = " + retornoCarro);
        System.out.println("char" +System.lineSeparator());

    }
}

