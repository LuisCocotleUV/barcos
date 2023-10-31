package DATOS;

public class Marinero extends Tripulante {
    // Atributos
    private int pesoTotalPescado;
    private static final float SUELDO_BASE = 90000;
    private float sueldoTotal;
    private float bono;

    // Constructor
    public Marinero(int numeroCarnet, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco, int pesoTotalPescado) {
        super(numeroCarnet, edad, tiempoEmpresa, nombre, telefono, sexo, barco);
        this.pesoTotalPescado = pesoTotalPescado;
        calcularBono();
        calcularSueldoTotal();
    }

    // Getters
    public int getPesoTotalPescado() {
        return pesoTotalPescado;
    }

    public float getSueldoTotal() {
        return sueldoTotal;
    }

    public float getBono() {
        return bono;
    }

    // Setters
    public void setPesoTotalPescado(int pesoTotalPescado) {
        this.pesoTotalPescado = pesoTotalPescado;
        calcularBono();
        calcularSueldoTotal();
    }

    // Método para calcular el bono
    private void calcularBono() {
        if (pesoTotalPescado >= 1) {
            bono = pesoTotalPescado * 0.25f;
        } else {
            bono = 0;
        }
    }

    // Método para calcular el sueldo total
    private void calcularSueldoTotal() {
        sueldoTotal = SUELDO_BASE + bono;
    }

    // Implementación de los métodos abstractos de la clase Tripulante
    @Override
    public float sueldo() {
        return sueldoTotal;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\nPeso Total Pescado: " + pesoTotalPescado + "\nSueldo Total: " + sueldoTotal + "\nBono: " + bono;
    }
}
