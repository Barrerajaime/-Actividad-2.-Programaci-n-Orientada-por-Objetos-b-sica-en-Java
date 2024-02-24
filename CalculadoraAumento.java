import java.util.Scanner;

public class CalculadoraAumento {

    // Función para calcular el aumento del sueldo
    public static double calcularAumento(double sueldoActual) {
        if (sueldoActual <= 800000) {
            return sueldoActual * 0.10; // Aumento del 10%
        } else if (sueldoActual <= 1200000) {
            return sueldoActual * 0.08; // Aumento del 8%
        } else {
            return sueldoActual * 0.05; // Aumento del 5%
        }
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el salario actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        double aumento = calcularAumento(sueldoActual);
        double nuevoSalario = sueldoActual + aumento;

        System.out.printf("El valor del aumento es: $%.2f\n", aumento);
        System.out.printf("El nuevo salario del empleado es: $%.2f\n", nuevoSalario);
    }
}
