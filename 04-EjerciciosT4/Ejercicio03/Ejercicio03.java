package ejercicio03;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio03.MarcadorBaloncesto.*;
import java.time.*;



public class Ejercicio03 {

    
    public static void main(String[] args) {


        MarcadorBaloncesto m = new MarcadorBaloncesto("Estudiantes",4,"CB Granada",2,LocalDate.now());
        
        
        System.out.println(m.toString());
        
        System.out.println(m.getFecha());
        
    }

}
