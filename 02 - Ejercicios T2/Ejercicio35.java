
package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import bpc.daw.reproductor.*;

public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ruta1 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/"
                + "Eyeless.mp3";
        
        
        
        ArchivoMP3 a = new ArchivoMP3(ruta1);
        ArchivoMP3 a2 = new ArchivoMP3(ruta1);
        
        System.out.println(a==a2);
        
        //Nos dice "false", ya que esta comprobando si son
        //iguales dentro de la memoria del ordenador
        
        System.out.println(a.equals(a2));
        
        //Nos dice "true", esta viendo que es literalmente
        //el mismo archivo
        
        //Hashcode de dichos objetos
        
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
        
        //Coinciden
        
        
         ArchivoMP3 eyeless= new ArchivoMP3(ruta1);
         Reproducible r = eyeless;
         boolean sincrono = true;
         boolean info = false;

        Reproductor rep = new Reproductor(r,sincrono,info);
        
        //Metodo toString en Reproductor
        
        System.out.println(rep.toString());
        
        //Metodo toString en archivo MP3
        
        System.out.println(a2.toString());

    }

}
