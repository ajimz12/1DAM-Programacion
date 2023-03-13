
package tema5.ejercicio11;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class CuerpoTecnico extends Empleado{
    
    //ATRIBUTOS
    private String puesto;
    
    public CuerpoTecnico(String n, double s, String p){
        
        super(n,s);
        this.puesto = p;
        
    }

    
    public String getPuesto(){
        
        return this.puesto;
    }
}
