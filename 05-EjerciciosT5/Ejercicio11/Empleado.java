
package tema5.ejercicio11;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Empleado {
    
    //ATRIBUTOS
    private String nombre;
    private double sueldo;
    private double dinero;
    
    
    public Empleado(String n, double s){
        
        this.nombre = n;
        this.sueldo = s;
        
    }
    
    public double getSueldo(){
        
        return this.sueldo;
        
    }
    
    public double getDinero(){
        
        return this.dinero;
    }
    
    public void cobrar(double cantidad) throws CabreoException{
        
        cantidad+=this.dinero;
        
        if(cantidad < this.sueldo){
           
            throw new CabreoException("La cantidad es menor al sueldo >:(");
        }
        
    }
    

}
