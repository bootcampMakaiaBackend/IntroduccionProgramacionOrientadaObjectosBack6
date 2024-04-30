package abstracto;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("Rojo", "cuadrado", 3);
        Triangulo triangulo = new Triangulo("verde", "triangulo", 5, 4);
        Circulo circulo = new Circulo("circulo", "rojo", 5);
        cuadrado.mostrarInformacionFigura();
        triangulo.mostrarInformacionFigura();
        circulo.mostrarInformacionFigura();
        System.out.println(cuadrado.calcularArea());
        System.out.println(triangulo.calcularArea());
        //La clase abstracta no se puede instanciar?
        //Figura xxx = new Figura("figura", "rojo")
    }
}
