
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;

public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingresa un número: ");
        int n = new Scanner(System.in).nextInt();
        
        
        // de decimal a binario
        
        String binario = Integer.toBinaryString(n);
        System.out.println("El numero en binario es: "+binario);
        
        // de decimal a hexadecimal
        
        String hex = Integer.toHexString(n);
        System.out.println("El numero en hexadecimal es: "+hex);


    }

}
