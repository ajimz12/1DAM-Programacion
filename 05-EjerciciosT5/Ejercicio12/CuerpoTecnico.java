
package tema5.ejercicio12;

import tema5.ejercicio11.*;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
public class CuerpoTecnico extends Empleado{
    
    //ATRIBUTOS
    private String puesto;
    
    /**
     * Constructor con par�metros
     * 
     * @param n Nombre de empleado
     * @param s Sueldo de empleado
     * @param p Puesto del empleado
     */
    public CuerpoTecnico(String n, double s, String p){
        
        super(n,s);
        this.puesto = p;
        
    }

    /**
     * Obtiene puesto del empleado
     * 
     * @return Puesto del empleado
     */
    public String getPuesto(){
        
        return this.puesto;
    }
}
