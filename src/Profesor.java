
import java.util.ArrayList;

/**
 * Esta clase permite crear objetos de la clase Profesor con todos los atributos de la clase Persona más el NRP y los módulos que imparte.
 * Esta clase también implementa métodos para añadir y quitar módulos nuevos.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Profesor extends Persona {

    private String nrp;
    private ArrayList<Modulo> modulosQueImparte = new ArrayList<>();

    
    /**
     * Crea un objeto de la clase Profesor con un nombre, direccion, teléfono, alias, apellidos, email y nrp dados
     * @param nombre el nombre del profesor
     * @param direccion la direccion del profesor
     * @param telefono el telefono del profesor
     * @param alias el alias del profesor
     * @param apellidos los apellidos del profesor
     * @param email el correo del profesor
     * @param nrp el NRP del profesor
     */
    public Profesor(String nombre, String direccion, String telefono, String alias, String apellidos, String email, String nrp) {
        super(nombre, direccion, telefono, alias, apellidos, email);
        this.nrp = nrp;
    }

    /**
     * Devuelve el NRP del profesor
     * @return el NRP
     */
    public String getNrp() {
        return nrp;
    }

    /**
     * Modifica el NRP del profesor
     * @param nrp el NRP nuevo
     */
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    
    
    /**
     * Permite añadir un módulo nuevo a la lista de módulos que imparte el profesor
     */
    public void addModulo() {
    }

    /**
     * Permite quitar un módulo de la lista de módulos que imparte el profesor
     */
    public void quitarModulo() {
    }
}
