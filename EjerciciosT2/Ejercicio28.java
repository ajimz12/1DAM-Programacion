
package ejercicio28;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import java.net.*;

public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Introduce un nombre de equipo: ");
        String n = new Scanner(System.in).nextLine();
        
        try{
            
            InetAddress inet = InetAddress.getByName(n);
            System.out.println(inet.toString());
           
        }catch (Exception e){
            
            System.out.println("Error al obtener ip, puede que"
                    + "el nombre del equipo no exista");
            
        }
        

    }

}
