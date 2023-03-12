


package tema5.ejercicio08;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Trabajador {
    
    //ATRIBUTOS
    private String dni;
    private String nombre;
    protected int sueldo;
    
   /**
     * Constructor con parámetros
     * 
     * @param n Nombre de trabajador
     * @param s Sueldo de trabajador
     * @param ndni Numero del dni
     * @param ldni Letra del dni
     * @param ppm Pulsaciones por minuto al teclear
     */
    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI){
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        
        this.dni = "" + numDNI + letraDNI;
        
    }

    /**
     * Obtiene DNI completo
     * 
     * @return DNI de trbajador
     */
    public String getDNI() {
        return dni;
    }

    /**
     * Obtiene nombre de trabajador
     * 
     * @return Nombre de trabajador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene sueldo de trabajador
     * 
     * @return Sueldo de trabajador
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Obtener informacion del trabajador
     * 
     * @return Datos del trabajador
     */
    @Override
    public String toString() {
        
        return "Trabajador: "
          + "" + " | DNI: " + dni + " | Nombre: " + nombre + " | Sueldo: " + sueldo;
    }
    
    
    
    

}
