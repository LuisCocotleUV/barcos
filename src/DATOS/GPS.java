package DATOS;

public class GPS {
    // Atributos
    private String coordenadaX;
    private String coordenadaY;
    private String fecha;
    private String hora;
    private int diasTripulado;

    // Constructor
    public GPS(String coordenadaX, String coordenadaY, String fecha, String hora, int diasTripulado) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.fecha = fecha;
        this.hora = hora;
        this.diasTripulado = diasTripulado;
    }

    // Getters
    public String getCoordenadaX() {
        return coordenadaX;
    }

    public String getCoordenadaY() {
        return coordenadaY;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getDiasTripulado() {
        return diasTripulado;
    }

    // Setters
    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(String coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setDiasTripulado(int diasTripulado) {
        this.diasTripulado = diasTripulado;
    }
}
