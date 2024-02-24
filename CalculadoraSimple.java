import java.util.Scanner;

public class CalculadoraSimple {

    // Función para calcular el resultado de la operación aritmética
    public static double calcularOperacion(int numero1, int numero2, String operador) {
        switch (operador) {
            case "+":
                return numero1 + numero2;
            case "-":
                return numero1 - numero2;
            case "*":
                return numero1 * numero2;
            case "/":
                if (numero2 == 0) {
                    throw new IllegalArgumentException("No se puede dividir por cero.");
                }
                return (double) numero1 / numero2;
            case "%":
                return numero1 % numero2;
            case "**":
                return Math.pow(numero1, numero2);
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los números y el operador del usuario
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.print("Ingrese la operación (+, -, *, /, %, **): ");
        String operador = scanner.next();

        // Calcular y mostrar el resultado
        try {
            double resultado = calcularOperacion(numero1, numero2, operador);
            System.out.printf("El resultado de la operación es: %.2f\n", resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al calcular: " + e.getMessage());
        }
    }
}
