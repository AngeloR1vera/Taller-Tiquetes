import java.util.Scanner;

public class Tiquete {

    public static void main(String[] args) {
        // Precio base del tiquete
        double precioBase = 1000000.0;
        double precioFinal = 0.0;

        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad de Ana
        System.out.print("Ingresa la edad de Ana: ");
        int edad = scanner.nextInt();

        // Determinar el precio del tiquete según la edad
        if (edad < 2) {
            System.out.println("Prohibido viajar");
        } else if (edad >= 2 && edad < 5) {
            precioFinal = 0.0; // Gratis
            System.out.println("El precio del tiquete es: Gratis");
        } else if (edad >= 5 && edad < 11) {
            precioFinal = precioBase / 2; // 1/2 precio
            System.out.println("El precio del tiquete es: " + precioFinal);
        } else if (edad >= 11 && edad < 15) {
            precioFinal = precioBase * 3 / 4; // 3/4 precio
            System.out.println("El precio del tiquete es: " + precioFinal);
        } else if (edad >= 15) {
            precioFinal = precioBase; // Precio normal
            System.out.println("El precio del tiquete es: " + precioFinal);
        }

        // Cerrar el escáner
        scanner.close();
    }
}
