// FLORENCIA VICTORIA  - NRC 37712 - Fecha: 28-10-2026
//Leer temperatura en Celsius y mostrar equivalente en Fahrenheit y Kelvin con formato de tabla.


import java.util.Scanner;
import java.util.Locale;

public class Lab1_E1_FLORENCIA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("\n----------------------------------");
        System.out.printf("%-12s %10.2f%n", "Celsius", celsius);
        System.out.printf("%-12s %10.2f%n", "Fahrenheit", fahrenheit);
        System.out.printf("%-12s %10.2f%n", "Kelvin", kelvin);
        System.out.println("----------------------------------");

        sc.close();
    }
}