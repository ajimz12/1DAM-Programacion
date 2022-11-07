
package examen15;

/**
 *
 * @author Álvaro
 */
public class Examen15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean X = true;
        boolean Y = false;
        boolean Z = true;
        
        boolean ej1 = X || Y || X && !Z && !Y;
        boolean ej2 = (X || !Y) && (!X || Z);
        boolean ej3 = !X || !Y || Z && X && !Y;
        
        System.out.println(ej1);
        System.out.println(ej2);
        System.out.println(ej3);
        
        
    }
    
}
