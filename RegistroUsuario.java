
/**
 * La clase RegistroUsuario se utiliza para registrar usuarios, iniciar sesión y cambiar contraseñas.
 * Permite interactuar con un archivo CSV para almacenar y recuperar información de usuarios.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class RegistroUsuario {

  public static void registrarUsuario(Scanner scanner) {
    System.out.print("Ingrese un nombre de usuario: ");
    String username = scanner.nextLine();

    System.out.print("Ingrese una contraseña: ");
    String password = scanner.nextLine();

    try (FileWriter writer = new FileWriter("usuarios.csv", true)) {
      writer.append(username);
      writer.append(",");
      writer.append(password);
      writer.append("\n");
      writer.flush();
      System.out.println("Usuario registrado exitosamente.");
    } catch (IOException e) {
      System.out.println("Error al registrar usuario.");
      e.printStackTrace();
    }
  }

  public static boolean iniciarSesion(Scanner scanner) {
    System.out.print("Ingrese su nombre de usuario: ");
    String username = scanner.nextLine();

    System.out.print("Ingrese su contraseña: ");
    String password = scanner.nextLine();

    try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.csv"))) {
      String linea;
      while ((linea = reader.readLine()) != null) {
        String[] partes = linea.split(",");
        if (partes.length == 2 && partes[0].equals(username) && partes[1].equals(password)) {
          // Inicio de sesión exitoso, mostrar menú
          int opcionSesion;
          do {
            System.out.println("Bienvenido " + username);
            System.out.println("1. Crea tu tipo de plan");
            System.out.println("2. Opción 2");
            System.out.println("3. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            opcionSesion = scanner.nextInt();
            scanner.nextLine(); // consume el carácter de nueva línea
            switch (opcionSesion) {
              case 1:
                System.out.println("Opción 1 seleccionada");
                break;
              case 2:
                System.out.println("Opción 2 seleccionada");
                break;
              case 3:
                System.out.println("Cerrando sesión...");
                break;
              default:
                System.out.println("Opción inválida");
                break;
            }
          } while (opcionSesion != 3);
          return true;
        }
      }
    } catch (IOException e) {
      System.out.println("Error al iniciar sesión.");
      e.printStackTrace();
    }

    return false;
  }

  public static void cambiarPassword(Scanner scanner) {
    System.out.print("Ingrese su nombre de usuario: ");
    String username = scanner.nextLine();

    System.out.print("Ingrese su nueva contraseña: ");
    String newPassword = scanner.nextLine();

    List<String> lines = new ArrayList<>();
    boolean userFound = false;

    try (BufferedReader reader = new BufferedReader(new FileReader("usuarios.csv"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",");
        if (parts.length == 2 && parts[0].equals(username)) {
          // Usuario encontrado, cambiar contraseña
          lines.add(username + "," + newPassword);
          userFound = true;
        } else {
          // Mantener la línea original
          lines.add(line);
        }
      }
    } catch (IOException e) {
      System.out.println("Error al cambiar la contraseña.");
      e.printStackTrace();
    }

    if (!userFound) {
      System.out.println("Usuario no encontrado.");
      return;
    }

    // Escribir las líneas de nuevo en el archivo
    try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.csv"))) {
      for (String line : lines) {
        writer.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error al cambiar la contraseña.");
      e.printStackTrace();
    }

    System.out.println("Contraseña cambiada exitosamente.");
  }

}
