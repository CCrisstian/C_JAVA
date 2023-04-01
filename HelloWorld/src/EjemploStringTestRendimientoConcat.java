public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i <100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //  5 mlseg // 10 mlseg // 240 mlseg // 241 // 9773
            //c += a + b +"\n"; // 30 mlseg // 45 mlseg // 159 mlseg // 181 // 4027
            sb.append(a).append(b).append("\n"); //  0 mlseg / 5 mlseg // 25
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin-inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
