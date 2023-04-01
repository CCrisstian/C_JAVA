public class PrecedenciaOperadores {
    public static void main(String[] args) {
        
        int i = 14;
        int j = 8;
        int k = 20;
        
        double promedio = (i + j + k) / 3d;
        System.out.println("promedio1 = " + promedio);

        promedio = (i + j + k) / 3d * 10;
        System.out.println("promedio2 = " + promedio);

        promedio = --i + j++ + k / 3d * 10;
        System.out.println("promedio3 = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
