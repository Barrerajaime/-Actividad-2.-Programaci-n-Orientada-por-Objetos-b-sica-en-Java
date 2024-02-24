import java.util.Scanner;

public class NumeroARomano {

    // Función para obtener la cifra de las decenas
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para obtener la cifra de las unidades
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función para convertir un dígito a su equivalente en romano
    public static String convertirADigitoRomano(int numero) {
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return romanos[numero];
    }

    // Función para convertir un dígito a su equivalente en decenas romanas
    public static String convertirADecenasRomanas(int numero) {
        String[] romanosDecenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        return romanosDecenas[numero];
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero <= 0 || numero >= 100) {
            System.out.println("Error: El número debe tener menos de 3 cifras y ser positivo.");
        } else {
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);

            String romano = convertirADecenasRomanas(decenas) + convertirADigitoRomano(unidades);
            System.out.println("El número " + numero + " en romano es: " + romano);
        }
    }
}
