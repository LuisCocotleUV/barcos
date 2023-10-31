package DATOS;

public class JefeDeFlota extends Tripulante {
    // Atributos
    private int pesoPescado;
    private int pesoMariscos;
    private static final float SUELDO_BASE = 350000000;
    private float sueldoTotal;
    private float bonoPescado;
    private float bonoMariscos;

    // Constructor
    public JefeDeFlota(int numeroCarnet, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco, int pesoPescado, int pesoMariscos) {
        super(numeroCarnet, edad, tiempoEmpresa, nombre, telefono, sexo, barco);
        this.pesoPescado = pesoPescado;
        this.pesoMariscos = pesoMariscos;
        calcularBonos();
        calcularSueldoTotal();
    }

    // Getters
    public int getPesoPescado() {
        return pesoPescado;
    }

    public int getPesoMariscos() {
        return pesoMariscos;
    }

    public float getSueldoTotal() {
        return sueldoTotal;
    }

    public float getBonoPescado() {
        return bonoPescado;
    }

    public float getBonoMariscos() {
        return bonoMariscos;
    }

    // Setters
    public void setPesoPescado(int pesoPescado) {
        this.pesoPescado = pesoPescado;
        calcularBonos();
        calcularSueldoTotal();
    }

    public void setPesoMariscos(int pesoMariscos) {
        this.pesoMariscos = pesoMariscos;
        calcularBonos();
        calcularSueldoTotal();
    }

    // Método para calcular los bonos
    private void calcularBonos() {
        bonoPescado = pesoPescado * 1.0f;
        bonoMariscos = pesoMariscos * 2.0f;
    }

    // Método para calcular el sueldo total
    private void calcularSueldoTotal() {
        sueldoTotal = SUELDO_BASE + bonoPescado + bonoMariscos;
    }

   // Implementación de los métodos abstractos de la clase Tripulante
   @Override
   public float sueldo() {
       return sueldoTotal;
   }

   @Override
   public String mostrarDatos() {
       return super.mostrarDatos() + "\nPeso Pescado: " + pesoPescado + "\nPeso Mariscos: " + pesoMariscos + "\nSueldo Total: " + sueldoTotal + "\nBono Pescado: " + bonoPescado + "\nBono Mariscos: " + bonoMariscos;
   }
}

