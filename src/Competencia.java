
import java.util.ArrayList;

/**
 * Esta clase permite crear objetos de la clase Competencia con un nombre y descripción.
 * Esta clase también implementa métodos para añadir y quitar módulos de la competencia.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Competencia {

    private String descripcion;
    private String nombre;
    private ArrayList<Modulo> modulos = new ArrayList<>();

    /**
     * Crea un objeto de la clase Competencia con un nombre y descripción dadas
     * @param descripcion que es la descripción de la competencia
     * @param nombre que es el nombre de la competencia
     */
    public Competencia(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    /**
     * Devuelve la descripción de la competencia
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción de la competencia
     * @param descripcion la nueva descripción de la competencia
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el nombre de la competencia
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la competencia
     * @param nombre el nuevo nombre de la competencia
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Permite añadir módulos a la lista de módulos que componen la competencia
     */
    public void addModulo() {
    }

    /**
     * Permite quitar módulos de la lista de módulos que componen la competencia
     */
    public void quitarModulo() {
    }
}
