import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.ImageIcon;


public class Yeah_Buddy_Light_weight {
    public static void main(String[] args) throws Exception {
        // Cargar el archivo de sonido
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                Yeah_Buddy_Light_weight.class.getResourceAsStream("SoundEffect.wav"));

        // Crear un clip de sonido y abrir el flujo de audio
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        // Reproducir el sonido
        clip.start();

        // Mostrar un mensaje por pantalla
        ImageIcon icono = new ImageIcon("C:\\Users\\criss\\Documents\\JAVA\\C_JAVA\\HelloWorld\\src/icono.jpg");
        JOptionPane.showMessageDialog(null,null,"Ronnie JAVA",JOptionPane.INFORMATION_MESSAGE,icono);
        // Esperar a que termine el sonido
        Thread.sleep(clip.getMicrosecondLength() / 1000);

        // Cerrar el clip de sonido y el flujo de audio
        clip.stop();
        clip.close();
        audioInputStream.close();
    }
}
