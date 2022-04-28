/**
 * Esta clase permite crear objetos de la clase Examen con una descripción y 30 preguntas
 * Esta clase también implementa métodos para elegir y ordenar las preguntas del examen y calificar el examen.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Examen {

    private String descripcion;
    private Pregunta[] preguntasExamen = new Pregunta[30];

    /**
     * Crea un objeto de la clase Examen con una descripción y 30 preguntas dadas.
     * Sólo crea el objeto si efectivamente se pasan como parámetro 30 preguntas.
     * @param descripcion que es la descripción del examen
     * @param peguntasExamen que son las 30 preguntas del examen
     */
    public Examen(String descripcion, Pregunta[] peguntasExamen) {
        if(peguntasExamen.length == 30) {
            for(int i = 0; i < this.preguntasExamen.length; i++){
                this.preguntasExamen[i] = preguntasExamen[i];
            }
            
            this.descripcion = descripcion;
        }
        else {
            System.out.println("Error: Número de preguntas erróneo");
        } 
    }

    /**
     * Devuelve la descripción del examen
     * @return la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción del examen
     * @param descripcion la nueva descripción del examen
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Devuelve las preguntas del examen
     * @return las preguntas del examen
     */
    public Pregunta[] getPreguntasExamen() {
        return preguntasExamen;
    }

    /**
     * Modifica las preguntas del examen
     * @param preguntasExamen las nuevas preguntas del examen
     */
    public void setPreguntasExamen(Pregunta[] preguntasExamen) {
        this.preguntasExamen = preguntasExamen;
    }
    
    /**
     * Calcula la puntuación que ha sacado un alumno en el examen
     */
    public void calificar() {
    }

    /**
     * Elige las preguntas del examen
     */
    public void elegirPreguntas() {
    }

    /**
     * Ordena aleatoriamente las preguntas del examen
     */
    public void ordenarPreguntas() {
    }
}
