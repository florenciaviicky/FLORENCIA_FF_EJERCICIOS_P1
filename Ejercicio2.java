import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // El operador % obtiene el residuo de la división entre 2
        boolean esPar = (numero % 2 == 0);

        System.out.println("¿El número es par?: " + esPar);

        scanner.close();
    }
}
