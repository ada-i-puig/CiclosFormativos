/**
 * Esta clase permite crear objetos de la clase Tarea con una descripción. 
 * Esta clase también implementa un método para calificar la tarea.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Tarea {

    private String descripcion;

    /**
     * Crea un objeto de la clase Tarea con una descripción dada
     * @param descripcion que es la descripción de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve la descripción de la tarea
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción de la tarea
     * @param descripcion la nueva descripción de la tarea
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Califica la tarea
     */
    public void calificar() {
    }
}
