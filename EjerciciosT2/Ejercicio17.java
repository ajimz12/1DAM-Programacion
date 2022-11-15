/*
 */
package ejercicio17t2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
    import java.util.Scanner;


public class Ejercicio17t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce tu nombre: ");
        String t1 = new Scanner (System.in).nextLine();
        
        System.out.println("Introduce tu dominio: ");
        String t2 = new Scanner (System.in).nextLine();
        
        if(t2==".es"||t2==".com"){
        
        System.out.println("Tu correo es"+t1+"@"+t2);
        
        }else{
            
            
            System.out.println("Dominio incorrecto");
        
        }
        
        
        
        
    }
    
}
