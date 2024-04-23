package agregacion;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Bogota", "Al agua patos");
        Cliente cliente1 = new Cliente("rosa", "123", 58);
        tienda.agregarCliente(cliente1);
        Cliente cliente2 = new Cliente("Pepe", "111", 20);
        tienda.agregarCliente(cliente2);
    }
}
