package agregacion;

public class Tienda {
    private String ubicacion;
    private String nombre;
    private Cliente[] clientes; //esto es un arreglo de clientes
    private int contadorClientes;//un atributo para contar el numero de clientes

    public Tienda(String ubicacion, String nombre){
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.clientes =  new Cliente[4]; // Solo se crea el arreglo
        this.contadorClientes = 0;
    }

    public void agregarCliente(Cliente cliente){
        if(this.contadorClientes < this.clientes.length) {
            this.clientes[contadorClientes] = cliente; // asigne el cliente
            this.contadorClientes++; // aumento el contador de clientes
        } else {
            System.out.println("NO SE PUEDEN AGREGAR MAS CLIENTES");
        }
    }

    //Tarea => imprimir todos los nombres y la edad de los clientes que estan en la tienda.


}
