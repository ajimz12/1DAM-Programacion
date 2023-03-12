
package tema5.ejercicio08;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class TrabajadorTecleante extends Trabajador{
    
    //ATRIBUTOS
    private int pulsacionesMinuto;
    protected Teclado teclado;
    
    /**
     * Constructor con parámetros
     * 
     * @param n Nombre de trabajador
     * @param s Sueldo de trabajador
     * @param ndni Numero del dni
     * @param ldni Letra del dni
     * @param ppm Pulsaciones por minuto al teclear
     */
    
    public TrabajadorTecleante(String n, int s, int ndni, char ldni, int ppm){
        
        super(n,s,ndni,ldni);
        this.pulsacionesMinuto = ppm;
        
    }

    /**
     *  
     * @param t 
     */
    
    public void setTeclado(Teclado t) {
        this.teclado = t;
    }

    public int getPulsacionesMinuto() {
        return pulsacionesMinuto;
    }

    public Teclado getTeclado() {
        return teclado;
    }
    
    

}
