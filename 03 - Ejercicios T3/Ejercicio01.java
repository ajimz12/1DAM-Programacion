
package ejercicio1t3;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
import java.util.*;

public class Ejercicio1t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String [] canciones = {"Eyeless.mp3","Enter Sandman.mp3",
            "Hammer Smashed Face.mp3","Tornado of Souls.mp3",
            "Locura Transitoria.mp3"};

        System.out.println("Elige una de estas incre�bles canciones para reproducir (Mediante su n�mero)");
        
        System.out.println("1. Eyeless - Slipknot");
        System.out.println("2. Enter Sandman - Metallica");
        System.out.println("3. Hammer Smashed Face - Cannibal Corpse");
        System.out.println("4. Tornado of Souls - Megadeth");
        System.out.println("5. Locura Transitoria - Extremoduro");
        
        System.out.println("Elige! : ");
        int num = new Scanner (System.in).nextInt();
        
        
        
        
        switch(num){
            
            case 1:
            System.out.println("Canci�n a reproducir... Eyeless de Slipknot!");
            break;
            
             case 2:
            System.out.println("Canci�n a reproducir... Enter Sandman de Metallica!");
            break;
            
             case 3:
            System.out.println("Canci�n a reproducir... Hammer Smashed Face de Cannibal Corpse!");
            break;
            
             case 4:
            System.out.println("Canci�n a reproducir... Tornado of Souls de Megadeth!");
            break;
            
             case 5:
            System.out.println("Canci�n a reproducir... Locura Transitoria de Extremoduro!");
            break;
            
            default:
                System.out.println("Ups! Parece que no hay ninguna canci�n disponible");
        }
        
        
       }

}
