
package tema5.ejercicio30;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tema5.ejercicio26.*;

public class Ejercicio30 {

    
    public static void main(String[] args) {
        

        List<FiguraGeometrica> l = new ArrayList<FiguraGeometrica>();
        
        System.out.println("1) A�adir un rectangulo");
        System.out.println("2) A�adir un cuadrado");
        System.out.println("3) A�adir un c�rculo");
        System.out.println("4) A�adir un triangulo");
        System.out.println("5) Dibujar todo");
        
        char n = new Scanner(System.in).next().charAt(0);
        
        switch(n){
            
            case '1':
                
                System.out.println("Has elegido...Rectangulo!");
                System.out.println("�C�ales van a ser sus coordenadas?");
                
                System.out.println("Eje X: ");
                int x = new Scanner(System.in).nextInt();
                
                System.out.println("Eje Y: ");
                int y = new Scanner(System.in).nextInt();
                
                System.out.println("Y su color?");
                Color c = new Scanner(System.in).nextInt();
                
                Rectangulo rec = new Rectangulo(x,y);
                
                break;
                
        }
        
        
        
        
        
        


    }

}
