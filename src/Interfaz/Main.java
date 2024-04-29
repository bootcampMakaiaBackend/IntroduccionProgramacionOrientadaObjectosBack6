package Interfaz;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("ABC123", "2019", "1000", "audi");
        Moto moto = new Moto("ibc1", "2024", "19", "FERRARI");
        carro.soporte("ayuda");
        moto.soporte(" estoy pinchado");
        carro.retornar();
        moto.retornar();
    }
}
