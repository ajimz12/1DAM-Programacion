package ejercicio45;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.time.*;


public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

         LocalDate localDate = LocalDate.of(2100,2,28);

        DayOfWeek dw = DayOfWeek.from(localDate);
     
        String dia = dw.name();
         
        System.out.println("El nombre del día de la semana es: "+dia);
        
        


    }

}
