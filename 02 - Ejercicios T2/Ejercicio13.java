
package ejerciciost2;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */

import java.util.Scanner;


public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        System.out.println("Introduce tu nombre: ");
        String n = new Scanner (System.in).nextLine();
        
        System.out.println("Tu nombre es: "+n);
        System.out.println("Tu nombre en mayusculas es: "+n.toUpperCase());
        System.out.println("Tu nombre en minusculas es: "+n.toLowerCase());
        System.out.println("El tama�o de tu nombre es: "+n.length());

    }

}
