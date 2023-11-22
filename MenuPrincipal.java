
/**
 * La clase MenuPrincipal representa el menú principal de una aplicación.
 * Permite al usuario seleccionar diferentes opciones, como registrar un usuario,
 * iniciar sesión, cambiar contraseña o salir del programa.
 */
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Bienvenido al menú principal");
            System.out.println("1. Registro de usuario");
            System.out.println("2. Inicio de sesión");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    RegistroUsuario.registrarUsuario(scanner);
                    break;
                case 2:
                    RegistroUsuario.iniciarSesion(scanner);
                    break;
                case 3:
                    RegistroUsuario.cambiarPassword(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}
