/*
 */

package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.mario.*;


public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Luigi l= new Luigi(500);
        Mario m= new Mario(l,0);
        
        double distanciaym = m.getY();
        double distanciaxm = m.getX();
        double distanciayl = l.getY();
        double distanciaxl = l.getX();
        
        System.out.println("La distancia de Mario en el eje Y es: "
                + ""+distanciaym);
        System.out.println("La distancia de Mario en el eje X es: "
                +distanciaxm);
        System.out.println("La distancia de Luigi en el eje Y es: "
                +distanciayl);
        System.out.println("La distancia de Luigi en el eje X es: "
                +distanciaxl);

        
        
        

    }

}
