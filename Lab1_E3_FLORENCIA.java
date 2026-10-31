// FLORENCIA VICTORIA - NRC 37712 - Fecha: 28-10-2026
// Leer un entero de 4 cifras, mostrar suma de cifras, invertido y si es par.
import java.util.Scanner;

public class Lab1_E3_FLORENCIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero de 4 cifras: ");
        int num = sc.nextInt();

        int millar = num / 1000;
        int centena = (num / 100) % 10;
        int decena = (num / 10) % 10;
        int unidad = num % 10;

        int suma = millar + centena + decena + unidad;
        int invertido = (unidad * 1000) + (decena * 100) + (centena * 10) + millar;
        boolean esPar = (num % 2 == 0);

        System.out.println("Suma de cifras: " + suma);
        System.out.println("Invertido: " + invertido);
        System.out.println("Es par: " + esPar);

        sc.close();
    }
}