/*
 */

package ejercicio21;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Introduce la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();

        File f = new File(ruta);
        
        if(f.isDirectory()){
            
            String[] n = f.list();
            
            System.out.println("El total de archivos y carpetas es: " + n.length);
            
            
            
        }else{
            
            System.out.println("Esta ruta no pertenece a un directorio");
        }
        
    }

}
