
package examen13;

/**
 *
 * @author Álvaro
 */
import java.util.Scanner;
import java.lang.Math;

public class Examen13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int radio;
        double pi = 3.1416;
        
        
       System.out.println("Introduce el radio: ");
       radio = new Scanner (System.in) .nextInt();
       
       double operacion = pi*Math.pow(radio, 2);
       
       System.out.println("El área es: "+operacion);
        
        
    }
    
}
