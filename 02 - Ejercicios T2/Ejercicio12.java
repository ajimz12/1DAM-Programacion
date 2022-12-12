package ejerciciost2;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.*;


public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 MarcadorBaloncesto m = new MarcadorBaloncesto("Estudiantes", 
         "CB Granada");
    
    String L = m.getNombreLocal();
    String V = m.getNombreVisitante();
    
    System.out.println("Equipo Local: "+L+"     Equipo Visitante: "+V);
   
    int ploc = m.getPuntosLocal();
    int pvis = m.getPuntosVisitante();
    
    
    
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);
    
    m.anotarCanasta('L' , 2);
    
     ploc = m.getPuntosLocal();
     pvis = m.getPuntosVisitante();
     
    
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());

    m.anotarCanasta('V' , 3);
    
     ploc = m.getPuntosLocal();
     pvis = m.getPuntosVisitante();
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
  
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);

    m.anotarCanasta('L' , 2);
    
    ploc = m.getPuntosLocal();
    pvis = m.getPuntosVisitante();
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());

    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);

    m.anotarCanasta('V' , 2);
    
    ploc = m.getPuntosLocal();
    pvis = m.getPuntosVisitante();
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
    
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);
 
    m.anotarCanasta('V' , 3);
    
    ploc = m.getPuntosLocal();
    pvis = m.getPuntosVisitante();
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
    
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);

    m.anotarCanasta('L' , 1);

    ploc = m.getPuntosLocal();
    pvis = m.getPuntosVisitante();
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
    
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);

    m.anotarCanasta('L' , 1);

    ploc = m.getPuntosLocal();
    pvis = m.getPuntosVisitante();
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
    
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);

    m.anotarCanasta('V' , 2);

    ploc = m.getPuntosLocal();
    pvis = m.getPuntosVisitante();
    System.out.println("Ganador: "+m.getNombreEquipoGanador());
    System.out.println("Perdedor: "+m.getNombreEquipoPerdedor());
    
    System.out.println("Estudiantes: "+ploc+"     CB Granada: "+pvis);


    }

}
