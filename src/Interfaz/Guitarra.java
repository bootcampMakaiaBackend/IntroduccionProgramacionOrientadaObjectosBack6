package Interfaz;

public class Guitarra implements Reservable{
    @Override
    public int reservar(String fechaInicio, String fechaFin) {
        return 0;
    }

    @Override
    public boolean retornar() {
        return false;
    }

    @Override
    public void soporte(String mensaje) {

    }
}
