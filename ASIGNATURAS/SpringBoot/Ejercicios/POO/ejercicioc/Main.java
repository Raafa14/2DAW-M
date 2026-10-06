package ejercicioc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Facturas[] facturas = new Facturas[5];

        // Variables acumuladoras y contadores
        double facturacionTotal = 0;
        double litrosArticulo1 = 0;
        int totalMasDe600 = 0;

        // 1. Lectura de las 5 facturas
        for (int i = 0; i < facturas.length; i++) {
            System.out.println("--- DATOS FACTURA " + (i + 1) + " ---");

            System.out.print("Código del artículo (1, 2 o 3): ");
            String codigo = scanner.nextLine();

            System.out.print("Cantidad en litros: ");
            double cantidad = Double.parseDouble(scanner.nextLine());

            // Instanciamos la factura (el precio se calcula automáticamente)
            facturas[i] = new Facturas(codigo, cantidad);
        }

        // 2. Procesar los datos
        for (Facturas f : facturas) {
            // Facturación total
            facturacionTotal += f.facturacion();

            // Cantidad en litros del artículo "1"
            if (f.getCodigo().trim().equals("1")) {
                litrosArticulo1 += f.getCantidad();
            }

            // Facturas de más de 600 €
            totalMasDe600 += f.esMayorA600();
        }

        // 3. Mostrar resumen de los resultados
        System.out.println("\n================ RESUMEN TOTAL ================");
        System.out.printf("Facturación total: %.2f €\n", facturacionTotal);
        System.out.printf("Litros vendidos del artículo 1: %.2f L\n", litrosArticulo1);
        System.out.println("Cantidad de facturas de más de 600 €: " + totalMasDe600);

        // 4. Detalle de cada factura
        System.out.println("\n--- Detalle de cada factura ---");
        for (Facturas f : facturas) {
            System.out.println(f);
        }

        scanner.close();
    }
}