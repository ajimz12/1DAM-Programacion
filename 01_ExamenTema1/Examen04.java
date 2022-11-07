
package examen04;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Examen04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int edad1;
        int edad2;

        System.out.println("Introduce tu edad: ");
            edad1 = new Scanner (System.in).nextInt();
        
        System.out.println("Introduce tu edad: ");
            edad2 = new Scanner (System.in).nextInt();
            
            
        boolean mayoria1 = (edad1 >= 18);
        boolean mayoria2 = (edad2 >= 18);
       
        System.out.println("La primera persona es mayor de edad: "+mayoria1);
        System.out.println("La segunda persona es mayor de edad: "+mayoria2);
      
       
            
         boolean masmayor = edad1 > edad2;
        System.out.println("La primera persona es mayor que la segunda? "+masmayor);
        
        
           
       
        
    }
    
}
