package DATOS;

public class Barco {
    // Atributos
    private String nombre;
    private String tipo;
    private int capacidadPasajeros;
    private int capacidadCarga;

    // Constructor
    public Barco(String nombre, String tipo, int capacidadPasajeros, int capacidadCarga) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadCarga = capacidadCarga;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    // Método para mostrar todos los datos del barco
    public String mostrarDatos() {
        return "Nombre: " + nombre + "\nTipo: " + tipo + "\nCapacidad de Pasajeros: " + capacidadPasajeros + "\nCapacidad de Carga: " + capacidadCarga;
    }
}
