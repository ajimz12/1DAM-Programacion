package ejerciciost2;

import java.awt.Color;
import java.util.*;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Map<String,Color> m = new TreeMap<String,Color>();
       

        m.put("12535ABC",Color.red); 
        m.put("98525KWX",Color.yellow); 
        m.put("17632MSE",Color.green); 
        m.put("85321ABC",Color.yellow); 
        
       
        System.out.println("Tama�o de Map: "+m.size());
        
        System.out.println(m.toString());
        
        


    }

}
