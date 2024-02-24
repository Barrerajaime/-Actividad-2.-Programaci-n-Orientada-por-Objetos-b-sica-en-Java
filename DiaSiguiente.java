import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class DiaSiguiente {

    // Función para obtener el nombre del día siguiente
    public static String obtenerDiaSiguiente(String diaActual) {
        Map<String, String> diasSemana = new HashMap<>();
        diasSemana.put("lunes", "martes");
        diasSemana.put("martes", "miércoles");
        diasSemana.put("miércoles", "jueves");
        diasSemana.put("jueves", "viernes");
        diasSemana.put("viernes", "sábado");
        diasSemana.put("sábado", "domingo");
        diasSemana.put("domingo", "lunes");

        // Convertir el día actual a minúsculas para hacer la función no sensible a mayúsculas
        diaActual = diaActual.toLowerCase();

        // Verificar si el día actual es válido
        if (!diasSemana.containsKey(diaActual)) {
            throw new IllegalArgumentException("El nombre del día no es válido.");
        }

        return diasSemana.get(diaActual);
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un día de la semana: ");
        String diaActual = scanner.nextLine();

        try {
            String diaSiguiente = obtenerDiaSiguiente(diaActual);
            System.out.println("El día siguiente a " + diaActual + " es: " + diaSiguiente);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
