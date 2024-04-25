package herencia;

public class Profesion {
    //Atributos
    private String nombre;
    protected int sueldoBase;

    //constructor
    public Profesion(String nombre, int sueldoBase){
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }


    //metodos
    public int calcularSueldoMensual(){
        return this.sueldoBase;
    }
    public double calcularAportePension(){
        return this.sueldoBase*0.16;
    }
    public String getNombre(){
        return this.nombre;
    }

    public int getSueldoBase(){
        return this.sueldoBase;
    }
}
