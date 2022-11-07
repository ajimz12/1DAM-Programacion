
package examen09;

/**
 *
 * @author Álvaro
 */
import java.util.Scanner;

public class Examen09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        System.out.println("Introduce un numero entre 10 y 56: ");
        num = new Scanner (System.in) .nextInt();
        
        if (num >= 10 && num<= 56){
            
            System.out.println("El número es correcto");
            
            
        }else {
            
          System.out.println("El número es incorrecto");

        }
        
    }
    
}
