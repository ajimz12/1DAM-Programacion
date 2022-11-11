/*
 */
package ejercicio06string;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio06String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primera forma
        
        String f1 = "Hola Mundo";
        String f2 = "Adios Mundo";
        
        System.out.println(f1 + " " + f2);
        
        System.out.println("---------------------");
        
        //Segunda forma
        
        f1 = f1.concat( " "+f2);
        
        System.out.println(f1);
        
        
    }
    
}
