/*
 */

package ejerciciost2;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.mario.*;



public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
        Ca�on ca�on= new Ca�on(100,100);
        Ca�on ca�on2= new Ca�on(100,200);
        
        ca�on.disparar(500,100);
        ca�on.disparar(500,100);
        
        int disparosca�on1 = ca�on.getTotalDisparosRealizados();
        
        ca�on2.disparar(500,200);
        ca�on2.disparar(500,200);
        ca�on2.disparar(500, 200);
        
        int disparosca�on2 = ca�on2.getTotalDisparosRealizados();

        
        System.out.println("El primer ca�on a disparado un total de: "+disparosca�on1+" veces");
        System.out.println("El segundo ca�on a disparado un total de: "+disparosca�on2+" veces");



    }

}
