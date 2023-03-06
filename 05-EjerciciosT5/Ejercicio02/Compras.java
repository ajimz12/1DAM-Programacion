
package tema5.ejercicio02;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.List;

public class Compras {
    
    //ATRIBUTOS
    
    private double presupuesto;
    private List<Double> precios;
    
    /**
     * Constructor con parámetros
     * 
     * @param presupuesto Representa el dinero disponible para hacer compras
     */
    
    public Compras(double p){
    
        this.presupuesto = p;
        
    }
    
    
    /**
     * Introducir o cambiar el presupuesto disponible
     * 
     * @param p Define el presupuesto que va a estar disponible
     */
    
    public void setPresupuesto(double p){
        
        p = this.presupuesto;
    }
    
    
    /**
     * Registra una compra y quita ese dinero al presupuesto
     * 
     * @param dinero El costo de el item que se va a comprar
     * @throws Exception El presupuesto es menor a la compra realizada
     */
    
    public void registrarCompra(double dinero) throws Exception{
    
        double resta = dinero - presupuesto;
        
        
        if(dinero > this.presupuesto){
            
            throw new Exception("El precio es mayor al presupuesto "
                    + "disponible, faltan " + resta + " euros");
            
        }else{
            
            this.presupuesto-=dinero;
        }
        
    }
        
    /**
     * Obtener presupuesto 
     * 
     * @return Presupuesto disponible para hacer compras
     */
    
    public double getPresupuesto(){
        
        return this.presupuesto;
    }
    
    
    

}
