
package tema5.ejercicio08;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class TrabajadorTecleante extends Trabajador{
    
    private int pulsacionesMinuto;
    protected Teclado teclado;
    
    public TrabajadorTecleante(String n, int s, int ndni, char ldni, int ppm){
        
        super(n,s,ndni,ldni);
        this.pulsacionesMinuto = ppm;
        
    }

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
