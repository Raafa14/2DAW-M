package ejercicioe;

public class Movil implements Comparable<Movil> {
    private String marca;
    private String modelo;
    private double precio;

    public Movil(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    // Ordenación natural por defecto (por precio ascendente)
    @Override
    public int compareTo(Movil otro) {
        return Double.compare(this.precio, otro.precio);
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + String.format("%.0f", precio) + " euros)";
    }
}