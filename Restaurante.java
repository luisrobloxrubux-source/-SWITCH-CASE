import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENÚ DEL RESTAURANTE ===");
        System.out.println("1. Desayuno");
        System.out.println("2. Almuerzo");
        System.out.print("Seleccione una opción: ");

        int menu = sc.nextInt();

        switch (menu) {

            case 1:
                System.out.println("\n--- DESAYUNO ---");
                System.out.println("1. Café - 5");
                System.out.println("2. Pan - 3");
                System.out.print("Seleccione un producto: ");

                int sub = sc.nextInt();

                switch (sub) {
                    case 1:
                        System.out.println("Pedido: Café - Precio: 5");
                        break;

                    case 2:
                        System.out.println("Pedido: Pan - Precio: 3");
                        break;

                    default:
                        System.out.println("Opción de desayuno inválida");
                }
                break;

            case 2:
                System.out.println("\n--- ALMUERZO ---");
                System.out.println("1. Arroz con pollo - 12");
                System.out.print("Seleccione un producto: ");

                int sub2 = sc.nextInt();

                switch (sub2) {
                    case 1:
                        System.out.println("Pedido: Arroz con pollo - Precio: 12");
                        break;

                    default:
                        System.out.println("Opción de almuerzo inválida");
                }
                break;

            default:
                System.out.println("Menú inválido");
        }

        sc.close();
    }
}