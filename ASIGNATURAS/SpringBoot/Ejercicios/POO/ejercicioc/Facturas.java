package ejercicioc;

public class Facturas {
    private String codigo;
    private double cantidad;
    private double precio;

    // Constructor que asigna el precio automáticamente según el código
    public Facturas(String codigo, double cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = calcularPrecio(codigo);
    }

    // Método auxiliar para determinar el precio
    private double calcularPrecio(String codigo) {
        switch (codigo.trim()) {
            case "1":
                return 0.6;
            case "2":
                return 3.0;
            case "3":
                return 1.25;
            default:
                return 0.0; // En caso de introducir un código no válido
        }
    }

    public double facturacion() {
        return this.cantidad * this.precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
        this.precio = calcularPrecio(codigo); // Actualiza el precio si cambia el código
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int esMayorA600() {
        return (facturacion() > 600) ? 1 : 0;
    }

    @Override
    public String toString() {
        return "Factura [Código=" + codigo + ", Cantidad=" + cantidad + "L, Precio/L=" + precio + "€, Total=" + facturacion() + "€]";
    }
}