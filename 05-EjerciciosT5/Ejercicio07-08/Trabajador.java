


package tema5.ejercicio08;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Trabajador {
    
    private String dni;
    private String nombre;
    protected int sueldo;
    
    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI){
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        
        this.dni = "" + numDNI + letraDNI;
        
    }

    public String getDNI() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }
    
    

}
