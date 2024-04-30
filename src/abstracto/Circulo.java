package abstracto;

public class Circulo extends Figura{

    private int radio;

    public Circulo(String tipo, String color, int radio){
        super(tipo, color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
