
package ejercicio07;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */

import ejercicio07.CuentaCorriente.CuentaCorriente;

public class Ejercicio07 {

    
    public static void main(String[] args) {

        
        CuentaCorriente cr  = new CuentaCorriente();
        
        System.out.println("SALDO: "+cr.getSaldo() + " NUM: "+cr.getNumero());
        
        cr.a�adirDinero(250);
        cr.retirarDinero(50);
        
        System.out.println("SALDO: "+cr.getSaldo() + " NUM: "+cr.getNumero());

        
        
        

    }

}
