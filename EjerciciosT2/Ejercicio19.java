/*
 */
package ejercicio19t2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio19t2 {

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
