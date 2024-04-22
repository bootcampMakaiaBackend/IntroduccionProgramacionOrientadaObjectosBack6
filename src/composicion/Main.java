package composicion;

public class Main {
    public static void main(String[] args) {
        Autor ana = new Autor("Ana Herrera", "U.S");
        Libro principito = new Libro("El principito", "1990",ana);
        System.out.println(principito.getNombreAutor());
        System.out.println(principito.getTitulo());
    }
}
