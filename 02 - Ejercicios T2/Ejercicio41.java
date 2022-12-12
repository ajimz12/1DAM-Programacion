
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //Se calcula la operacion
        
        
        double m = (0.38 * 4.93);
        
        double op = Math.pow(m,-0.36);
        
        //Se redondea 
        
        long r = Math.round(op);
        
        //Se pasa a int
        
        int r2 = Math.toIntExact(r);
        
        System.out.println(r2);
        
        


    }

}
