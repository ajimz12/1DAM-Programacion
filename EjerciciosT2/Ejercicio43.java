
package ejercicio43;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import java.text.*;

public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double op = 4 * Math.atan(1);
        
        DecimalFormat df = new DecimalFormat();
        
        df.setMaximumFractionDigits(4);

        System.out.println(df.format(op));



    }

}
