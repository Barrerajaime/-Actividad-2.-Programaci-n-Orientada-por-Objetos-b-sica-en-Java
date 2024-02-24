public class AlgebraicFunctionCalculator {

    // Método estático para calcular el valor de la función algebraica
    public static int calculateFunction(int x, int y) {
        return x*x + 2*x*y + y*y;
    }

    public static void main(String[] args) {
        
        int x = 3; 
        int y = 4;

        // Calculamos el resultado utilizando el método estático
        int result = calculateFunction(x, y);

        // Mostramos el resultado
        System.out.println("El valor de la función algebraica para x = " + x + " y y = " + y + " es: " + result);
    }
}
