
/**
 * Esta clase permite crear objetos de la clase Persona con nombre, direccion, teléfono, alias, apellidos y email.
 * 
 * @author Ada Iglesias Pasamontes
 */
public class Persona {

    private String nombre;
    private String direccion;
    private String telefono;
    private String alias;
    private String apellidos;
    private String email;
    
    
    /**
     * Crea un objeto de la clase Persona con un nombre, direccion, teléfono, alias, apellidos y email dados
     * @param nombre el nombre de la persona
     * @param direccion la direccion de la persona
     * @param telefono el telefono de la persona
     * @param alias el alias de la persona
     * @param apellidos los apellidos de la persona
     * @param email el correo de la persona
     */
    public Persona(String nombre, String direccion, String telefono, String alias, String apellidos, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.alias = alias;
        this.apellidos = apellidos;
        this.email = email;
    }

    /**
     * Devuelve el nombre de la persona
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona
     * @param nombre el nombre al que se quiere cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la dirección de la persona
     * @return la direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección de la persona
     * @param direccion la dirección a la que se quiere cambiar
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el teléfono de la persona
     * @return el telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el teléfono de la persona
     * @param telefono el teléfono al que se quiere cambiar
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el alias de la persona
     * @return el alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Modifica el alias de la persona
     * @param alias el alias al que se quiere cambiar
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Devuelve los apellidos de la persona
     * @return los apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Modifica los apellidos de la persona
     * @param apellidos los apellidos a los que se quiere cambiar
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve el email de la persona
     * @return el email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica el email de la persona
     * @param email el email al que se quiere cambiar
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
