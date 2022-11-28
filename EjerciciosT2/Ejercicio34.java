
package ejercicio34;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import bpc.daw.reproductor.*;

public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {

        String ruta = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U2/"
                + "playlist.txt";
        
        try{
            
            PlayList p = new PlayList(ruta);
            System.out.println(p.getTitulo());
           
            
            
        }catch(Exception e){
            
            System.out.println("No se ha podido cargar la playlist o tiene"
                    + "formato incorrecto");
        }
        
      String ruta1 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/"
                + "Eyeless.mp3";
        String ruta2 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/"
                + "EnterSandman.mp3";
        String ruta3 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/"
                + "Tornadoofsouls.mp3";

        
        ArchivoMP3 eyeless= new ArchivoMP3(ruta1);
        ArchivoMP3 esandman= new ArchivoMP3(ruta2);
        ArchivoMP3 tornado= new ArchivoMP3(ruta3);
        
         Reproducible r = eyeless;
        Reproducible r2 = esandman;
        Reproducible r3 = tornado;
        
        boolean sincrono = true;
        boolean info = false;
        
        Reproductor repro = new Reproductor(r,sincrono,info);
        Reproductor repro2 = new Reproductor(r2,sincrono,info);
        Reproductor repro3 = new Reproductor(r3,sincrono,info);
        
        repro.play();
        repro2.play();
        repro3.play();
        
        
    }

}
