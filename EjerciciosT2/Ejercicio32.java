
package ejercicio32;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import bpc.daw.reproductor.*;

public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean sincrono = true;
        boolean info = true;
        
        String ruta = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/EnterSandman.mp3";

        ArchivoMP3 esandman= new ArchivoMP3(ruta);

        Reproducible r = esandman;

        Reproductor repro = new Reproductor(r,sincrono,info);

        repro.play();

    }

}
