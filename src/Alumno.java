
import java.util.ArrayList;

public class Alumno extends Persona {

    private double notaMedia;
    private ArrayList<Modulo> modulosMatriculados = new ArrayList<>();

    public Alumno(String nombre, String direccion, String alias, String apellidos, String email) {
        super(nombre, direccion, alias, apellidos, email);
    }
    

    
    public void matricular() {
        
    }
    
    /**
     * Cuando un alumno o alumna finaliza el ciclo se emite un certificado de competencias a su nombre donde aparece 
     * la descripción de las competencias que forman el ciclo y la nota media obtenida. Si un alumno o alumna no termina 
     * de cursar el ciclo completo puede pedir un certificado que acredite las competencias que sí tenga adquiridas.
     */
    public void emitirCertificado() {
    }

    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void desmatricular() {
    }
}
