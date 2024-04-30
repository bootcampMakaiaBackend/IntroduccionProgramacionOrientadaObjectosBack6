package abstracto;

//Como convierto una clase en abstracta
public abstract class Figura {
    // atributos
    private String tipo;
    private String color;
    //constructores
    public Figura(String tipo, String color){
        this.tipo = tipo;
        this.color = color;
    }
    //metodos definidos
    public void mostrarInformacionFigura(){
        System.out.println("El tipo es : " + this.tipo + " El color es: "+ this.color);
    }
    //metodos abstractos (metodos no definidos)
    public abstract double calcularArea();
}
