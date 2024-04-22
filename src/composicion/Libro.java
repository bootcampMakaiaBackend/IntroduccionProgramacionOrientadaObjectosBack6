package composicion;

public class Libro {
    //[MODIFICADOR] [TIPO DATO] [NOMBRE ATRIBUTO]
    private String titulo;
    private String anoPublicacion;
    private Autor autorLibro;

    public Libro(String titulo, String anoPublicacion, Autor autor){
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
        this.autorLibro = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getNombreAutor(){
        return this.autorLibro.getNombre();
    }

}
