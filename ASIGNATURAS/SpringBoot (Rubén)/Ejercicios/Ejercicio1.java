
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {

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

    public static void main(String[] args) {
            
        cadenasRecibidas("aeiou", "ai zw");

    }


    }