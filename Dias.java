import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int d = sc.nextInt();

        switch (d) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Laborable");
                break;

            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;

            default:
                System.out.println("Día inválido");
        }

        sc.close();
    }
}