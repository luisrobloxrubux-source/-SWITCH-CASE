import java.util.Scanner;

public class Logico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== OPERADORES LÓGICOS ===");
        System.out.print("Ingrese la operación (AND, OR, XOR): ");
        String op = sc.next();

        System.out.print("Ingrese el primer valor lógico (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Ingrese el segundo valor lógico (true/false): ");
        boolean b = sc.nextBoolean();

        switch (op.toUpperCase()) {

            case "AND":
                System.out.println("Resultado: " + (a && b));
                break;

            case "OR":
                System.out.println("Resultado: " + (a || b));
                break;

            case "XOR":
                System.out.println("Resultado: " + (a ^ b));
                break;

            default:
                System.out.println("Operación inválida");
        }

        sc.close();
    }
}