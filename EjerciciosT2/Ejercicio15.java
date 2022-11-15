/*
 */
package ejercicio15t2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
    import java.util.Scanner;


public class Ejercicio15t2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String clave ="Hola Mundo";
        
        System.out.println("Introduce la contraseña: ");
        String c = new Scanner (System.in).nextLine();
        
        if (c==clave){
            
            System.out.println("Contraseña correcta");
            
            
        }else{
            
           System.out.println("Contraseña incorrecta:");


            
        }
        
    }
    
}
