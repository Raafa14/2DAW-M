package ejerciciob;
// Ejercicio b) Una empresa que se dedica a la venta de desinfectantes necesita un programa para

// gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida en
// litros y el precio por litro.
// Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo
// 1 y cuantas facturas se emitieron de más de 600 €.

public class Facturas {
    private String codigo;
    private double cantidad;
    private double precio;

    public Facturas(String codigo, double cantidad, double precio) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double facturacion() {
        return this.cantidad * this.precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int precio() {
        int contador = 0;
        if (facturacion() > 600) {
            contador++;
        }
        return contador;
    }

}
