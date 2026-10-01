   import java.util.Scanner;

   public class Ejercicio2 {


        //      Ejercicio a:Crea una matriz con 5 filas y n columnas (Valor que debe pedirse al usuario). A
        //      continuación, rellénalo con números aleatorios entre 0 y 10. Para ello debes crear una
        //      función auxiliar que devuelva el número aleatorio generado y se haga la llamada desde la
        //      clase Main.

        public static int[][] numRandom(int valor) {

            int matriz[][] = new int[5][valor];

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


        // Ejercicio b) Crea 2 matrices de mxm y suma sus valores. Los resultados deben almacenarse
        // en otra matriz distinta. Los valores y la longitud, seran elegidos por el usuario. Finalmente,
        // muestra por pantalla las matrices originales y el resultado, para ello debes crear una función
        // auxiliar que muestre las matrices y se haga la llamada desde la clase Main.

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

        // Ejercicio c) Crea una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo
        // los de los bordes que deben ser 1. Muestra el resultado.


        public static void mostrarCuadro(){
            Scanner sc = new Scanner(System.in);

            int bordes = 1; 

            System.out.println("Cuantas filas quieres que tenga el cuadro?: ");
            int filas = sc.nextInt();

            System.out.println("Cuantas columnas quieres que tenga el cuadro?: ");
            int col = sc.nextInt();

            int[][]matriz = new int [filas][col];

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {

                    matriz[0][j] = bordes;
                    matriz[i][0] = bordes;
                    matriz[filas - 1][j] = bordes;
                    matriz[i][col - 1] = bordes;

                }

            }

            for (int i = 0; i < matriz.length; i++) {

                System.out.println();

                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("| ");

                    System.out.print(matriz[i][j]+ " ");

                }

                System.out.print("|");

            }

        }

        // Ejercicio d) Tabla de 1 dimensión: Pide 5 números que se introducirán ordenados de forma
        // creciente. Éstos se guardan en una tabla de tamaño 10. A continuación se pide un número N,
        // el cual debe insertarse en el lugar adecuado para que la tabla continúe ordenada.


        public static void tablaOrdenada() {
            Scanner sc = new Scanner(System.in);
            int[] tabla = new int[10];

            // 1. Pedir los 5 primeros números (vienen ordenados de menor a mayor)
            System.out.println("Introduce 5 números de forma creciente:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                tabla[i] = sc.nextInt();
            }

            // 2. Pedir el nuevo número N a insertar (una sola vez)
            System.out.print("\nIntroduce un nuevo número (N) a insertar: ");
            int newNum = sc.nextInt();

            // 3. Buscar la posición (índice) donde debe encajar el número
            int sitio = 0;
            while (sitio < 5 && tabla[sitio] < newNum) {
                sitio++;
            }

            // 4. Desplazar los elementos hacia la derecha para abrir hueco
            for (int i = 4; i >= sitio; i--) {
                tabla[i + 1] = tabla[i];
            }

            // 5. Insertar el número en el hueco que hemos liberado
            tabla[sitio] = newNum;

            // 6. Mostrar el resultado (ahora hay 6 números en la tabla)
            System.out.println("\nTabla resultante tras la inserción:");
            for (int i = 0; i < 6; i++) {
                System.out.print(tabla[i] + " ");
            }
            System.out.println();
        }

        // MAIN
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            // System.out.println("Cuantas columnas quieres añadir?");
            // int colum = sc.nextInt();
            // numRandom(colum);

            // matrizOriginal();

            mostrarCuadro();

            // tablaOrdenada();

        }


    }
