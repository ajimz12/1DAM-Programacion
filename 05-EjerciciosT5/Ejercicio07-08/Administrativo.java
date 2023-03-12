
package tema5.ejercicio08;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.Date;

public class Administrativo extends TrabajadorTecleante{
    
    Date d = new Date();
    
    /**
     * Constructor con parámetros
     * 
     * @param n Nombre de administrativo
     * @param s Sueldo de administrativo
     * @param ndni Numero del dni
     * @param ldni Letra del dni
     * @param ppm Pulsaciones por minuto al teclear
     */
    
    public Administrativo(String n, int s, int ndni, char ldni, int ppm){
        
        super(n,s,ndni,ldni,ppm);
    }
    
    /**
     * Escribe una cadena de texto con la fecha y hora actual
     * 
     * @param t Texto del informe
     */
    public void escribirInforme(String t){
        
        t = "" + d;
    }

}
