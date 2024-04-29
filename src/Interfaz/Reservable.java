package Interfaz;

public interface Reservable {
    //Es un contrato
    //Metodos no implementados
    //No atributos
    //Se implementa, no se hereda.
    //No es una clase
    //todos los metodos se implementa.
    public int reservar(String fechaInicio, String fechaFin);
    public boolean retornar();
    public void soporte(String mensaje);
}
