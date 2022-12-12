
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.Scanner;


public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        System.out.println("Introduce tu correo: ");
        String correo = new Scanner (System.in).nextLine();
        
        int a = correo.indexOf("@");
        
        String nom = correo.substring(0,a);
        
        String d = correo.substring(a+1);
        
        System.out.println("Descomposición:");
        
        System.out.println("Nombre del correo: "+nom);
        System.out.println("Dominio del correo: "+d);


    }

}
