
package ejercicio01;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio01.dni.*;

public class Ejercicio01 {

    
    public static void main(String[] args) {

        dni dni = new dni(12345678,'E');
        
        dni dni2 = new dni("12345678E");
        
        System.out.println(dni.getNumDni());
        System.out.println(dni.getLetraDni());
        
        System.out.println(dni2.getDni());
    }

}
