
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.*;


public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Caja c = new Caja ("Hola buenas");
        
        c.abrirCaja();
        
        String m = c.getMensaje();
        
        System.out.println(m);
  
        c.cambiarMensaje("holahola");
        
        String m2 = c.getMensaje();
        
        System.out.println(m2);


    }

}
