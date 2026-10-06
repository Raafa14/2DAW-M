package ejercicioe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movil> listaMoviles = new ArrayList<>();

        // Carga de datos de la lista dada
        listaMoviles.add(new Movil("Apple", "iPhone 12 Pro Max", 1259));
        listaMoviles.add(new Movil("Xiaomi", "Mi 10 Pro", 999));
        listaMoviles.add(new Movil("Huawei", "P40 Pro+", 1399));
        listaMoviles.add(new Movil("Samsung", "Z Flip 5G", 1550));
        listaMoviles.add(new Movil("Samsung", "S20", 1500));
        listaMoviles.add(new Movil("LG", "V50", 899));
        listaMoviles.add(new Movil("Xiaomi", "Mi 10 Pro", 999));
        listaMoviles.add(new Movil("Huawei", "P40 Pro+", 1399));
        listaMoviles.add(new Movil("Samsung", "Z Flip 5G", 1550));
        listaMoviles.add(new Movil("Samsung", "S30", 1300));
        listaMoviles.add(new Movil("Huawei", "P50 Pro+", 1399));
        listaMoviles.add(new Movil("Samsung", "Z Flip 5G", 1550));

        // -------------------------------------------------------------
        // APARTADO 1: Ordenar solo por precio (de menor a mayor)
        // -------------------------------------------------------------
        Collections.sort(listaMoviles); // Utiliza el compareTo definido en la clase

        System.out.println("=== APARTADO 1: ORDENADO POR PRECIO ===");
        for (Movil m : listaMoviles) {
            System.out.println(m);
        }

        // -------------------------------------------------------------
        // APARTADO 2: Ordenar por precio y, a igual precio, por marca
        // -------------------------------------------------------------
        listaMoviles.sort(Comparator.comparing(Movil::getPrecio)
                                   .thenComparing(Movil::getMarca));

        System.out.println("\n=== APARTADO 2: ORDENADO POR PRECIO Y MARCA ===");
        for (Movil m : listaMoviles) {
            System.out.println(m);
        }
    }
}