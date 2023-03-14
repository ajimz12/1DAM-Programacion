
package tema5.ejercicio12;

import tema5.ejercicio11.*;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
public class Empleado {
    
    //ATRIBUTOS
    private String nombre;
    private double sueldo;
    private double dinero;
    
    /**
     * Constructor con par�metros
     * 
     * @param n Nombre de empleado
     * @param s Sueldo de empleado
     */
    public Empleado(String n, double s){
        
        this.nombre = n;
        this.sueldo = s;
        
    }
    
    /**
     * Obtiene sueldo de empleado
     * 
     * @return Sueldo de empleado
     */
    public double getSueldo(){
        
        return this.sueldo;
        
    }
    
    /**
     * Obtiene dinero de empleado
     * 
     * @return Dinero del empleado
     */
    public double getDinero(){
        
        return this.dinero;
    }
    
    /**
     * A�ade cantidad de dinero a la cuenta del empleado
     * 
     * @param cantidad Dinero a a�adir
     * @throws CabreoException En caso de que la cantidad sea menor al sueldo
     */
    public void cobrar(double cantidad) throws CabreoException{
        
        cantidad+=this.dinero;
        
        double resta = this.sueldo - cantidad;
               
        
        if(cantidad < this.sueldo){
           
            throw new CabreoException("Al empleado " + this.nombre + " no se le"
                    + " han pagado " + resta + " euros");
        }
        
    }
    

}
