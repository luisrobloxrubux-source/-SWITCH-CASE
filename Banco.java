import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 1000.0;
        int op;

        do {
            System.out.println("\n--- MENÚ BANCO ---");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Ingrese monto a depositar: ");
                    double dep = sc.nextDouble();

                    if (dep <= 0) {
                        System.out.println("Monto inválido");
                    } else {
                        saldo += dep;
                        System.out.println("Depósito realizado");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese monto a retirar: ");
                    double ret = sc.nextDouble();

                    if (ret <= 0) {
                        System.out.println("Monto inválido");
                    } else if (ret > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= ret;
                        System.out.println("Retiro realizado");
                    }
                    break;

                case 3:
                    System.out.println("Saldo actual: S/ " + saldo);
                    break;

                case 4:
                    System.out.println("Gracias por usar el sistema");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 4);

        sc.close();
    }
}