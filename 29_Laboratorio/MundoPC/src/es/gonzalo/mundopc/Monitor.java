package es.gonzalo.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    private Monitor() {
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamano) {
        this();
        this.tamano = tamano;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + "]";
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamano() {
        return tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

}
