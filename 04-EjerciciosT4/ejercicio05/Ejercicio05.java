package ejercicio05;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import  ejercicio05.oficina.*;

public class Ejercicio05 {

    
    public static void main(String[] args) {


        Oficina o = new Oficina ();
        Oficina o2 = new Oficina("Office");
        Oficina o3 = new Oficina ("Ofis",1);
        
        
        
        System.out.println(o2.getNombreOficina());
        
        o2.setNombreOficina("office ultra");
        
        System.out.println(o2.getNombreOficina());
        
        System.out.println(o3.toString());
        
        
        

            
               
    }

}
