import java.util.Scanner;

public class LongitudEscalera {

    // Método para calcular la longitud de la escalera
    public static double calcularLongitudEscalera(double altura, double anguloGrados) {
        
        double anguloRadianes = Math.toRadians(anguloGrados);
        
       
        double longitud = altura / Math.sin(anguloRadianes);
        
        return longitud;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la altura de la escalera (x): ");
        double altura = scanner.nextDouble();

        System.out.print("Ingrese el ángulo de inclinación de la escalera (α) en grados: ");
        double angulo = scanner.nextDouble();

        
        double longitud = calcularLongitudEscalera(altura, angulo);

       
        System.out.printf("La longitud de la escalera es: %.2f unidades\n", longitud);
    }
}
