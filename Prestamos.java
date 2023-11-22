import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La clase Prestamos representa un sistema de préstamo de libros.
 * Permite prestar libros premium y gratuitos, llevando un registro de los
 * libros prestados.
 */
public class Prestamos {
    private List<String> librosPrestados;
    private Libros libros;

    /**
     * Crea una instancia de Prestamos con la lista de libros disponibles.
     * 
     * @param libros la lista de libros disponibles
     */
    public Prestamos(Libros libros) {
        this.librosPrestados = new ArrayList<>();
        this.libros = libros;
    }

    /**
     * Crea una instancia de Prestamos a partir de un objeto Scanner.
     * 
     * @param scanner el objeto Scanner utilizado para la entrada de datos
     */
    public Prestamos(Scanner scanner) {
    }

    /**
     * Presta un libro premium por un número específico de días.
     * 
     * @param tituloLibro  el título del libro a prestar
     * @param diasPrestamo el número de días del préstamo
     */
    public void prestarLibroPremium(String tituloLibro, int diasPrestamo) {
        libros.mostrarLibrosDisponibles();
        if (diasPrestamo < 1 || diasPrestamo > 50) {
            System.out.println("El número de días del préstamo debe estar entre 1 y 50.");
        } else if (librosPrestados.size() >= 5) {
            System.out.println("Has alcanzado el límite de libros prestados.");
        } else if (!libros.getLibros().contains(tituloLibro)) {
            System.out.println("El libro solicitado no está disponible.");
        } else if (librosPrestados.contains(tituloLibro)) {
            System.out.println("El libro ya ha sido prestado.");
        } else {
            librosPrestados.add(tituloLibro);
            System.out.println("Has prestado el libro " + tituloLibro + " por " + diasPrestamo + " días. Ahora tienes "
                    + librosPrestados.size()
                    + " libros prestados.");
        }
    }

    /**
     * Presta un libro gratuito por un número específico de días.
     * 
     * @param tituloLibro  el título del libro a prestar
     * @param diasPrestamo el número de días del préstamo
     */
    public void prestarLibroGratuito(String tituloLibro, int diasPrestamo) {
        libros.mostrarLibrosDisponibles();
        if (diasPrestamo < 1 || diasPrestamo > 30) {
            System.out.println("El número de días del préstamo debe estar entre 1 y 30.");
        } else if (librosPrestados.size() >= 3) {
            System.out.println("Has alcanzado el límite de libros prestados.");
        } else if (!libros.getLibros().contains(tituloLibro)) {
            System.out.println("El libro solicitado no está disponible.");
        } else if (librosPrestados.contains(tituloLibro)) {
            System.out.println("El libro ya ha sido prestado.");
        } else {
            librosPrestados.add(tituloLibro);
            System.out.println("Has prestado el libro " + tituloLibro + " por " + diasPrestamo + " días. Ahora tienes "
                    + librosPrestados.size()
                    + " libros prestados.");
        }
    }

    /**
     * Obtiene la lista de libros prestados.
     * 
     * @return la lista de libros prestados
     */
    public List<String> getLibrosPrestados() {
        return librosPrestados;
    }
}
