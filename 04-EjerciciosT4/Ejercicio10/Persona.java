/*
 */
package ejercicio04.Persona;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio01.dni.*;
import ejercicio07.CuentaCorriente.CuentaCorriente;
import java.time.*;


public class Persona {
    
    
    //ATRIBUTOS 
    
    private String nombre;
    private dni dni;
    private int sueldo;
    private LocalDate fechanacimiento;
    private CuentaCorriente cuenta;
    
    int random = (int) Math.random()*1000;
    
    CuentaCorriente c = new CuentaCorriente(random,0);

    
    
    //METODOS
    
    public Persona (String n, dni d, double s, LocalDate fn){
        
        n = nombre;
        d = dni;
        s = sueldo;
        fn = fechanacimiento;
        
        cuenta = c;
        
        
    }
    
    public Persona (String n, int numDNI, char letraDNI, double s, 
            LocalDate fn){
        
        
        n = nombre;
        dni = new dni(numDNI,letraDNI);
        s = sueldo;
        fn = fechanacimiento;
        
        cuenta = c;

        
    }
    
    public Persona(String n, dni d){
        
        n = nombre;
        d = dni;
        sueldo = 900;
        fechanacimiento = LocalDate.of
        (2003, Month.FEBRUARY, 6);
        
        cuenta = c;

    }
            
    public Persona(String n, int numDNI, char letraDNI){
        
        n = nombre;
        dni = new dni(numDNI,letraDNI);
        sueldo = 900;
        
        cuenta = c;

        
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
    
    public void setSueldo(int s){
        
        sueldo = s;
        
    }
    
    public void setFechaNacimiento(LocalDate fn){
        
        fechanacimiento = fn;
        
    }
    
    public void aumentarSueldo(int porcentaje){
        
        sueldo = sueldo + ((porcentaje/100)*sueldo);
        
    }
    
    public void cobrarSueldo(){
        
        
        c.añadirDinero(sueldo);
        
    }
    
            
}
