
package tema.pkg3.ejs;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;

public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {

        boolean rep = true;

        while (rep){
            
            
            System.out.println("¿Eres mayor de edad (si/no)?");
            String edad = new Scanner (System.in).nextLine();
            
            if (edad.equals("si")){
                
                System.out.println("El usuario es mayor de edad");
                
                rep = false;
                
            }else if(edad.equals("no")){
                
                
                System.out.println("El usuario es menor de edad");
                
                rep = false;

                
            }else{
                
                System.out.println("No te entiendo");
                
                
            }
            
            
        }


    }

}
