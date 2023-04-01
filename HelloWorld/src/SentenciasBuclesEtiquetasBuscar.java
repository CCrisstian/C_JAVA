public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo tres tristes tigres tragan trigo en un trigaltrigo";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i < maxFrase;){
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("cantidad de veces que aparece la palabra "+palabra+" es "+ cantidad);
    }
}
