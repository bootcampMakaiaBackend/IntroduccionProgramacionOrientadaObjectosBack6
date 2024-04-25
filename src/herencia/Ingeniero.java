package herencia;

public class Ingeniero extends Profesion{
    private String nombreObra;
    private String ubicacionObra;

    public Ingeniero(String nombreObra, String ubicacionObra, String nombre, int sueldoBase){
        super(nombre, sueldoBase);
        this.nombreObra = nombreObra;
        this.ubicacionObra = ubicacionObra;
    }

    //calcular el aporte a pension sobre el 17%
    //sobre escribir el metodo calcularPension
    @Override
    public double calcularAportePension(){
        //protegido para acceder al atributo del padre.
        return this.sueldoBase*0.17;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public String getUbicacionObra() {
        return ubicacionObra;
    }
}
