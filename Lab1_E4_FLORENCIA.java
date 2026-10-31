// FLORENCIA VICTORIA  - NRC 37712 - Fecha: 28-10-2026
// Generar factura con producto (con espacios), cantidad, precio, subtotal, IVA 15% y total.
import java.util.Scanner;
import java.util.Locale;

public class Lab1_E4_FLORENCIA {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        final double IVA = 0.15;

        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        double subtotal = cantidad * precioUnitario;
        double valorIva = subtotal * IVA;
        double total = subtotal + valorIva;

        System.out.println("\n--- FACTURA ---");
        System.out.println("Producto: " + producto);
        System.out.printf("%-12s %10.2f%n", "Subtotal", subtotal);
        System.out.printf("%-12s %10.2f%n", "IVA 15%", valorIva);
        System.out.printf("%-12s %10.2f%n", "TOTAL", total);

        sc.close();
    }
}