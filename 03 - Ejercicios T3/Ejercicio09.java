
package tema.pkg3.ejs;

import java.util.Scanner;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio09 {

    
    public static void main(String[] args) {

        double s = 1;
        double a = 1;
        boolean rep = true;
        double d = Math.abs(s-a);
        
        System.out.println("Introduce un número positivo: ");
        int n = new Scanner(System.in).nextInt();
        
        while (rep) {


            s = 1 / 2 * (a + n / a);
            
            if(d<0.000001){
                
                System.out.println("Programa finalizado");
                rep = false;
               
            }else{
                
                a = s;
                
            }
            
        }
        
    }

}
