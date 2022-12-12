/*
 */

package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.TarjetaCredito;
import java.util.Scanner;

public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


         TarjetaCredito t = new TarjetaCredito(1000,2222);
        
        try{
            
        System.out.println("El saldo es: "+t.getSaldo(2222));
            
        }catch(Exception e){
            
            System.out.println("Error");
                  
        }
        
        t.ingresarDinero(100);
        
        try{
            
        System.out.println("El saldo es: "+t.getSaldo(2222));
            
        }catch(Exception e){
            
         System.out.println("Error");
         
        } 
        
        try{
        
            t.sacarDinero(2800,2222);
           
            
        }catch(Exception e){
            
         System.out.println("Error");

        }
        
        try{
            
        System.out.println("El saldo es: "+t.getSaldo(2222));
            
        }catch(Exception e){
            
            System.out.println("Error");
                  
        }
       
        


    }

}
