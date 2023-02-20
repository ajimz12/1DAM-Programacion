package ejercicio03.MarcadorBaloncesto;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.time.*;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class MarcadorBaloncesto {

    //ATRIBUTOS
    
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    //METODOS
    
    public MarcadorBaloncesto(String nL, String nV) {

        nombreLocal = nL;
        nombreVisitante = nV;

        puntosLocal = 0;
        puntosVisitante = 0;
        fecha = LocalDate.now();

    }

    public MarcadorBaloncesto(String nL, String nV, LocalDate f) {

        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;

        puntosLocal = 0;
        puntosVisitante = 0;

    }

    public MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate f)
    {

        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = pL;
        puntosVisitante = pV;
        fecha = f;

    }

    //GETTERS
    public String getNombreLocal() {

        return nombreLocal;

    }

    public String getNombreVisitante() {

        return nombreVisitante;

    }

    public int getPuntosLocal() {

        return puntosLocal;

    }

    public int getPuntosVisitante() {

        return puntosVisitante;

    }

    public LocalDate getFecha() {

        return fecha;

    }

    @Override
    public String toString() {

        String aux;
        
        if(puntosLocal > puntosVisitante){
            
            aux = "Va ganando el equipo local " + nombreLocal + "!";
            
        }else if(puntosLocal < puntosVisitante){
            
            aux = "Va ganando el equipo visitante " + nombreVisitante + "!";

        }else{
            
            aux = "El partido va empate!";
        }
        
        return aux;

    }

    //SETTERS
    public void setNombreLocal(String nL) {

        nombreLocal = nL;

    }
    

    public void setNombreVisitante(String nV) {

        nombreVisitante = nV;

    }

    public void setPuntosLocal(int pL) {

        puntosLocal = pL;

    }

    public void setPuntosVisitante(int pV) {

        puntosVisitante = pV;

    }

    public void setFecha(LocalDate f) {

        fecha = f;

    }
    
    public void añadirCanasta(char equipo, int puntos){
        
        if (equipo == 'L' && puntos == 1 && puntos == 2 && puntos == 3){
            
            puntosLocal = puntosLocal + puntos;
                    
        }else if (equipo == 'V' && puntos == 1 && puntos == 2 && puntos == 3){
            
            puntosVisitante = puntosVisitante + puntos;
                    
        }
    }
    
    public void reset(){
        
        puntosVisitante = 0;
        puntosLocal = 0;
        
    }
    
    public void guardar (String ruta) throws IOException{
        
        try{
            
        File f = new File(ruta);
        
        f.createNewFile();
        PrintWriter p = new PrintWriter(f);
        
        p.println(nombreLocal);
        p.println(puntosLocal);
        p.println(nombreVisitante);
        p.println(puntosVisitante);
        
        p.close();
        
        }catch (IOException e){
            
            throw e;
        }
        
    }

}
