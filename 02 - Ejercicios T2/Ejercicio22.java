
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.*;


public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        TarjetaCredito t = new TarjetaCredito(5000,1111);
    
    try{
        
        System.out.println("El saldo es: "+t.getSaldo(1111)+" euros");
        
    }catch(Exception e){
        
        System.out.println("Excepcion a la hora de obtener informacion de la cuenta");
    }
        
       
    try{
    
        t.sacarDinero(2000, 1111);
    
    }catch(Exception e){
    
      System.out.println("Excepcion a la hora de obtener informacion de la cuenta");

        
    }
    
    try{
        
        System.out.println("El saldo es: "+t.getSaldo(1111)+" euros");
        
    }catch(Exception e){
        
        System.out.println("Excepcion a la hora de obtener informacion de la cuenta");
        
        
    }


    }

}
