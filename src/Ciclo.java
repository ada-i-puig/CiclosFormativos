
import java.util.ArrayList;

/**
 * Esta clase permite crear objetos de la clase Ciclo con un nombre, descripción, horas, año y lista de competencias.
 * Esta clase también implementa métodos para añadir y quitarcompetencias nuevas.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Ciclo {

    private String nombre;
    private String descripcion;
    private int horas;
    private int anyo;
    private ArrayList<Competencia> competenciasCiclo = new ArrayList<>();

    /**
     * Crea un objeto de la clase Ciclo con un nombre, descripción, horas y año dado
     * @param nombre que es el nombre del ciclo
     * @param descripcion que es la descripción del ciclo
     * @param horas que son las horas que dura el ciclo
     * @param anyo que es el año en el que se imparte el ciclo
     */ 
    public Ciclo(String nombre, String descripcion, int horas, int anyo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.anyo = anyo;
    }

    /**
     * Devuelve el nombre del ciclo
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del ciclo
     * @param nombre el nombre nuevo del ciclo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la descripción del ciclo
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción del ciclo
     * @param descripcion la descripción nueva del ciclo
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve las horas del ciclo
     * @return las horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Modifica las horas del ciclo
     * @param horas las horas nuevas del ciclo
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Devuelve el año del ciclo
     * @return el año
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * Modifica el año del ciclo
     * @param anyo el año nuevo del ciclo
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    /**
     * Permite añadir competencias a la lista de competencias del ciclo
     */
    public void addCompetencia() {
    }

    /**
     * Permite quitar competencias de la lista de competencias del ciclo
     */
    public void quitarCompetencia() {
    }
}
