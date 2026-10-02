package ejerciciob;

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

            System.out.print("Código del artículo: ");
            String codigo = scanner.nextLine();

            System.out.print("Cantidad en litros: ");
            double cantidad = Double.parseDouble(scanner.nextLine());

            System.out.print("Precio por litro: ");
            double precio = Double.parseDouble(scanner.nextLine());

            // Instanciamos el objeto con tu constructor
            facturas[i] = new Facturas(codigo, cantidad, precio);
        }

        // 2. Procesar los datos con los métodos de tu clase
        for (Facturas f : facturas) {
            // Facturación total (usa tu método facturacion())
            facturacionTotal += f.facturacion();

            // Cantidad en litros del artículo "1" (usa tu getCodigo() y getCantidad())
            if (f.getCodigo().trim().equals("1")) {
                litrosArticulo1 += f.getCantidad();
            }

            // Facturas de más de 600 € (usa tu método precio(), que devuelve 1 si supera
            // 600 o 0 si no)
            totalMasDe600 += f.precio();
        }

        // 3. Mostrar resumen de los resultados solicitados
        System.out.println("\n================ RESUMEN TOTAL ================");
        System.out.printf("Facturación total: %.2f €\n", facturacionTotal);
        System.out.printf("Litros vendidos del artículo 1: %.2f L\n", litrosArticulo1);
        System.out.println("Cantidad de facturas de más de 600 €: " + totalMasDe600);

        // 4. (Opcional) Mostrar el detalle de cada factura usando tu toString()
        System.out.println("\n--- Detalle de cada factura ---");
        for (Facturas f : facturas) {
            System.out.println(f);
        }

        scanner.close();
    }
}