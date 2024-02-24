import java.util.Scanner;

public class CalculadoraGeometrica {

    // Función para calcular la distancia entre dos puntos
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    // Función para calcular la pendiente de la recta que une dos puntos
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            throw new IllegalArgumentException("La pendiente es indefinida (división por cero).");
        }
        return (y2 - y1) / (x2 - x1);
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las coordenadas del primer punto
        System.out.print("Ingrese la coordenada x1 del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y1 del primer punto: ");
        double y1 = scanner.nextDouble();

        // Leer las coordenadas del segundo punto
        System.out.print("Ingrese la coordenada x2 del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y2 del segundo punto: ");
        double y2 = scanner.nextDouble();

        // Calcular y mostrar la distancia
        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.printf("La distancia entre los puntos es: %.2f unidades.\n", distancia);

        // Calcular y mostrar la pendiente
        try {
            double pendiente = calcularPendiente(x1, y1, x2, y2);
            System.out.printf("La pendiente de la recta que une los dos puntos es: %.2f.\n", pendiente);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
