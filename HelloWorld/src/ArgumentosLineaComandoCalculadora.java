public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            String Op = "| sumar       |\n| restar      |\n| multiplicar |\n| dividir     |\n";
            String mensaje = "\nIngrese una operación\n \n" + Op + "\ny 2 números enteros\n";
            System.err.println(mensaje);
            System.exit(-1);
        }

        String operación = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            String Op = "| sumar       |\n| restar      |\n| multiplicar |\n| dividir     |\n";
            String mensaje = "\nIngrese un valor erróneo por favor ingrese operación\n \n" + Op + "\ny 2 números enteros\n";
            System.err.println(mensaje);
            System.exit(-1);
        }


        switch (operación){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if (b == 0){
                    System.err.println("\nNo se puede dividir por 0\n");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = 0.00;
        }

        System.out.println("\nResultado de la operación '"+ operación +"' es --> "+ resultado +"\n");

        // Para poder ingresar parámetros por terminal
        // PS C:\JAVA\HelloWorld\src>ComandoCalculadora.java
        // javac -source 1.8 -target 1.8 ArgumentosLineaComandoCalculadora.java
        // java ArgumentosLineaComandoCalculadora
    }
}
