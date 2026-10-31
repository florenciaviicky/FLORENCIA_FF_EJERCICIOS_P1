public class Ejercicio6 {
    public static void main(String[] args) {
        int x = 4;

        x *= 3;   // x = 4 * 3 = 12
        x %= 5;   // x = 12 % 5 = 2
        x += x++; // x = 2 + 2 = 4 (x++ entrega 2 y luego incrementa, pero la asignación lo sobrescribe)

        System.out.println("El valor final de x es: " + x);
    }
}