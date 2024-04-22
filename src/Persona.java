public class Persona {
    //ATRIBUTOS [MODIFICADOR DE ACCESO] + [TIPO DE DATO] +  [NOMBRE DEL ARTIBUTO] +
    private String nombre;
    private String identificacion;
    private String nacionalidad;
    private int edad;
    private String sexo;
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
    //Geter -> Obtener informacion atributos al mundo exterior.
    public String getNombre(){
        return this.nombre;
    }

    public String getIdentificacion(){
        return this.identificacion;
    }

    public String getNacionalidad(){
        return  this.nacionalidad;
    }
    //seter -? es para cambiar el atributo desde el mundo exterior
    public void setNacionalidad(String nuevaNacionalidad){
        this.nacionalidad = nuevaNacionalidad;
    }
}
