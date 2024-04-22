import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //[Nombre clase] + nombreVariable = new [Nombre Clase][argumentos]
        Persona personaMateo = new Persona("mateo", "123","COL", 15, "M");
        System.out.println(personaMateo.getNombre());
        System.out.println(personaMateo.getNacionalidad());
        personaMateo.setNacionalidad("PR");
        System.out.println(personaMateo.getNacionalidad());
    }
}