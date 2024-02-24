import java.util.Scanner;

public class GastosDePedro {

    // Función para calcular el gasto en arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;
    }

    // Función para calcular el gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();

     
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);

        
        double dineroRestante = sueldo - (gastoArriendo + gastoComida);

        // Mostrar los resultados
        System.out.printf("El gasto en arriendo es: %.2f unidades monetarias.\n", gastoArriendo);
        System.out.printf("El gasto en comida es: %.2f unidades monetarias.\n", gastoComida);
        System.out.printf("El dinero que le queda a Pedro después de pagar el arriendo y la comida es: %.2f unidades monetarias.\n", dineroRestante);
    }
}
