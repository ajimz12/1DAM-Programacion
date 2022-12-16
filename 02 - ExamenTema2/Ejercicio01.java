package examt2.pkg3_aj;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.*;
import java.util.*;

public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        MarcadorBaloncesto m = new MarcadorBaloncesto ("Estudiantes",
                "CB Granada");
        
        String L = m.getNombreLocal();
        String V = m.getNombreVisitante();
        
      
        boolean repetir = true;
        
      
        System.out.println("Marcador automático entre equipos, local: "
                + "Estudiantes; visitante: CB Granada");
       
        System.out.println("Pulse la tecla 'P' para ver el marcador actual");
        
        System.out.println("Pulse la tecla 'S' para ver el marcador final y "
                + "terminar el partido: ");
        
        System.out.println("Marque la canasta de la siguiente forma: ");
        
        System.out.println("1) Indique equipo anotador: pulse letra L (Local)"
                + "o V (visitante) + INTRO");
        
        System.out.println("2) Marque la puntuacion anotada por dicho equipo: "
                + "(entero 1, 2 o 3) + INTRO");
        
        
        
        while(repetir){
            
            
        System.out.println("a) Indique el equipo anotador (L|V), S (salir), "
                + "P(puntos actuales): ");
        char p = new Scanner(System.in).next().charAt(0);
        
        
        switch(p){
            
            case 'P':
                System.out.println("Marcador actual: "+m.toString()+""
                        + " Va ganando: "+m.getNombreEquipoGanador());
                break;
                
            case 'S':
                System.out.println("Fin del encuentro");
                System.out.println("Marcador Final: "+m.toString());
                System.out.println("Ganador: "+m.getNombreEquipoGanador());
                System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
                repetir = false;
                break;
                
            case 'L':
                
                
                
                System.out.println("Indique la puntuacion de la canasta: ");
                int puntl = new Scanner (System.in).nextInt();
                
                        
                if (puntl > 3 || puntl < 1){
                    
                    System.out.println("El número introducido no es válido, "
                            + "debe ser de entre 1 a 3");
               
            }else{
                    
                  m.anotarCanasta('L', puntl);   
                    
                }
                
                break;
                
            case 'V':
                
                 System.out.println("Indique la puntuacion de la canasta: ");
                int puntv = new Scanner (System.in).nextInt();
                
                m.anotarCanasta('V', puntv);
                
                  if (puntv > 3 || puntv < 1){
                    
                    System.out.println("El número introducido no es válido, "
                            + "debe ser de entre 1 a 3");
                
            }else{
                    
                  m.anotarCanasta('V', puntv);   
                    
                }
                
                
                break;
                
            default:
                System.out.println("No se ha introducido un operador válido");
                       
            
            
            
        }
        
            
        }
  
        

    }

}
