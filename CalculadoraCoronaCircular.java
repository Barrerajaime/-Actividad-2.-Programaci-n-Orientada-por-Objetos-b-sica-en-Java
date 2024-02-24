import java.util.Scanner;

public class CalculadoraCoronaCircular {

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    
    public static double calcularAreaCoronaCircular(double radioPequeno, double radioGrande) {
        double areaGrande = calcularAreaCirculo(radioGrande);
        double areaPequena = calcularAreaCirculo(radioPequeno);
        return areaGrande - areaPequena;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el valor del radio pequeño (r): ");
        double radioPequeno = scanner.nextDouble();

        System.out.print("Ingrese el valor del radio grande (R): ");
        double radioGrande = scanner.nextDouble();

        
        double areaCoronaCircular = calcularAreaCoronaCircular(radioPequeno, radioGrande);
        System.out.printf("El área de la corona circular es: %.2f unidades cuadradas.\n", areaCoronaCircular);
    }
}
