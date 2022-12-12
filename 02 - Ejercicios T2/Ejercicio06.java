
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.mario.*;
import java.util.Scanner;

public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Escribe unas coordenadas: ");
        double coord=new Scanner(System.in).nextDouble();
        
        Mario m= new Mario(coord);


    }

}
