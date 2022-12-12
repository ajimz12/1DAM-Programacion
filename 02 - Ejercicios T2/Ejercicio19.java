
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.io.File;
import java.util.Scanner;

public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        System.out.println("Introduce la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File f = new File(ruta);
        
        System.out.println("Bytes"+f.length()+" MB: "+f.length()/2048);


    }

}
