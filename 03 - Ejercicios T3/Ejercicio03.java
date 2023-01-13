
package tema.pkg3.ejs;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

  import java.util.*;

public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {


        boolean repetir = true;
        
        while (repetir){
            
            int n =(int)(Math.random()*11+0);
            
            System.out.println(n);
            
            if(n == 10){
                
                repetir = false;
                
                
            }
            
            
            
        }
        

        
        
        

    }

}
