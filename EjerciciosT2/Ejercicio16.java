/*
 */
package ejercicio16t2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

    import java.util.Scanner;


public class Ejercicio16t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce texto 1: ");
        String t1 = new Scanner (System.in).nextLine();
        
        System.out.println("Introduce texto 2: ");
        String t2 = new Scanner (System.in).nextLine();
        
        
        
        System.out.println("¿El texto 2 esta incluido en el texto 1?: "+t2.equals(t1));
        
    }
    
}
