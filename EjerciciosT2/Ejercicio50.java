
package ejercicio50;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */


import java.util.*;
import java.lang.*;

public class Ejercicio50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        ArrayList<String> mensajes = new ArrayList<>();
        
        mensajes.add("Hola");
        mensajes.add("Mundo");
        mensajes.add("Adi�s");
        mensajes.add("Holita");
        mensajes.add("Adiosito");
        
        
        System.out.println("El tama�o de la lista es: "+mensajes.size());
        
        System.out.println("La palabra de la posici�n 3 de la lista es: "+mensajes.get(2));
        
        System.out.println(mensajes.toString());
        
        mensajes.remove(0);
        
        System.out.println("El tama�o de la lista es: "+mensajes.size());

        System.out.println("La palabra de la posici�n 3 de la lista es: "+mensajes.get(2));

        System.out.println(mensajes.toString());
        
        
        
        
        
        
        
    }

}
