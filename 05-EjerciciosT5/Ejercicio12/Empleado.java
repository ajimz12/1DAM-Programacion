
package tema5.ejercicio12;

import tema5.ejercicio11.*;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Empleado {
    
    //ATRIBUTOS
    private String nombre;
    private double sueldo;
    private double dinero;
    
    /**
     * Constructor con parámetros
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
     * Añade cantidad de dinero a la cuenta del empleado
     * 
     * @param cantidad Dinero a añadir
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
