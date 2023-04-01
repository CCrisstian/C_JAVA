public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("Valor ingresado de la variable\nabsoluto = -"+absoluto+"\n");
        System.out.println("Valor ABSOLUTO de la variable usando Math.abs\nabsoluto = " + absoluto + "\n");
        System.out.println("========================================================================================\n");

        absoluto = Math.abs(3);
        System.out.println("Valor ingresado de la variable \nabsoluto = +"+absoluto + "\n");
        System.out.println("Valor ABSOLUTO de la variable usando Math.abs\nabsoluto = " + absoluto +"\n");
        System.out.println("========================================================================================\n");

        System.out.println("Calcular el VALOR MÁXIMO entre 2 NÚMEROS (double , double) usando Math.max \n");
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max+ "\n");
        System.out.println("========================================================================================\n");

        System.out.println("Calcular el VALOR MÍNIMO entre 2 NÚMEROS (double , double) usando Math.min \n");
        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("REDONDEAR al VALOR MÁXIMO (tope o techo) de un decimal (double) usando Math.ceil \n");
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("REDONDEAR al VALOR MÍNIMO de un decimal (double) usando Math.floor \n");
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("REDONDEAR un VALOR DECIMAL (long) y RETORNARLO como ENTERO usando Math.round \n");
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero + "\n");
        entero = Math.round(3.4);
        System.out.println("entero = " + entero + "\n");
        entero = Math.round(Math.PI);
        System.out.println("entero = " + entero + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("función EXPONENCIAL, exponente X (double) y base e (2,71828) usando Math.exp\n");
        double exp = Math.exp(1);
        System.out.println("exp = e^X = " + exp + "\n");
        exp = Math.exp(2);
        System.out.println("exp = e^X = " + exp + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("función LOGARITMO NATURAL, toma como base e (2,71828), usando Math.log\n");
        double log = Math.log(10);
        System.out.println("log = " + log + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("función POTENCIA (base , exponente) usando Math.pow\n");
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("función RAíZ CUADRADA usando Math.sqrt\n");
        double raíz = Math.sqrt(5);
        System.out.println("raíz = " + raíz + "\n");
        System.out.println("========================================================================================\n");

        System.out.println("TRIGONOMETRÍA \n");
        System.out.println("CONVERTIR RADIANES a GRADOS usando Math.toDegrees(radianes)");
        double grados = Math.toDegrees(1.57);
        System.out.println("grados = " + grados);
        System.out.println("redondeando (grados = " + grados + ") a (grados = " +(grados = Math.round(grados))+")\n");

        System.out.println("CONVERTIR GRADOS a RADIANES usando Math.toRadians(grados)");
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes + "\n");

        System.out.println("funciones SENO Math.sin(radianes), COSENO Math.cos(radianes) y TANGENTE Math.tan(radianes)");
        System.out.println("sin (90.00) : "+Math.sin(radianes));
        radianes = Math.toRadians(180.00);
        System.out.println("cos (180.00) : "+Math.cos(radianes));
        System.out.println("tang (180.00) : "+Math.tan(radianes));
        radianes = Math.toRadians(0.00);
        System.out.println("cos (0.00) : "+Math.cos(radianes));
        System.out.println("tang (0.00) : "+Math.tan(radianes)+"\n");

    }
}
