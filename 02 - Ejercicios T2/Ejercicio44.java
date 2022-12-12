package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.time.*;
import java.time.format.*;
 

public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     LocalDate localDate = LocalDate.now();
     
     
     DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
     
     String f1 = localDate.format(format1); 
     
     DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     
     String f2 = localDate.format(format2); 
     
        System.out.println(f2);
        
        System.out.println(f1);
        
    }

}
