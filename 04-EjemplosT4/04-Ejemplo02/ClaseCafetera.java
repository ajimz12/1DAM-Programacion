
package clasecafetera;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import clasecafetera.cafetera.*;

public class ClaseCafetera {

    
    public static void main(String[] args) {


        cafetera c = new cafetera();
        
        System.out.println( c.getCantidadActual());
        System.out.println(c.getCapacidadMax());
        
        cafetera c2 = new cafetera(5000);
        
        System.out.println( c2.getCantidadActual());
        System.out.println(c2.getCapacidadMax());
        
        cafetera c3 = new cafetera (800,700);
            
        System.out.println( c3.getCantidadActual());
        System.out.println(c3.getCapacidadMax());
        
        cafetera c4 = new cafetera();
        
        c4.agregarCafe(100);
        
        System.out.println(c4.getCantidadActual());

        c4.agregarCafe(600);

        System.out.println(c4.getCantidadActual());

        
            
        }
        

    }


