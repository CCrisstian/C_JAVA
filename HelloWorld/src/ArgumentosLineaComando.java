public class ArgumentosLineaComando {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos n° " + i + ": " +args[i]);
        }

        // Para poder ingresar parámetros por terminal
        // PS C:\JAVA\HelloWorld\src>
        // javac -source 1.8 -target 1.8 ArgumentosLineaComando.java
        // java ArgumentosLineaComando


    }
}
