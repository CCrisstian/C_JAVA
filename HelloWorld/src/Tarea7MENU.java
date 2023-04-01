import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Tarea7MENU {
    public static void main(String[] args) {
        int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar",2);
        opciones.put("Agregar",3);
        opciones.put("Listar",4);
        opciones.put("Salir",5);
        boolean t = true;

        etiqueta:while (t){

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null, "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);


            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            }else {
                opcionIndice = opciones.get(opcion.toString());
                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Producto ACTUALIZADO con exito");
                        continue etiqueta;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Producto ELIMINADO con exito");
                        continue etiqueta;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Producto AGREGADO con exito");
                        continue etiqueta;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Producto LISTADO con exito");
                        continue etiqueta;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Haz SALIDO con exito");
                        t = false;
                        break;
                }
            }
        }
    }
}
