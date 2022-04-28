
import java.util.ArrayList;

/**
 * Esta clase permite crear objetos de la clase Alumno con todos los atributos de la clase Persona más la nota media y los módulos matriculados.
 * Esta clase también implementa métodos para matricular y desmatricular a alumnos de los módulos, calcular su nota media
 * y emitir el certificado del alumno.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Alumno extends Persona {

    private double notaMedia;
    private ArrayList<Modulo> modulosMatriculados = new ArrayList<>();

    /**
     * Crea un objeto de la clase Alumno con un nombre, direccion, teléfono, alias, apellidos y email dados
     * @param nombre el nombre del alumno
     * @param direccion la direccion del alumno
     * @param telefono el telefono del alumno
     * @param alias el alias del alumno
     * @param apellidos los apellidos del alumno
     * @param email el correo del alumno
     */
    public Alumno(String nombre, String direccion, String telefono, String alias, String apellidos, String email) {
        super(nombre, direccion, telefono, alias, apellidos, email);
    }

    /**
     * Devuelve la nota media del alumno
     * @return la nota media
     */
    public double getNotaMedia() {
        return notaMedia;
    }
    
    /**
     * Permite matricular a un alumno a un módulo en concreto.
     * El módulo se añade a la lista de módulos del alumno
     */
    public void matricular() {
        
    }
    
    /**
     * Cuando un alumno o alumna finaliza el ciclo se emite un certificado de competencias a su nombre donde aparece 
     * la descripción de las competencias que forman el ciclo y la nota media obtenida. Si un alumno o alumna no termina 
     * de cursar el ciclo completo puede pedir un certificado que acredite las competencias que sí tenga adquiridas.
     */
    public void emitirCertificado() {
    }

    /**
     * Permite calcular la nota media obtenida por el alumno al terminar el ciclo 
     * @return la nota media
     */
    public double calcularNotaMedia() {

    }
    
    /**
     * Permite desmatricular a un alumno de un módulo en concreto.
     * El módulo se quita de la lista de módulos del alumno
     */
    public void desmatricular() {
    }
}
