package Interfaz;

public class Carro implements Reservable {
    private String placa;
    private String fabricacion;
    private String cilindraje;
    private String marca;
    private boolean estaDisponible;

    public Carro(String placa, String fabricacion, String cilindraje, String marca) {
        this.placa = placa;
        this.fabricacion = fabricacion;
        this.cilindraje = cilindraje;
        this.marca = marca;
    }



    @Override
    public int reservar(String fechaInicio, String fechaFin) {
        if(fechaInicio != null && fechaFin!= null){
            return 10000;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean retornar() {
        return true;
    }

    @Override
    public void soporte(String mensaje) {
        System.out.println("llamando a soporte desde el carro" + mensaje);
    }
}
