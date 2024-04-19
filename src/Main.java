import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner para leer en consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombrePersona = sc.nextLine();
        System.out.println("Ingrese la identificacion");
        String identificacion = sc.nextLine();
        System.out.println("Ingrese la nacionalidad");
        String nacionalidad = sc.nextLine();
        //Instanciar una clase
        //[Nombre clase] + nombreVariable = new [Nombre Clase][argumentos]
        Persona personaMateo = new Persona(nombrePersona, identificacion,nacionalidad, 15, "M");
        Persona personaMariana = new Persona("Mariana", "123");
        //Metodos
        boolean esMayorEdad = personaMateo.esMayorEdad();
        //Geters
        System.out.println(personaMateo.getNombre());
    }
}