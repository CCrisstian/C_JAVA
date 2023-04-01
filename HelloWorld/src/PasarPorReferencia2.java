class Persona {
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Cristian");

        System.out.println("persona --> " + persona.leerNombre());

        System.out.println("\n----------------------------------------------------------\n");

        test(persona);
        System.out.println("DESPUÉS de llamar al método TEST");
        System.out.println("persona --> " + persona.leerNombre());

        System.out.println("Finaliza el método MAIN con los datos de persona modificados por el método TEST");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método TEST");

        persona.modificarNombre("Pepe");

        System.out.println("Aca finaliza el método TEST");
    }

}
