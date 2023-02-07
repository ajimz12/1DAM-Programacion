/*
 */
package ejercicio05.oficina;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio04.Persona.Persona;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

public class Oficina {
    
    //ATRIBUTOS
    
    private String nombre;
    private ArrayList <Persona> trabajadores;
    private int tipo;
    
    //METODOS
    
    //POR DEFECTO
    public Oficina(){
    
    this.trabajadores = new ArrayList<Persona>();
    this.nombre = "Industrias DAW";
    int tipo = 3;
    }
    
    //
    
    public Oficina(String n){
        
        this.nombre = n;
        trabajadores = new ArrayList<Persona>();
        
    }
    
    public Oficina(String n, int t){
    
       this.nombre = n;
       this.tipo = t;
       
       if(tipo <= 0 || tipo > 3){
           
       this.trabajadores = new ArrayList<Persona>();
    
       }else if(tipo == 1){
           
        this.trabajadores.add (new Persona("Antonio Pérez Pérez", 11111111,
                'H',900,LocalDate.of(2000, Month.FEBRUARY, 28)));
           
       }else if(tipo==2){
           
        this.trabajadores.add (new Persona("Luis López López", 22222222,
                'J',1000,LocalDate.of(1995, Month.SEPTEMBER, 10)));
        this.trabajadores.add (new Persona("Antonio Pérez Pérez", 11111111,
                'H',900,LocalDate.of(2000, Month.FEBRUARY, 28)));
           
       }else if(tipo==3){
           
        this.trabajadores.add (new Persona("Luis López López", 22222222,
                'J',1000,LocalDate.of(1995, Month.SEPTEMBER, 10)));
        this.trabajadores.add (new Persona("Antonio Pérez Pérez", 11111111,
                'H',900,LocalDate.of(2000, Month.FEBRUARY, 28)));
        this.trabajadores.add (new Persona("Ana Díaz Díaz", 33333333,
                'P',1200,LocalDate.of(1985, Month.MAY, 21)));  
           
       }
       
    }
       
       
       //GETTERS
       
       public int getTamañoLista(){
           
           return this.trabajadores.size();
           
       }
       
       public int getTipo(){
           
           return this.tipo;
           
       }
       
       public String getNombreOficina(){
           
           return this.nombre;
           
       }
       
       @Override
       public String toString(){
           
        String aux = "";
        
        for(int x=0;x<trabajadores.size();x++) 
            
            aux = String.valueOf(x);        
            return aux;
            
       }
       
       //SETTERS
       
       public void setNombreOficina(String n){
           
           this.nombre = n;
           
           
       }
       
       public void setTipo(int t){
           
          this.tipo = t; 
           
       }
       
       
    }
    

