import java.util.Scanner;

public class CalculadoraTerreno {

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función para calcular la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    // Función para calcular el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    
    public static double calcularPerimetroTerreno(double A, double B, double C) {
        double hipotenusa = calcularHipotenusa(A - C, B);
        return A + B + C + hipotenusa;
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la longitud del lado A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado B: ");
        double B = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado C: ");
        double C = scanner.nextDouble();

        // Calcular el área del terreno
        double areaRectangulo = calcularAreaRectangulo(B, C);
        double areaTriangulo = calcularAreaTriangulo(A - C, B);
        double areaTotal = areaRectangulo + areaTriangulo;

        // Calcular el perímetro del terreno
        double perimetro = calcularPerimetroTerreno(A, B, C);

        // Mostrar resultados
        System.out.printf("El área total del terreno es: %.2f unidades cuadradas.\n", areaTotal);
        System.out.printf("El perímetro del terreno es: %.2f unidades.\n", perimetro);
    }
}
