
package ejercicio04;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio04.Persona.*;
import ejercicio01.dni.*;
import java.time.*;


public class Ejercicio04 {

    
    public static void main(String[] args) {

        dni dni = new dni(12345678,'A');
        
       
        Persona p = new Persona("Paco",dni);
        Persona p2 = new Persona("Paco",dni,1200,LocalDate.now());
        
        System.out.println(p.getDNI());
        System.out.println(p.getNombre());
        System.out.println(p.getSueldo());
        System.out.println(p.getFechaNacimiento());
        
        p.setNombre("mortadelo");
        p.setDNI(dni);
        
        System.out.println(p.getNombre());
        System.out.println(p2.getSueldo());
       

        

    }

}
