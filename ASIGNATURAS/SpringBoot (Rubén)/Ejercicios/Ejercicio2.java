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

                for (int j = 0; j < matriz[i].length; j++) {

                    int numRandom = (int)(Math.random()*11);

                    matriz[i][j] = numRandom;

                }

            }

            for (int i = 0; i < matriz.length; i++) {

                System.out.println();

                for (int j = 0; j < matriz[i].length; j++) {

                    if (matriz[i][j] > 9) {

                        System.out.print("| " + matriz[i][j] + "| ");

                    } else {

                        System.out.print("| " + matriz[i][j] + " | ");

                    }

                }

            }

            return matriz;

        };


        public static void matrizOriginal(){

            Scanner sc =  new Scanner(System.in);

            System.out.println("Escriba un tamaño: ");
            int longi = sc.nextInt();

            int[][] matriz1 = new int[longi][longi];
            int[][] matriz2 = new int[longi][longi];
            int[][] matrizAux = new int[longi][longi];
            int valor;
            
            // Matriz 1
            for (int i = 0; i < matriz1.length; i++){

                for (int j = 0; j < matriz1[i].length; j++) {

                    System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 1: ");
                    valor = sc.nextInt();

                    matriz1[i][j] = valor;

                }

            }
            // Matriz 2
            for (int i = 0; i < matriz2.length; i++){

                for (int j = 0; j < matriz2[i].length; j++) {

                    System.out.println("Escriba el valor para la fila "+i+" y columna "+j+" de la matriz 2: ");
                    valor = sc.nextInt();

                    matriz2[i][j] = valor;

                }

            }

            //Mostrar matriz 1

            System.out.print("Matriz 1:");
            for (int i = 0; i < matriz1.length; i++){

                System.out.println();

                for (int j = 0; j < matriz1[i].length; j++) {

                    System.out.print(matriz1[i][j]+ " | ");

                }

            }
            System.out.println("");
            System.out.print("Matriz 2:");
            for (int i = 0; i < matriz2.length; i++){

                System.out.println();

                for (int j = 0; j < matriz2[i].length; j++) {

                    System.out.print(matriz2[i][j]+ " | ");

                }

            }
            System.out.println();
            System.out.println("Matriz resultado: ");
            for (int i = 0; i < matrizAux.length; i++){

                System.out.println("");

                for (int j = 0; j < matrizAux[i].length; j++) {

                    matrizAux[i][j] = matriz1[i][j] + matriz2[i][j];

                    System.out.print(matrizAux[i][j]+" | ");

                }

            }



        }

        // MAIN
        public static void main(String[] args) {

            // Scanner sc = new Scanner(System.in);
            // int colum;
            
            // System.out.println("Cuantas columnas quieres añadir?");
            // colum = sc.nextInt();

            // numRandom(colum);

            matrizOriginal();

        }


    }
