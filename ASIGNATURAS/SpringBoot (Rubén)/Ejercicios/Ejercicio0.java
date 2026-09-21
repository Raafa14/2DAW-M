import java.util.Scanner;

public class Ejercicio0 {

    
//          Ejercicio a) Función a la que se le pasan dos enteros y muestra todos los números
//          comprendidos entre ellos, ambos incluidos. (Ten en cuenta que el usuario puede poner
//          el valor más pequeño en el 1º número o en el 2º número).

    public static void numerosEnteros (int num1, int num2) {

                int menor = 0;
                int mayor = 0;

                if (num1 <= num2) {

                    menor = num1;
                    mayor = num2;

                } else if (num2 <= num1) {

                    menor = num2;
                    mayor = num1;
                
                };

                for (int i = menor; i <= mayor; i++) {
                    System.out.println(i);
                };
            };

    public static void numerosImpares (int num) {

                int suma = 0;

                for (int i = 1; i <= num; i++) {

                    int impar = 2 * i - 1;
                    suma += impar;

                }

                System.out.println(suma);

            };

    // El cálculo del círculo se realiza íntegramente dentro de la función
    public static double calcularAreaCirculo(double radio) {
        double area = Math.PI * (radio * radio);
        return area;
    }

    // El cálculo del triángulo se realiza íntegramente dentro de la función
    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2.0;
        return area;
    }

    // El cálculo del cuadrado se realiza íntegramente dentro de la función
    public static double calcularAreaCuadrado(double lado) {
        double area = lado * lado;
        return area;
    }


    public static void main(String[] args) {

       // numerosImpares(5);

        Scanner scanner = new Scanner(System.in);

        // Pregunta inicial de selección
        System.out.println("--- CÁLCULO DE ÁREAS ---");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Cuadrado");
        System.out.print("Elige una figura (1-3): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Solo preguntas en el main
                System.out.print("Introduce el radio: ");
                double radio = scanner.nextDouble();

                // Llamada a la función que calcula
                double resCirculo = calcularAreaCirculo(radio);
                System.out.printf("El área del círculo es: %.2f%n", resCirculo);
                break;

            case 2:
                // Solo preguntas en el main
                System.out.print("Introduce la base: ");
                double base = scanner.nextDouble();
                System.out.print("Introduce la altura: ");
                double altura = scanner.nextDouble();

                // Llamada a la función que calcula
                double resTriangulo = calcularAreaTriangulo(base, altura);
                System.out.printf("El área del triángulo es: %.2f%n", resTriangulo);
                break;

            case 3:
                // Solo preguntas en el main
                System.out.print("Introduce el lado: ");
                double lado = scanner.nextDouble();

                // Llamada a la función que calcula
                double resCuadrado = calcularAreaCuadrado(lado);
                System.out.printf("El área del cuadrado es: %.2f%n", resCuadrado);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

    }
}