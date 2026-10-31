// FLORENCIA VICTORIA  - NRC 37712 - Fecha: 28-10-2026
// Convertir un tiempo total en segundos a horas, minutos y segundos.
import java.util.Scanner;

public class Lab1_E2_FLORENCIA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tiempo total en segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int minutosRestantes = totalSegundos % 3600;
        int minutos = minutosRestantes / 60;
        int segundos = minutosRestantes % 60;

        System.out.printf("%d s = %d h %d min %d s%n", totalSegundos, horas, minutos, segundos);

        sc.close();
    }
}