import java.util.Scanner;

public class CalculadoraAreaTerreno {

    // Método para calcular el área del rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular el área del triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Método para calcular el área total del terreno
    public static double calcularAreaTerreno(double A, double B, double C) {
        double areaRectangulo = calcularAreaRectangulo(B, C);
        double areaTriangulo = calcularAreaTriangulo(B, A - C);
        return areaRectangulo + areaTriangulo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la longitud A del terreno: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese la longitud B del terreno: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese la longitud C del terreno: ");
        double C = scanner.nextDouble();

        // Validar que A es mayor que C para formar un triángulo y un rectángulo válidos
        if (A <= C) {
            System.out.println("El valor de A debe ser mayor que el de C para formar un terreno válido.");
            return;
        }

        // Calcular el área total del terreno
        double areaTotal = calcularAreaTerreno(A, B, C);

        // Mostrar el área total del terreno
        System.out.printf("El área total del terreno es: %.2f unidades cuadradas.\n", areaTotal);
    }
}
