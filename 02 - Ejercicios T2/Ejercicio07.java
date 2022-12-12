/*
 */

package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */


import bpc.daw.objetos.*;


public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        DepositoAgua depositagua= new DepositoAgua(15,50);
        
        depositagua.dibujar();
        
        int capacidadactual = depositagua.getCantidadActual();
        int capacidadmaxima = depositagua.getCapacidadMaxima();
        
        int operacionporciento = (100*15)/50;
        
        System.out.println("El tanto por ciento de ocupacion del deposito es: "
                +operacionporciento+"%");
        
        


    }

}
