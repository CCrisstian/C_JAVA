import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la Factura");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese 2 precios");
        System.out.println("\nIngrese el precio 1");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese el precio 2");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1+precio2;
        double impuesto = 0.19;
        double total = (totalBruto+(totalBruto*impuesto));

        int impuestoInt = (int)(impuesto*100);

        String mensaje = ("\n Nombre de la factura: "+nombreFactura);
        mensaje += "\n \n Precio 1: "+precio1+"$"+"\t Precio2: "+precio2+"$";
        mensaje += "\n------------------------------------------";
        mensaje += "\n El total bruto es de: "+totalBruto+"$";
        mensaje +="\n Impuestos del "+impuestoInt+"%";
        mensaje += "\n------------------------------------------";
        mensaje += "\n El total mas impuestos es de: "+total+"$";
        System.out.println(mensaje);
    }
}
