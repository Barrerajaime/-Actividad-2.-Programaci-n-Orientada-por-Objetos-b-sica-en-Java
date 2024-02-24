import java.util.Scanner;

public class CalculadoraDeBusesParaPaseo {

    // Método para calcular el número de buses necesarios
    public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        int totalSillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;
        int busesNecesarios = totalSillasNecesarias / sillasPorBus;

        // Si hay un residuo en la división, necesitamos un bus adicional
        if (totalSillasNecesarias % sillasPorBus != 0) {
            busesNecesarios++;
        }

        return busesNecesarios;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.println("Ingrese el número de sillas disponibles en un bus:");
        int sillasPorBus = scanner.nextInt();

        System.out.println("Ingrese el número de estudiantes gordos:");
        int estudiantesGordos = scanner.nextInt();

        System.out.println("Ingrese el número de estudiantes flacos:");
        int estudiantesFlacos = scanner.nextInt();

        // Calcular y mostrar el número de buses necesarios
        int busesNecesarios = calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        System.out.println("El número de buses necesarios para el paseo es: " + busesNecesarios);
    }
}
