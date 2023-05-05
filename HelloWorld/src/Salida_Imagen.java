import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Salida_Imagen {
    public static void main(String[] args) {
        // Crear un objeto ImageIcon a partir de la imagen
        ImageIcon imagen = new ImageIcon("C:\\Users\\criss\\Documents\\JAVA\\C_JAVA\\HelloWorld\\src/icono.jpg");

        // Crear un objeto JLabel para mostrar la imagen
        JLabel etiquetaImagen = new JLabel(imagen);

        // Crear una ventana para mostrar la imagen
        JFrame ventana = new JFrame("Imagen");
        ventana.add(etiquetaImagen);
        ventana.pack();
        ventana.setVisible(true);
    }
}
