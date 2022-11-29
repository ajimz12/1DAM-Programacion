
package ejercicio38;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        System.out.println("x^2 - 5x + 6");
        
        
        System.out.println("a = 1");
        System.out.println("b = -5");
        System.out.println("c = 6");
        
        System.out.println("ax^2 + bx + c = 0");
        
        System.out.println("1º Solucion");
        
        double raiz = Math.pow(-5,2)-4*(1*6);
        
        double r1 = (5 + Math.sqrt(raiz));
        
        System.out.println("Solucion Nº1 = "+r1/2);
        
        
        System.out.println("2º Solucion");
        
        double r2 = (5 - Math.sqrt(raiz));
        
        System.out.println("Solución Nº2 = "+r2/2);


        
        
        
        
        
        
        
        


    }

}
