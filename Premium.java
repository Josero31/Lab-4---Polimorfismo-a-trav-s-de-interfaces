import java.util.Scanner;

/**
 * La clase Premium representa una membresía premium en un sistema.
 */
public class Premium {
    String nombre;

    /**
     * Crea una instancia de la clase Premium con el nombre especificado.
     * 
     * @param nombre el nombre de la membresía premium
     */
    public Premium(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Crea una instancia de la clase Premium con el nombre predeterminado.
     */
    public Premium() {
        this.nombre = "Membresia Premium";
    }

    /**
     * Obtiene el nombre de la membresía premium.
     * 
     * @return el nombre de la membresía premium
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la membresía premium.
     * 
     * @param nombre el nombre de la membresía premium
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre de la membresía premium a través de un objeto Scanner.
     * 
     * @param scanner el objeto Scanner utilizado para obtener el nombre
     */
    public static void getNombre(Scanner scanner) {
    }

}