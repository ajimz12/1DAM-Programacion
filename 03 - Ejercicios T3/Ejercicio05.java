package tema.pkg3.ejs;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.*;

public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean rep = true;
        int npiezas = 0;
        int npiezascaz = 0;

        System.out.println("¿Cuantas piezas se pueden cazar hoy ? :");
        npiezas = new Scanner(System.in).nextInt();

        System.out.println("--Empezamos la caza >:D");

        while (npiezascaz<npiezas) {
            
                        
            System.out.println("Introduzca el numero de piezas cazadas:");
            npiezascaz = new Scanner(System.in).nextInt();
            
            System.out.println("Usted lleva cazadas " + npiezascaz + " piezas de "
                    + "" + npiezas + " posibles");
            

            if (npiezascaz > npiezas) {

                System.out.println("Ha excedido usted el numero de piezas "
                        + "cazadas al día :(");
                rep = false;

            }

           
        }

    }

}
