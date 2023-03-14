
package tema5.ejercicio12;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class EmpleadoPrimable extends Empleado{
    
    //ATRIBUTOS
    private boolean primado = false;
    
    /**
     * Constructor con parametros
     * 
     * @param n Nombre de empleado
     * @param s Sueldo de empleado
     */
    public EmpleadoPrimable(String n, double s){
        
        super(n,s);
        
    }
    
    /**
     * Prima al empleado
     * 
     */
    public void primar(){
        
        this.primado = true;
        
    }
    
    /**
     * Obtiene si el empleado ha sido primado o no
     * 
     * @return estado de la prima del empleado
     */
    public boolean esPrimado(){
        
        return this.primado;
       
    }

}
