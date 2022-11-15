/*
 */
package ejercicio26t2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.*;
import java.lang.*;

public class Ejercicio26t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("¿Cúantos segundos quiere esperar?");
        int n = new Scanner(System.in).nextInt();
        
        Thread s = new Thread();
        
        try{
            
          s.sleep(n*1000);

            
        }catch(Exception e){
            
            System.out.println("Error");
        }
        
        System.out.println("holaa, esto es un mensaje de prueba");
        
        
    }
    
}
