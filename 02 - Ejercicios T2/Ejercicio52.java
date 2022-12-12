package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.awt.*;
import java.util.*;

public class Ejercicio52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String,Color> m = new HashMap<String,Color>();
        
        System.out.println("Introduce la matrícula: ");
        String m2 = new Scanner(System.in).nextLine();

        m.put("12535ABC",Color.red); 
        m.put("98525KWX",Color.yellow); 
        m.put("17632MSE",Color.green); 
        m.put(m2,Color.yellow); 
        
       
        System.out.println("Tamaño de Map: "+m.size());
        
        System.out.println(m.toString());
        
        if(m2.equals("85321ABC")){
            
           System.out.println(m.get(m2));

        }else{
            
            System.out.println("La matrícula introducida no existe");
            
 
        }
      
        
       
        
        

    }

}
