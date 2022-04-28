
import java.util.ArrayList;

/**
 * Esta clase permite crear objetos de la clase Modulo con un nombre, contenido, horas, alumnos matriculados, profesores,
 * tarea y examen.
 * Esta clase también implementa métodos para matricular y desmatricular alumnos, contratar y dar de baja a profesores,
 * y evaluar las tareas y examenes de los alumnos.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Modulo {

    private String nombre;
    private String contenido;
    private int horas;
    private ArrayList<Alumno> alumnado = new ArrayList<>();
    private ArrayList<Profesor> claustro = new ArrayList<>();
    private Tarea pruebaTarea;
    private Examen pruebaExamen;

    /**
     * Crea un objeto de la clase Modulo con un nombre, contenido, horas, tarea y examen dados.
     * @param nombre que es el nombre del módulo
     * @param contenido que es el contenido del módulo
     * @param horas que son las horas que dura el módulo
     * @param pruebaTarea que es la tarea del módulo
     * @param pruebaExamen que es el examen del módulo
     */
    public Modulo(String nombre, String contenido, int horas, Tarea pruebaTarea, Examen pruebaExamen){
        this.nombre = nombre;
        this.contenido = contenido;
        this.horas = horas;
        this.pruebaTarea = pruebaTarea;
        this.pruebaExamen = pruebaExamen;
    }

    /**
     * Devuelve el nombre del módulo
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del módulo
     * @param nombre el nuevo nombre del módulo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el contenido del módulo
     * @return el contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Modifica el contenido del módulo
     * @param contenido el nuevo contenido del módulo
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Devuelve las horas que dura el módulo
     * @return las horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Modifica las horas del módulo
     * @param horas las horas a las que se quiere actualizar el módulo
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Devuelve la tarea del módulo
     * @return la tarea
     */
    public Tarea getPruebaTarea() {
        return pruebaTarea;
    }

    /**
     * Modifica la tarea del módulo
     * @param pruebaTarea la nueva tarea del módulo
     */
    public void setPruebaTarea(Tarea pruebaTarea) {
        this.pruebaTarea = pruebaTarea;
    }

    /**
     * Devuelve el examen del módulo
     * @return the pruebaExamen
     */
    public Examen getPruebaExamen() {
        return pruebaExamen;
    }

    /**
     * Modifica el examen del módulo
     * @param pruebaExamen el nuevo examen del módulo
     */
    public void setPruebaExamen(Examen pruebaExamen) {
        this.pruebaExamen = pruebaExamen;
    }
    
    /**
     * Permite matricular a un alumno en un módulo en concreto
     */
    public void matricularAlumno() {
    }

    /**
     * Permite contratar a un nuevo profesor que imparta el módulo
     */
    public void contratarProfesor() {
    }

    /**
     * Evalúa el examen y la tarea del módulo de un alumno
     */
    public void evaluarAlumno() {
    }

    /**
     * Permite desmatricular a un alumno de un módulo en concreto
     */
    public void desmatricularAlumno() {
    }

    /**
     * Permite eliminar a un profesor de la lista de profesores del módulo
     */
    public void despedirProfesor() {
    }
}
