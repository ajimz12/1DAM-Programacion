/*
 */
package ejercicio25t2;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
import java.io.*;
import java.util.*;


public class Ejercicio25t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      File file = new File("C:\\Users\\�lvaro\\Desktop\\1� DAM\\Programaci�n\\U2\\frases.txt");
 
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
  
        
        
      
      }
      
      
        
        
    }
    

