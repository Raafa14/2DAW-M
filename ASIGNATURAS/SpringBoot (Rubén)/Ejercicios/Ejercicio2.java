   import java.util.Scanner;
   import java.util.Random;

   public class Ejercicio2 {


        //      Ejercicio a:Crea una matriz con 5 filas y n columnas (Valor que debe pedirse al usuario). A
        //      continuación, rellénalo con números aleatorios entre 0 y 10. Para ello debes crear una
        //      función auxiliar que devuelva el número aleatorio generado y se haga la llamada desde la
        //      clase Main.

        public static int[][] numRandom(int valor) {

            Random rn = new Random();

            int matriz[][] = new int[5][valor];
            int matrizAuxiliar[][];
            

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz.length; j++) {

                    int numRandom = (int)(Math.random()*11);

                    matriz[i][j] = numRandom;

                }

            }

            for (int i = 0; i < matriz.length; i++) {

                System.out.println();

                for (int j = 0; j < matriz.length; j++) {

                    if (matriz[i][j] > 9) {

                        System.out.print("| " + matriz[i][j] + "| ");

                    } else {

                        System.out.print("| " + matriz[i][j] + " | ");

                    }

                }

            }

            return matriz;

        };

        // MAIN
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int colum;
            
            System.out.println("Cuantas columnas quieres añadir?");
            colum = sc.nextInt();

            numRandom(colum);

        }


    }
