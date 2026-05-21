import java.util.Scanner;

public class Roles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE ROLES ===");
        System.out.print("Ingrese el rol (ADMIN, USER, GUEST): ");

        String rol = sc.next();

        switch (rol.toUpperCase()) {

            case "ADMIN":
                System.out.println("Acceso total");
                break;

            case "USER":
                System.out.println("Acceso parcial");
                break;

            case "GUEST":
                System.out.println("Solo lectura");
                break;

            default:
                System.out.println("Rol desconocido");
        }

        sc.close();
    }
}