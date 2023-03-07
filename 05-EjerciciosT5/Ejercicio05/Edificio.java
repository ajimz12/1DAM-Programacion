
package tema5.ejercicio05;

/**
 *
 * @author Alvaro <alvarojimgil12@gmail.com>
 */
public class Edificio {
    
    private String direccion;
    private int numeroPlantas;

    /**
     * 
     * @param d direccion del edificio
     * @param np numero de plantas del edificio
     */
    public Edificio(String d, int np){

        this.direccion = d;
        this.numeroPlantas = np;

    }

    /**
     * Obtiene direccion del edificio
     * 
     * @return Direccion del edificio
     */
    public String getDireccion(){

        return this.direccion;
        
    }
    
    
    /**
     * Obtiene el numero de plantas del edificio
     * 
     * @return Numero de plantas del edificio
     */
    public int getNumeroPlantas(){
        
        return this.numeroPlantas;
        
    }

}
