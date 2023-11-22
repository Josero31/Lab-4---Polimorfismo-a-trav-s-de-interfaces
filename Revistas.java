import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Revistas que representa una lista de revistas.
 */
public class Revistas {

    private List<String> revistas;

    /**
     * Constructor de la clase Revistas.
     * Inicializa la lista de revistas con valores predeterminados.
     */
    public Revistas() {
        revistas = new ArrayList<>();
        revistas.add("Revista de la Universidad de Mexico");
        revistas.add("Revista de la Universidad de Guadalajara");
        revistas.add("Forbes Enero 2023");
        revistas.add("Revista de la Universidad de Colima");
        revistas.add("Revista de la Universidad de Michoacan");
        revistas.add("Revista de la Universidad de Puebla");
        revistas.add("Revista de la Universidad de Queretaro");
        revistas.add("Revista de la Universidad de Sonora");
        revistas.add("Revista de la Universidad de Sinaloa");
        revistas.add("Revista de la Universidad de Yucatan");
        revistas.add("Revista de la Universidad de Zacatecas");
    }

    /**
     * Escribe las revistas en un archivo CSV.
     */
    public void escribirRevistasCSV() {
        File csvFile = new File("revistas.csv");
        if (!csvFile.exists()) {
            try {
                csvFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error al crear el archivo CSV.");
                e.printStackTrace();
            }
        }

        try (PrintWriter writer = new PrintWriter(csvFile)) {
            for (String revista : revistas) {
                writer.println(revista);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo CSV.");
            e.printStackTrace();
        }
    }

    /**
     * Método principal que crea una instancia de Revistas y escribe las revistas en
     * un archivo CSV.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Revistas revistas = new Revistas();
        revistas.escribirRevistasCSV();
    }
}
