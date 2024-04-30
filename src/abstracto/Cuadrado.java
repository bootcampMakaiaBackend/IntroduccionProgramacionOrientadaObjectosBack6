package abstracto;

public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(String color, String tipo, int lado){
        //llamar constructor del padre
        super(tipo, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    public double calcularPerimetro(){
        return lado*4;
    }
}
