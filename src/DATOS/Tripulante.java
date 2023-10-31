package DATOS;

public abstract class Tripulante {
    // Atributos
    private int numeroCarnet;
    private int edad;
    private int tiempoEmpresa;
    private String nombre;
    private String telefono;
    private char sexo;
    private Barco barco;

    // Constructor
    public Tripulante(int numeroCarnet, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco) {
        this.numeroCarnet = numeroCarnet;
        this.edad = edad;
        this.tiempoEmpresa = tiempoEmpresa;
        this.nombre = nombre;
        this.telefono = telefono;
        this.sexo = sexo;
        this.barco = barco;
    }

    // Getters
    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public int getEdad() {
        return edad;
    }

    public int getTiempoEmpresa() {
        return tiempoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public Barco getBarco() {
        return barco;
    }

    // Setters
    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTiempoEmpresa(int tiempoEmpresa) {
        this.tiempoEmpresa = tiempoEmpresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

   // Métodos abstractos
   public abstract float sueldo();
   public abstract String mostrarDatos();
}

