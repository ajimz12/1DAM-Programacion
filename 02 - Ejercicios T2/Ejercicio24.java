/*
 */

package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.lang.*;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String f1;
        String f2;
        
        System.out.println("Introduce frase 1: ");
        f1 = new Scanner(System.in).nextLine();
        
        System.out.println("Introduce frase 2: ");
        f2 = new Scanner(System.in).nextLine();
        
        try{
            
        FileWriter fw = new FileWriter("C:\\Users\\Álvaro\\Desktop\\1º DAM\\Programación\\U2\\frases.txt");
        PrintWriter salida = new PrintWriter(fw); 
        salida.println(f1);
        salida.println(f2);
        salida.close();

        
        }
        
        catch(Exception e){
            
            System.out.println("Error");
            
        }
  


    }

}
