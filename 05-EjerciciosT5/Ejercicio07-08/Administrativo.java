
package tema5.ejercicio08;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.Date;

public class Administrativo extends TrabajadorTecleante{
    
    Date d = new Date();
    
    public Administrativo(String n, int s, int ndni, char ldni, int ppm){
        
        super(n,s,ndni,ldni,ppm);
    }
    
    public void escribirInforme(String t){
        
        t = "" + d;
    }

}
