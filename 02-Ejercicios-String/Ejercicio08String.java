
package ejercicio08string;

/**
 *
 * @author Alvaro
 */
import java.util.Scanner;

public class Ejercicio08String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String n;
        String n2;
        String a;
        
        System.out.println("Escribe tu nombre: ");
        n = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe tu segundo nombre: ");
        n2 = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe tus apellidos: ");
        a = new Scanner(System.in).nextLine();
        
        char i = n.charAt(0);
        
        char i2 = n2.charAt(0);
        
        System.out.println(a.concat(", "+i+i2));
        
        
            
            
        }
        
        
    }
    

