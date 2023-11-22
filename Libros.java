import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase Libros representa una colección de libros y proporciona métodos para
 * mostrar los libros disponibles
 * y escribir los libros en un archivo CSV.
 */
public class Libros {

    private List<String> libros;

    /**
     * Crea una instancia de la clase Libros y agrega algunos libros a la colección.
     */
    public Libros() {
        libros = new ArrayList<>();
        // Agregar nombres de libros
        libros.add("El Principito");
        libros.add("El Alquimista");
        libros.add("El Poder");
        libros.add("El Codigo Da Vinci");
        libros.add("Harry Potter y las Reliquias de la Muerte");
        libros.add("El diario de Ana Frank");
        libros.add("La Biblia(Reina Valera)");
        libros.add("La Divina Comedia");
        libros.add("Harry Potter y el Prisionero de Azkaban");
        libros.add("Harry Potter y el Caliz de Fuego");
    }

    /**
     * Muestra los libros disponibles en la colección.
     */
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (String libro : libros) {
            System.out.println(libro);
        }
    }

    /**
     * Escribe los libros de la colección en un archivo CSV llamado "libros.csv".
     * Si el archivo no existe, se crea uno nuevo.
     */
    public void escribirLibrosCSV() {
        File csvFile = new File("libros.csv");
        if (!csvFile.exists()) {
            try {
                csvFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error al crear el archivo CSV.");
                e.printStackTrace();
            }
        }

        try (PrintWriter writer = new PrintWriter(csvFile)) {
            for (String libro : libros) {
                writer.println(libro);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo CSV.");
            e.printStackTrace();
        }
    }

    /**
     * Método principal que crea una instancia de la clase Libros y escribe los
     * libros en un archivo CSV.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Libros libros = new Libros();
        libros.escribirLibrosCSV();
    }

    /**
     * Obtiene los libros de la colección.
     * 
     * @return los libros de la colección
     */
    public String getLibros() {
        return null;
    }
}
