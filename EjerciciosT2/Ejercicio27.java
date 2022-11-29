package ejercicio27t2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.*;
import java.net.*;

public class Ejercicio27t2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
       System.out.println("Escriba una direccion IP: ");
       String ip = new Scanner (System.in).nextLine();
        
       System.out.println("Escribe el tiempo de timeout (milisegundos): ");
       int timeout = new Scanner (System.in).nextInt();
       
       
       try{
            
           InetAddress inet = InetAddress.getByName(ip);
           System.out.println(inet.isReachable(timeout));
            
        }catch(Exception e){
            
            System.out.println("Error en el tiempo (ms)");
        }
       

        
    }
    
}
