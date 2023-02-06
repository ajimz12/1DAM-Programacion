/*
 */
package ejercicio04.Persona;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio01.dni.*;
import java.time.*;


public class Persona {
    
    
    //ATRIBUTOS 
    
    private String nombre;
    private dni dni;
    private double sueldo;
    private LocalDate fechanacimiento;
    
    
    //METODOS
    
    public Persona (String n, dni d, double s, LocalDate fn){
        
        n = nombre;
        d = dni;
        s = sueldo;
        fn = fechanacimiento;
        
    }
    
    public Persona (String n, int numDNI, char letraDNI, double s, 
            LocalDate fn){
        
        
        n = nombre;
        numDNI = dni.getNumDni();
        letraDNI = dni.getLetraDni();
        s = sueldo;
        fn = fechanacimiento;
        
    }
    
    public Persona(String n, dni d){
        
        n = nombre;
        d = dni;
        sueldo = 900;
        fechanacimiento = LocalDate.of
        (2003, Month.FEBRUARY, 6);
    }
            
    public Persona(String n, int numDNI, char letraDNI){
        
        n = nombre;
        numDNI = dni.getNumDni();
        letraDNI = dni.getLetraDni();
        sueldo = 900;
        
    }
    
    //GETTERS
    
    public String getNombre(){
        
        return nombre;
        
    }
    
    public dni getDNI(){
        
        return dni;
        
    }
    
    public double getSueldo(){
        
        return sueldo;
        
    }
    
    public LocalDate getFechaNacimiento(){
        
        return fechanacimiento;
        
    }
    
    //SETTERS
    
    public void setNombre(String n){
        
        nombre = n;
        
    }
    
    public void setDNI(dni dni){
        
        dni = dni;
        
    }
    
    public void setSueldo(double s){
        
        sueldo = s;
        
    }
    
    public void setFechaNacimiento(LocalDate fn){
        
        fechanacimiento = fn;
        
    }
    
            
}
