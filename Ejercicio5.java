import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el promedio: ");
        double promedio = scanner.nextDouble();

        // Evalúa si la edad es <= 25 Y si el promedio es >= 8.5
        boolean puedePostular = (edad <= 25) && (promedio >= 8.5);

        System.out.println("¿Puede postular a la beca?: " + puedePostular);

        scanner.close();
    }
}