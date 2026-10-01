
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 { 

    // Ejercicio A:

    public static void cadenasRecibidas (String stri1, String stri2) {

        String out1 = "";
        String out2 = "";

        for (int i = 0; i < stri1.length(); i++) {

            char caracter = stri1.charAt(i);

            if (!stri2.contains(String.valueOf(caracter))) {
                
                out1 = out1 + caracter;

            };

        };

        for (int i = 0; i < stri2.length(); i++) {

            char caracter2 = stri2.charAt(i);

            if (!stri1.contains(String.valueOf(caracter2))) {
                
                out2 = out2 + caracter2;

            };

        };
        
        System.out.println(out1);
        System.out.println("-------------------------------------------------");
        System.out.println(out2);

    }


    // Ejercicio B: Crea una función que calcule y retorne cuántos días hay entre dos cadenas
    // de texto que representen fechas.


    public static int devolverFecha (String fecha1, String fecha2) throws Exception {

        String partes1[] = fecha1.split("/");
        String partes2[] = fecha2.split("/");
        int opcion = 0;

        if (partes1.length != 3 || partes2.length != 3) {
        throw new IllegalArgumentException("Formato no válido, debe ser dd/MM/yyyy");
        }

        int dia1 = Integer.parseInt(partes1[0]);
        int mes1 = Integer.parseInt(partes1[1]);
        int anio1 = Integer.parseInt(partes1[2]);
        int dia2 = Integer.parseInt(partes2[0]);
        int mes2 = Integer.parseInt(partes2[1]);
        int anio2 = Integer.parseInt(partes2[2]);

        if (dia1 < 1 || dia1 > 30 || mes1 < 1 || mes1 > 12 || anio1 <= 0 ||
            dia2 < 1 || dia2 > 30 || mes2 < 1 || mes2 > 12 || anio2 <= 0) {
            throw new IllegalArgumentException("Fecha incorrecta");
        }

        int suma1 = dia1 + (mes1 * 30) + (anio1 * 365);
        int suma2 = dia2 + (mes2 * 30) + (anio2 * 365);
        
        int dias = Math.abs(suma1 - suma2);

        return dias;
    };

    public static void main(String[] args) throws Exception {
            
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la primera fecha: ");
        String fecha1 = sc.next();
        System.out.println("Introduzca la segunda fecha: ");
        String fecha2 = sc.next();

        System.out.println("Cual de las dos fechas será la primera? Elija 1 o 2");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            
            System.out.println("La primera fecha sera: " + fecha1);
            System.out.println("La segunda fecha sera: " + fecha2);

        } else if (opcion == 2) {

            System.out.println("La primera fecha sera: " + fecha2);
            System.out.println("La segunda fecha sera: " + fecha1);

        }

        try {

            int diasTotales = devolverFecha(fecha1, fecha2);

            if (diasTotales > 365) {
                int anios = diasTotales / 365;
                int restoDias = diasTotales % 365;
                System.out.println("La diferencia entre fechas es de " + anios + " años con " + restoDias + " días (" + diasTotales + " días totales)");
            } else {
                System.out.println("La diferencia de días es: " + diasTotales);
            }
            
        } catch (Exception e) {

            System.out.println("Se ha producido un error: " + e);
            System.out.println("Formato de fechas incorrectos.");

        }

    }


    }