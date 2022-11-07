
package examen10;

import java.util.Scanner;

/**
 *
 * @author Álvaro
 */
public class Examen10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1;
        int n2;
        int n3;
        
        
        System.out.println("Introduce un numero: ");
        n1 = new Scanner (System.in) .nextInt();

        System.out.println("Introduce otro numero: ");
        n2 = new Scanner (System.in) .nextInt();
        
        System.out.println("Introduce otro numero: ");
        n3 = new Scanner (System.in) .nextInt();
        
        
        if (n1 > n2 && n1 > n3) {
            
            System.out.println("El primer número es el mayor");
            
            
        
    }else if (n2>n1 && n2>n3){
        
            System.out.println("El segundo número es el mayor");

        
    }else if (n3>n1 && n3>n2){
    
            System.out.println("El tercer número es el mayor");
            
            
      
}else if (n1==n2 || n1==n3 || n2==n1 || n2==n3 || n3==n1 || n3==n2 ){
    
    
            System.out.println("Todos los numeros son iguales");

        
        
    }
}
}