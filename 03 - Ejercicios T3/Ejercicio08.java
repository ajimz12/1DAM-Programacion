
package tema.pkg3.ejs;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;

public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
        System.out.println("Escriba una frase: ");
        String frase = new Scanner (System.in).nextLine();
        
        StringTokenizer tokens = new StringTokenizer(frase);

        boolean rep = true;
        
        while(rep){
                   
            System.out.println(tokens.nextToken());
            
            System.out.println("Numero total de palabras: "+tokens.countTokens());

            if(tokens.hasMoreTokens() == false){
                
                rep = false;
                
                
            }
                    
        }
        

        
    }

}
