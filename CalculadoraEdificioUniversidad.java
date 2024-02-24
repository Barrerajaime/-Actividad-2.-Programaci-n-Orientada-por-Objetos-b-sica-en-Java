import java.util.Scanner;

public class CalculadoraEdificioUniversidad {

    // Función para calcular el número total de salones en el edificio
    public static int calcularNumeroDeSalones(int numeroEstudiantes, int capacidadSalon) {
        // Utilizamos la función techo para asegurarnos de que tenemos suficientes salones
        // incluso si el número resultante de estudiantes por salón no es un número entero.
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Función para calcular el número de pisos del edificio
    public static int calcularNumeroDePisos(int numeroSalones, int salonesPorPiso) {
        // Al igual que antes, usamos la función techo para asegurarnos de tener suficientes pisos
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número total de estudiantes de la universidad
        System.out.print("Ingrese el número total de estudiantes en la universidad: ");
        int numeroEstudiantes = scanner.nextInt();

        // Leer la capacidad de cada salón
        System.out.print("Ingrese la capacidad de estudiantes por salón: ");
        int capacidadSalon = scanner.nextInt();

        // Leer el número de salones que tendrá cada piso
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número total de salones necesarios
        int numeroSalones = calcularNumeroDeSalones(numeroEstudiantes, capacidadSalon);

        // Calcular el número total de pisos necesarios
        int numeroPisos = calcularNumeroDePisos(numeroSalones, salonesPorPiso);

        // Imprimir resultados
        System.out.println("El número total de salones necesarios es: " + numeroSalones);
        System.out.println("El número total de pisos necesarios es: " + numeroPisos);
    }
}
