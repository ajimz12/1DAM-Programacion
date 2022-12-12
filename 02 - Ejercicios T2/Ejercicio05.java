/*
 */

package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.mario.*;



public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
        Cañon cañon= new Cañon(100,100);
        Cañon cañon2= new Cañon(100,200);
        
        cañon.disparar(500,100);
        cañon.disparar(500,100);
        
        int disparoscañon1 = cañon.getTotalDisparosRealizados();
        
        cañon2.disparar(500,200);
        cañon2.disparar(500,200);
        cañon2.disparar(500, 200);
        
        int disparoscañon2 = cañon2.getTotalDisparosRealizados();

        
        System.out.println("El primer cañon a disparado un total de: "+disparoscañon1+" veces");
        System.out.println("El segundo cañon a disparado un total de: "+disparoscañon2+" veces");



    }

}
