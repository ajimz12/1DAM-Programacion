
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.*;
import java.io.*;

public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


         System.out.println("Introduce la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File f = new File(ruta);
                
        if(f.isDirectory()==true){
        
        System.out.println("La ruta introducida corresponde a un directorio");
        
        System.out.println("La ruta introducida es un archivo de tamaño " +f.length()+  " bytes");
        
        System.out.println("¿Desea borrarlo? (si/no)");
        String r = new Scanner(System.in).nextLine();
        
        if (r.equals("si")){
            
            f.delete();
           
            }else{
                
            System.out.println("Borrado cancelado");
               
            } 
            
    } else{
    
       System.out.println("La ruta introducida no corresponde a un directorio");      
       
        }


    }

}
