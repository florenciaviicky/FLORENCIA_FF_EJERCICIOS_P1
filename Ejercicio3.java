import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de 3 cifras: ");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        int decenas = (numero / 10) % 10;
        int unidades = numero % 10;

        System.out.println("Cifra de las centenas: " + centenas);
        System.out.println("Cifra de las decenas: " + decenas);
        System.out.println("Cifra de las unidades: " + unidades);

        scanner.close();
    }
}
