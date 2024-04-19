public class Persona {
    //ATRIBUTOS [MODIFICADOR DE ACCESO] + [TIPO DE DATO] +  [NOMBRE DEL ARTIBUTO] +
    private String nombre;
    private String identificacion;
    public String nacionalidad;
    public int edad;
    public String sexo;
    //CONSTRUCTORES
    //[publico] + nombre clase + los argumentos
    //Argumentos metodos (tipo de dato + nombre del argumento)
    public Persona (String nombrePersona, String identificacion, String nacionalidad, int edad, String sexo){
        this.nombre = nombrePersona;
        this.edad = edad;
        this.sexo = sexo;
        this.identificacion = identificacion;
        this.nacionalidad = nacionalidad;
    }
    public Persona(String nombre, String identificacion){
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    //METODOS
    //[modificador de acceso] + [tipo de retorno] + [nombre del metodo] + [argumentos]
    public boolean esMayorEdad(){
        if(this.edad >= 18) {
            return true; // retorno el tipo de dato del metodo
        }else {
            return false;
        }
    }

    public String getNombre(){
        return this.nombre;
    }
}
