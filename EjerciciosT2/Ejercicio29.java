
package ejercicio29;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import bpc.daw.objetos.*;


public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            
            System.out.println("Escriba un numero: ");
            int num = new Scanner(System.in).nextInt();
        }catch(Exception e){
            
            System.out.println("No se ha escrito un numero");
            
        }
        
        
        
   
        
        Caja c = null;
        
        try{
            
            String m = c.getMensaje();
            System.out.println(m.length());
            
            
        }catch(NullPointerException e){
            
            System.out.println("No es posible leer la caja");
        }

        

    }

}
