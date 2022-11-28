package ejercicio33;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import bpc.daw.reproductor.*;


public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        PlayList p = new PlayList();
        
        p.setTitulo("La mejor playlist de la historia");
        
        String rutap = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U2/"
                + "playlist.txt";
        
        String ruta = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/"
                + "Eyeless.mp3";
        String ruta2 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/"
                + "EnterSandman.mp3";
        String ruta3 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/"
                + "Tornadoofsouls.mp3";

        
        ArchivoMP3 eyeless= new ArchivoMP3(ruta);
        ArchivoMP3 esandman= new ArchivoMP3(ruta2);
        ArchivoMP3 tornado= new ArchivoMP3(ruta3);

        
        p.añadir(esandman);
        p.añadir(eyeless);
        p.añadir(tornado);
        
        try{
            
           p.guardar(rutap);

            
        }catch(Exception e){
            
            System.out.println("Vaya! Ha habido un error al guardar la "
                    + "playlist");
        }
        
        boolean sincrono = true;
        boolean info = false;
        
        Reproducible r = eyeless;
        Reproducible r2 = esandman;
        Reproducible r3 = tornado;
        
        Reproductor repro = new Reproductor(r,sincrono,info);
        Reproductor repro2 = new Reproductor(r2,sincrono,info);
        Reproductor repro3 = new Reproductor(r3,sincrono,info);
        
        repro.play();
        repro2.play();
        repro3.play();
        
        
   
    }

}
