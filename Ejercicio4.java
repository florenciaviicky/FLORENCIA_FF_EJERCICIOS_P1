import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int totalMinutos = scanner.nextInt();

        int horas = totalMinutos / 60;
        int minutosRestantes = totalMinutos % 60;

        System.out.println(totalMinutos + " -> " + horas + " h " + minutosRestantes + " min");

        scanner.close();
    }
}