
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.Scanner;


public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Escribe una frase: ");
        String f = new Scanner(System.in).nextLine();
        
        System.out.println("La letra justo en mitad es: "+f.charAt(0)/2);


    }

}
