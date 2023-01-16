
package tema.pkg3.ejs;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import java.io.*;

public class Ejercicio10 {

    
    public static void main(String[] args) {

       String ruta;
       boolean rep = true;
       
       System.out.println("Introduce la ruta de un archivo de texto: ");
       ruta = new Scanner (System.in).nextLine();
       
       try{
       
       BufferedReader br = new BufferedReader (new FileReader (ruta));
       String linea;
       
       while((linea = br.readLine())!=null){
           
           System.out.println(linea);
       }
       
       }catch(Exception e){
           
           e.printStackTrace();
       }
    }
}
