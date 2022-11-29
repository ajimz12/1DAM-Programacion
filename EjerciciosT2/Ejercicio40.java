
package ejercicio40;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.lang.*;

public class Ejercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Procesadores del ordenador
        
        System.out.println("Numero de procesadores del ordenador: "
                +Runtime.getRuntime().availableProcessors());
        
        //Cantidad de memoria total asociada al proceso de Java por el sistema 
        //operativo
        
        System.out.println("Cantidad de memoria total asociada al proceso "
                + "de Java por el sistema operativo: "
                +Runtime.getRuntime().totalMemory());


    }

}
