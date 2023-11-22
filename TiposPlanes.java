import java.util.Scanner;

public class TiposPlanes {

    /**
     * Método principal que ejecuta el programa de selección de planes de
     * suscripción.
     * Permite al usuario seleccionar un plan de suscripción y realizar diferentes
     * acciones según la opción elegida.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Selecciona un plan de suscripción");
            System.out.println("1. Premium");
            System.out.println("2. Gratuito");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    Premium.getNombre(scanner);
                    break;
                case 2:
                    Gratuito.getNombre(scanner);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:

                    break;
            }
        } while (opcion != 4);
        scanner.close();
    }
}