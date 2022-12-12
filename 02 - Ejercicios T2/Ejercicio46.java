package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.time.*;

public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;
        
        int rango = (10 - 0) + 1;
        
        int rand = (int) (Math.random()*rango)+n2;
        
        System.out.println(rand);
        
        Thread s = new Thread();
        
        Instant i = Instant.now();
        
        try{
            
          s.sleep(rand*1000);

            
        }catch(Exception e){
            
            System.out.println("Algo ha ido mal");
        }
        
        
        Instant i2 = Instant.now();
        
        Duration d = Duration.between(i,i2);

        System.out.println("El tiempo de pausa ha sido: "+d.getSeconds()+" segundos");

    }

}
