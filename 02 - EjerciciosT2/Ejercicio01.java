/*
 */
package mario1;

import bpc.daw.mario.*;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Mario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Mario m= new Mario(100);
        Mario m2= new Mario(640,320);
        Seta s= new Seta(0,0);
        Cañon c= new Cañon(100,320);
        Planta p= new Planta(400,500);
        Planta p2= new Planta(450,500);
        Planta p3= new Planta(500,500);
        Luigi l= new Luigi(200);
        Mario m3= new Mario(l,50);
        
        
    }
    
}
