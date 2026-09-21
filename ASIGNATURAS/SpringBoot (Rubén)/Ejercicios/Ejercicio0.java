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


    public static void main(String[] args) {

        numerosImpares(5);

    }
}