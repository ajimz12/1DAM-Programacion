package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;

public class Ejercicio51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Set <String> mensajes = new HashSet<String>();
      
        
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("niño");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lápiz");
        
        
        System.out.println("Tamaño de la lista: "+mensajes.size());
        
        System.out.println(mensajes.toString());

    }

}
