import java.util.Scanner;

public class Ejercicio04 {

        public static void binario () {

            Scanner sc =  new Scanner(System.in);
            int n;
            int acumulador[] = new int[8];
            int cociente = 0;

            System.out.println("Introduce un valor");
            n = sc.nextInt();

            if (n >= 0 && n <= 255) {

                if (n >= 128) {

                    n = n - 128;
                    acumulador[0] = 1;

                };
                if (n >= 64) {

                    n = n - 64;
                    acumulador[1] = 1;

                };
                if (n >= 32) {

                    n = n - 32;
                    acumulador[2] = 1;

                };
                if (n >= 16) {

                    n = n - 16;
                    acumulador[3] = 1;

                };
                if (n >= 8) {

                    n = n - 8;
                    acumulador[4] = 1;

                };
                if (n >= 4) {

                    n = n - 4;
                    acumulador[5] = 1;

                };
                if (n >= 2) {

                    n = n - 2;
                    acumulador[6] = 1;

                };
                if (n == 1) {

                    acumulador[7] = 1;

                };

                for (int i = 0; i < acumulador.length; i++) {

                    System.out.println(acumulador[i]);

                };

            } else {

                System.out.println("El valor introducido no es valido");
                System.out.println("Introduce del 0 al 255");

            };


        };

        public static void main(String[] args) {
            
            binario();

        }


    }
