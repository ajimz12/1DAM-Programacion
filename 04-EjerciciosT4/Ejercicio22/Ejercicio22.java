package ejercicio22;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio22.Fraccion.Fraccion;

public class Ejercicio22 {

    
    public static void main(String[] args) {

      Fraccion f = new Fraccion(4,5);
      Fraccion f2 = new Fraccion(9,4);
            
        System.out.println(Fraccion.sumar(f, f2));
        System.out.println(Fraccion.dividir(f, f2));
        System.out.println(Fraccion.multiplicar(f, f2));
       
    }

}
