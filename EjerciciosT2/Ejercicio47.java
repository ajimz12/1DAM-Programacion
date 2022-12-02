package ejercicio47;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import java.awt.*;
import java.io.*;


public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        System.out.println("Introduce la ruta de un archivo: ");
        String ruta = new Scanner (System.in).nextLine();
        
        File f = new File(ruta);
        Desktop desktop = Desktop.getDesktop();
        
        try{
            
            desktop.open(f);

        }catch (Exception e){
            
            System.out.println("El archivo introducido no existe o"
                    + "no está disponible");
            
        }
        
        
    }

}
