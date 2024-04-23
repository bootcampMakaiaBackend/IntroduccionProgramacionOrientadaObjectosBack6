package agregacion;

public class Cliente {
    private String nombre;
    private String identificacion;
    private int edad;

    //Constructores
    public Cliente(String nombre, String identificacion, int edad){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
}
