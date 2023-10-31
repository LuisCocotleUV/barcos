package DATOS;

public class Capitan extends Tripulante {
    // Atributos
    private int horasExperticia;
    private static final float SUELDO_BASE = 4500000;
    private float sueldoTotal;
    private float bono;

    // Constructor
    public Capitan(int numeroCarnet, int edad, int tiempoEmpresa, String nombre, String telefono, char sexo, Barco barco, int horasExperticia) {
        super(numeroCarnet, edad, tiempoEmpresa, nombre, telefono, sexo, barco);
        this.horasExperticia = horasExperticia;
        calcularBono();
        calcularSueldoTotal();
    }

    // Getters
    public int getHorasExperticia() {
        return horasExperticia;
    }

    public float getSueldoTotal() {
        return sueldoTotal;
    }

    public float getBono() {
        return bono;
    }

    // Setters
    public void setHorasExperticia(int horasExperticia) {
        this.horasExperticia = horasExperticia;
        calcularBono();
        calcularSueldoTotal();
    }

    // Método para calcular el bono
    private void calcularBono() {
        if (horasExperticia >= 5000 && horasExperticia < 150000) {
            bono = SUELDO_BASE * 0.2f;
        } else if (horasExperticia >= 150000 && horasExperticia < 300000) {
            bono = SUELDO_BASE * 0.4f;
        } else if (horasExperticia >= 300000) {
            bono = SUELDO_BASE * 0.75f;
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
       return super.mostrarDatos() + "\nHoras de Experticia: " + horasExperticia + "\nSueldo Total: " + sueldoTotal + "\nBono: " + bono;
   }
}