/*
 */
package ejercicio02java;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
import java.lang.*;
import java.util.Scanner;

public class Ejercicio02Java {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        System.out.println("Escribe un m�ximo de 50 caracteres: ");
        String cadena = new Scanner(System.in).nextLine();
        
        if (cadena.length()>50){
            
            System.out.println("Ha superado el limite de caract�res, intentelo de nuevo: ");
            cadena = new Scanner(System.in).nextLine();
            
        }
        
        
        System.out.println(cadena.replaceAll("\\s",""));
        
    }
    
}
