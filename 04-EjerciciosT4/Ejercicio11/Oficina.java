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
    
    //METODOS
    
    //POR DEFECTO
    
    public Oficina(){
    
    this.trabajadores = new ArrayList<Persona>();
    this.nombre = "Industrias DAW";
    
    trabajadores.add(new Persona("Ana Diaz Diaz",
                33333333, 'P', 1200, 
                LocalDate.of(1985,05,21)));
        trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000, 
                LocalDate.of(1985,05,21)));
        trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900, 
                LocalDate.of(1985,05,21)));
    }
    
    //
    
    public Oficina(String n){
        
        this.nombre = n;
        trabajadores = null;
        
    }
    
    public Oficina(String n, int t){
    
       this.nombre = n;
       
       if(t <= 0 || t > 3){
           
       this.trabajadores = new ArrayList<Persona>();
    
       }else if(t == 1){
           
        this.trabajadores.add (new Persona("Antonio Pérez Pérez", 11111111,
                'H',900,LocalDate.of(2000, Month.FEBRUARY, 28)));
           
       }else if(t==2){
           
        this.trabajadores.add (new Persona("Luis López López", 22222222,
                'J',1000,LocalDate.of(1995, Month.SEPTEMBER, 10)));
        this.trabajadores.add (new Persona("Antonio Pérez Pérez", 11111111,
                'H',900,LocalDate.of(2000, Month.FEBRUARY, 28)));
           
       }else if(t==3){
           
        this.trabajadores.add (new Persona("Luis López López", 22222222,
                'J',1000,LocalDate.of(1995, Month.SEPTEMBER, 10)));
        this.trabajadores.add (new Persona("Antonio Pérez Pérez", 11111111,
                'H',900,LocalDate.of(2000, Month.FEBRUARY, 28)));
        this.trabajadores.add (new Persona("Ana Díaz Díaz", 33333333,
                'P',1200,LocalDate.of(1985, Month.MAY, 21)));  
           
       }
       
    }
       
       
       //GETTERS
       
      public ArrayList<Persona> getTrabajadores(){
        
        return this.trabajadores;
        
    }
       
       @Override
       public String toString(){
           
        String aux = "Nombre: " + this.nombre + "\n";

        
        for(int x=0;x<trabajadores.size();x++) 
            
            aux = String.valueOf(x);        
            return aux;
            
       }
       
       //SETTERS
       
       public void setNombreOficina(String n){
           
           this.nombre = n;
           
           
       }
       
       public void añadirEmpleado(Persona p){
           
           trabajadores.add(p);
           
       }
       
       public void añadirEmpleado(String nombre, int dni, char letra, double sueldo,
               LocalDate fechaNac){
           
           Persona p = new Persona(nombre,dni,letra,sueldo,fechaNac);
           
       }
     
    }
    

