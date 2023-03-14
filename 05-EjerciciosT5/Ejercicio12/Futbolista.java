
package tema5.ejercicio12;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Futbolista extends EmpleadoPrimable{
    
    //ATRIBUTOS
    private int dorsal;
    
    /**
     * Constructor con parametros
     * 
     * @param n Nombre de futbolista
     * @param s Sueldo de futbolista
     * @param d Dorsal de futbolista
     */
    public Futbolista(String n, double s, int d){
        
        super(n,s);
        
        this.dorsal = d;
    }

}
