
package ejercicio31;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import java.lang.*;
import bpc.daw.musica.Instrumento.*;
import bpc.daw.musica.*;

public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
    String n = "Canci�n";
    
    NotaMusical don = new NotaMusical(0,2);
    NotaMusical soln = new NotaMusical(4,2);
    NotaMusical la = new NotaMusical (5,2);
    NotaMusical solb = new NotaMusical (4,1);
    NotaMusical fac = new NotaMusical (3,3);
    NotaMusical fa = new NotaMusical (3,2);   
    NotaMusical mic = new NotaMusical (2,3);
    NotaMusical mi = new NotaMusical (2,2);
    NotaMusical resem = new NotaMusical (1,4);
    NotaMusical re = new NotaMusical (1,2);
    NotaMusical misem = new NotaMusical (2,4);
    NotaMusical fasem = new NotaMusical (3,4);

   
    Cancion c = new Cancion(n);
    Piano p = new Piano();
    Instrumento i = p;
    
    
    
    c.a�adir(don);
    c.a�adir(don);
    c.a�adir(soln);
    c.a�adir(soln);
    c.a�adir(la);
    c.a�adir(la);
    c.a�adir(solb);
    c.a�adir(fac);
    c.a�adir(fa);
    c.a�adir(mic);
    c.a�adir(mi);
    c.a�adir (resem);
    c.a�adir(misem);
    c.a�adir(fasem);
    c.a�adir(resem);
    c.a�adir(don);
    
    

    p.reproducir(c);
    
    Guitarra g = new Guitarra();
    Instrumento i2 = g;
    
    g.reproducir(c);
    

 
    
    
    
    
    

    

    }

}
