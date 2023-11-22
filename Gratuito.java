import java.util.Scanner;

/**
 * La clase Gratuito representa una membresía gratuita.
 */
public class Gratuito {
    String nombre;

    /**
     * Crea una instancia de la clase Gratuito con el nombre especificado.
     * 
     * @param nombre el nombre de la membresía gratuita
     */
    public Gratuito(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Crea una instancia de la clase Gratuito con el nombre predeterminado
     * "Membresia Gratuita".
     */
    public Gratuito() {
        this.nombre = "Membresia Gratuita";
    }

    /**
     * Obtiene el nombre de la membresía gratuita.
     * 
     * @return el nombre de la membresía gratuita
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la membresía gratuita.
     * 
     * @param nombre el nuevo nombre de la membresía gratuita
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la membresía gratuita a través de un objeto Scanner.
     * 
     * @param scanner el objeto Scanner utilizado para obtener el nombre
     */
    public static void getNombre(Scanner scanner) {
    }
}