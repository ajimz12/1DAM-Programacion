
package ejercicio48;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import bpc.daw.objetos.*;
import bpc.daw.objetos.MarcadorMejorado.*;
import static bpc.daw.objetos.MarcadorMejorado.CANASTA_LOCAL;
import static bpc.daw.objetos.MarcadorMejorado.CANASTA_VISITANTE;
import static bpc.daw.objetos.MarcadorMejorado.NORMAL;
import static bpc.daw.objetos.MarcadorMejorado.TIRO_LIBRE;
import static bpc.daw.objetos.MarcadorMejorado.TRIPLE;



public class Ejercicio48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //E ->2, CB -> 3, E->2, CB->2, CB->3, E->1, E->1, CB->2


        MarcadorMejorado m = new MarcadorMejorado("Estudiantes",
                "CB Granada");
        
        String L = m.getNombreLocal();
        String V = m.getNombreVisitante();
        
        
        m.anotarCanasta(CANASTA_LOCAL,NORMAL);
        
        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
        
        m.anotarCanasta(CANASTA_VISITANTE,TRIPLE);
        
        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());

        m.anotarCanasta(CANASTA_LOCAL,NORMAL);
        
        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
        
        m.anotarCanasta(CANASTA_VISITANTE,NORMAL);
        
        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
        
        m.anotarCanasta(CANASTA_VISITANTE,TRIPLE);

        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());

        m.anotarCanasta(CANASTA_LOCAL,TIRO_LIBRE);

        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
        
        m.anotarCanasta(CANASTA_LOCAL,TIRO_LIBRE);

        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
        
        m.anotarCanasta(CANASTA_VISITANTE,NORMAL);
        
        System.out.println(m.toString());
        
        System.out.println("Ganador: "+m.getNombreEquipoGanador());
        System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
        
        
      



        
        
        
        
        
        
        
        
        
     
      
        
        

         
         
         
         


    }

}
