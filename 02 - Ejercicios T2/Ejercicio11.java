
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.*;


public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Caja c1 = new Caja ("hola holita");
        Caja c2 = new Caja ("adios adiosito");
       
        c1.abrirCaja();
        c2.abrirCaja();
        
        String m1 = c1.getMensaje();
        String m2 = c2.getMensaje();
          
        c1.cambiarMensaje(m2);
        c1.cambiarMensaje(m1);
        
        
        System.out.println("el mensaje de la caja 1 es: "+c2.getMensaje());
        System.out.println("el mensaje de la caja 2 es: "+c1.getMensaje());


    }

}
