package Interfaz;

public class Moto implements Reservable {
    private String placa;
    private String fabricacion;
    private String cilindraje;
    private String marca;
    private boolean estaDisponible;

    public Moto(String placa, String fabricacion, String cilindraje, String marca) {
        this.placa = placa;
        this.fabricacion = fabricacion;
        this.cilindraje = cilindraje;
        this.marca = marca;
    }

    @Override
    public int reservar(String fechaInicio, String fechaFin) {
        if(estaDisponible){
            this.estaDisponible = false;
            //validar identidad usuario
            //validar dian.
            return 100000;

        }

        return 0;
    }

    @Override
    public boolean retornar() {
        //validar que la moto este en buen estado
        //validar la identidad de la persona entregando
        // generar factura
        System.out.println("Retornando moto");
        this.estaDisponible = true;
        return true;
    }

    @Override
    public void soporte(String mensaje) {
        System.out.println("Llamando soporte desde la motocicleta" + mensaje);
    }

    public String getPlaca() {
        return placa;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

}
