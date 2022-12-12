
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.*;


public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Caja caja1 = new Caja ("Bienvenidos al instituto");
        
     caja1.cerrarCaja();
     
     String mensaje = caja1.getMensaje();
     
     System.out.println(mensaje);
     
     caja1.abrirCaja();
     
     String mensaje2 = caja1.getMensaje();

          
     System.out.println(mensaje2);


    }

}
