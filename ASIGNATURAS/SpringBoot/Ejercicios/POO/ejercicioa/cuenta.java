public class cuenta {

    // Atributos
    private String titular;
    private double cantidad;

    // Constructor 1: Solo con el titular obligatorio (la cantidad se inicializa a 0
    // por defecto)
    public cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }

    // Constructor 2: Con titular y cantidad inicial
    public cuenta(String titular, double cantidad) {
        this.titular = titular;
        // Opcional: si la cantidad inicial fuera negativa, se asegura en 0
        if (cantidad < 0) {
            this.cantidad = 0.0;
        } else {
            this.cantidad = cantidad;
        }
    }

    // Métodos Getter y Setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Métodos especiales

    // Ingresar dinero: solo si la cantidad es mayor que 0
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Retirar dinero: si se retira más de lo que hay, se queda en 0
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0.0;
            } else {
                this.cantidad -= cantidad;
            }
        }
    }

    // Método toString clásico
    @Override
    public String toString() {
        return "Titular: " + titular + " | Cantidad disponible: " + cantidad + " Euros";
    }
}