import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ESTACIONAMIENTO ===");
        System.out.println("1. Moto  -> S/ 2 por hora");
        System.out.println("2. Auto  -> S/ 4 por hora");
        System.out.println("3. Camión -> S/ 6 por hora");

        System.out.print("Seleccione el tipo de vehículo: ");
        int tipo = sc.nextInt();

        System.out.print("Ingrese la cantidad de horas: ");
        int horas = sc.nextInt();

        double tarifa = 0;

        switch (tipo) {
            case 1:
                tarifa = 2;
                break;

            case 2:
                tarifa = 4;
                break;

            case 3:
                tarifa = 6;
                break;

            default:
                System.out.println("Tipo de vehículo inválido");
                sc.close();
                return;
        }

        double total = tarifa * horas;

        System.out.println("Total a pagar: S/ " + total);

        sc.close();
    }
}