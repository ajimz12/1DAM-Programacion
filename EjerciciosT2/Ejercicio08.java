/*
 */
package ejercicio8tema2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import bpc.daw.objetos.*;

public class Ejercicio8tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DepositoAgua deposagua1 = new DepositoAgua (15, 20);
        
        deposagua1.dibujar();
        
        deposagua1.retirarLitro();
        deposagua1.retirarLitro();
        deposagua1.retirarLitro();
        deposagua1.retirarLitro();
        deposagua1.retirarLitro();
        
        
        int capacidadactual1 = deposagua1.getCantidadActual();
        
        
        
        DepositoAgua deposagua2 = new DepositoAgua (5, 20);
        
        deposagua2.dibujar();
        
        deposagua2.añadirLitro();
        deposagua2.añadirLitro();
        deposagua2.añadirLitro();
        deposagua2.añadirLitro();
        deposagua2.añadirLitro();
      
        
        
        
        int capacidadactual2 = deposagua2.getCantidadActual();

      
        
                
        deposagua1.dibujar();
        deposagua2.dibujar();
        
        
        System.out.println("Deposito Agua 1: "+capacidadactual1);
        System.out.println("Deposito Agua 2: "+capacidadactual2);
        
        
    
    }
    
}
