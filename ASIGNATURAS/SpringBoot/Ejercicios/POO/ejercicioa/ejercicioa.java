public class ejercicioa {
    public static void main(String[] args) {

        cuenta c1 = new cuenta("Carlos");
        cuenta c2 = new cuenta("Laura", 150.0);

        // Ingresar dinero
        c1.ingresar(200.0);
        c1.ingresar(-50.0); // No hace nada (negativo)

        // Retirar dinero
        c2.retirar(50.0); // Quedan 100.0
        c2.retirar(200.0); // Intenta retirar más de lo disponible -> pasa a ser 0.0

        c1.retirar(50);

        System.out.println(c1);
        System.out.println(c2);
    }
}