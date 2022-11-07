
package examen03;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Examen03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horas;
        int minutos;
        int segundos;
        
        
        System.out.println("Di un numero entero: ");
            horas = new Scanner (System.in).nextInt();

        System.out.println("Di otro numero entero: ");
            minutos = new Scanner (System.in).nextInt();

        System.out.println("Di otro numero entero: ");
            segundos = new Scanner (System.in).nextInt();
            
            
            
            int totalsecs = (horas * 3600)+(minutos * 60)+ segundos;
        
        System.out.println("El numero total de segundos es: "+totalsecs);
        
        
                
        
        
    }
    
}
