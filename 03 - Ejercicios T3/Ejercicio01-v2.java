
package ejercicio1t3;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.*;
import bpc.daw.reproductor.*;

public class Ejercicio1t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         boolean sincrono = false;
         boolean info = false;

        String [] canciones = {"Eyeless.mp3","Enter Sandman.mp3",
            "Hammer Smashed Face.mp3","Tornado of Souls.mp3",
            "Locura Transitoria.mp3"};
        
        String ruta = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/Eyeless.mp3";
        String ruta2 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/EnterSandman.mp3";
        String ruta3 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/HammerSmashedFace.mp3";
        String ruta4 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/Tornadoofsouls.mp3";
        String ruta5 = "c:/Users/Álvaro/Desktop/1º DAM/Programación/U3/music/LocuraTransitoria.mp3";
        
        ArchivoMP3 eyeless= new ArchivoMP3(ruta);
        ArchivoMP3 esandman= new ArchivoMP3(ruta2);
        ArchivoMP3 hammersf= new ArchivoMP3(ruta3);
        ArchivoMP3 tornado= new ArchivoMP3(ruta4);
        ArchivoMP3 locura= new ArchivoMP3(ruta5);

        
        Reproducible r = eyeless;
        Reproducible r2 = esandman;
        Reproducible r3 = hammersf;
        Reproducible r4 = tornado;
        Reproducible r5 = locura;

                        
        Reproductor repro = new Reproductor(r,sincrono,info);
        Reproductor repro2 = new Reproductor(r2,sincrono,info);
        Reproductor repro3 = new Reproductor(r3,sincrono,info);
        Reproductor repro4 = new Reproductor(r4,sincrono,info);
        Reproductor repro5 = new Reproductor(r5,sincrono,info);
        
        

        System.out.println("Elige una de estas increíbles canciones para reproducir (Mediante su número)");
        
        System.out.println("1. Eyeless - Slipknot");
        System.out.println("2. Enter Sandman - Metallica");
        System.out.println("3. Hammer Smashed Face - Cannibal Corpse");
        System.out.println("4. Tornado of Souls - Megadeth");
        System.out.println("5. Locura Transitoria - Extremoduro");
        
        System.out.println("Elige! : ");
        int num = new Scanner (System.in).nextInt();
        
        
        
        
        switch(num){
            
            case 1:
            System.out.println("Canción a reproducir... "+canciones[0]);
            repro.play();
            break;
            
             case 2:
            System.out.println("Canción a reproducir... "+canciones[1]);
            repro2.play();
            break;
            
             case 3:
            System.out.println("Canción a reproducir... " +canciones[2]);
            repro3.play();
            break;
            
             case 4:
            System.out.println("Canción a reproducir... "+canciones[3]);
            repro4.play();
            break;
            
             case 5:
            System.out.println("Canción a reproducir... "+canciones[4]);
            repro5.play();
            break;
            
            default:
                System.out.println("Ups! Parece que no hay ninguna canción disponible");
        }
        
        
       }

}
