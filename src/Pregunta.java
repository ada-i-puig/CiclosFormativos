
/**
 * Esta clase permite crear objetos de la clase Pregunta con un enunciado, 4 posibles respuestas y una respuesta válida
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Pregunta {

    private String enunciado;
    private String[] respuestas = new String[4];
    private int respuestaValida;
    
    /**
     * Crea un objeto de la clase Pregunta con un enunciado, 4 posibles respuestas y una respuesta válida.
     * Sólo crea el objeto si efectivamente se pasan como parámetro 4 posibles respuestas, si no da un mensaje de error.
     * @param enunciado que es el enunciado de la pregunta
     * @param respuestas que son las 4 posibles respuestas
     * @param respuestaValida que es la respuesta válida
     */
    public Pregunta(String enunciado, String[] respuestas, int respuestaValida) {
        if(respuestas.length == 4) {
            for(int i = 0; i < this.respuestas.length; i++){
                this.respuestas[i] = respuestas[i];
            }
            
            this.enunciado = enunciado;
            this.respuestaValida = respuestaValida;
        }
        else {
            System.out.println("Error: Número de respuestas erróneo");
        } 
    }

    /**
     * Devuelve el enunciado de la pregunta
     * @return el enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * Modifica el enunciado de la pregunta
     * @param enunciado el nuevo enunciado de la pregunta
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    /**
     * Devuelve las respuestas a la pregunta
     * @return las respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * Modifica las respuestas de la pregunta
     * @param respuestas las nuevas respuestas de la pregunta
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * Devuelve la respuesta válida a la pregunta
     * @return la respuesta válida
     */
    public int getRespuestaValida() {
        return respuestaValida;
    }

    /**
     * Modifica la respuesta válida de la pregunta
     * @param respuestaValida la nueva respuesta válida de la pregunta
     */
    public void setRespuestaValida(int respuestaValida) {
        this.respuestaValida = respuestaValida;
    }
}
