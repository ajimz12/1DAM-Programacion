/*
 */
package mario3;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
import bpc.daw.mario.*;

public class Mario3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Seta seta= new Seta(200,200);
        seta.andarHacia(0,0);
        
        Mario mario= new Mario(600);
        mario.saltar();
        
        Ca�on ca�on= new Ca�on(500,500);
        ca�on.disparar(700, 500);
        
        Luigi luigi= new Luigi(700,500);
        
        Planta planta= new Planta(100,100);
        planta.comer(true);
        
        Planta planta2= new Planta(200,100);
        planta2.comer(true);
       
        
    }
    
}
