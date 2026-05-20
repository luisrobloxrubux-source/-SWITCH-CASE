import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CONVERSOR ===");
        System.out.println("1. Metros a Kilómetros");
        System.out.println("2. Kilómetros a Metros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("4. Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");

        int op = sc.nextInt();

        System.out.print("Ingrese el valor: ");
        double v = sc.nextDouble();

        switch (op) {

            case 1:
                System.out.println(v + " m = " + (v / 1000) + " km");
                break;

            case 2:
                System.out.println(v + " km = " + (v * 1000) + " m");
                break;

            case 3:
                System.out.println(v + " °C = " + ((v * 9 / 5) + 32) + " °F");
                break;

            case 4:
                System.out.println(v + " °F = " + ((v - 32) * 5 / 9) + " °C");
                break;

            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }
}