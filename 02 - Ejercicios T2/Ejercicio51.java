package ejerciciost2;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
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
        mensajes.add("ni�o");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("l�piz");
        
        
        System.out.println("Tama�o de la lista: "+mensajes.size());
        
        System.out.println(mensajes.toString());

    }

}
