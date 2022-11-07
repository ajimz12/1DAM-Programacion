
package examen02;

/**
 *
 * @author Álvaro
 */

import java.util.Scanner;

public class Examen02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            String nombre = "Álvaro";
            String apellidos = "Jiménez Gil";
            
            int pideint;
            double pidedouble;
            String pidestring;
            long pidelong;
            short pideshort;
            
            System.out.println("***********************");
            System.out.println("*       "+nombre+   "        *");
            System.out.println("*    "+apellidos+   "      *");
            System.out.println("***********************");


            System.out.println("Escribe un dato de tipo int: ");
            pideint = new Scanner (System.in).nextInt();
            
            System.out.println("Escribe un dato de tipo double: ");  
            pidedouble = new Scanner (System.in).nextDouble();

            
            System.out.println("Escribe un dato de tipo String: ");
            pidestring = new Scanner (System.in).nextLine();

            System.out.println("Escribe un dato de tipo long: ");
            pidelong = new Scanner (System.in).nextLong();

            System.out.println("Escribe un dato de tipo short: ");
            pideshort = new Scanner (System.in).nextShort();
                        
                        
            System.out.println(+pideint);
            System.out.println(+pidedouble);
            System.out.println(""+pidestring);
            System.out.println(+pidelong);
            System.out.println(+pideshort);


       
            
            
            
            
    }
    
}
