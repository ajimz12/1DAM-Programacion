/*
 */
package ejercicio04.Persona;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import ejercicio01.dni.*;
import ejercicio07.CuentaCorriente.CuentaCorriente;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Persona {
    
    
    //ATRIBUTOS 
    
    private String nombre;
    private dni dni;
    private int sueldo;
    private LocalDate fechanacimiento;
    private CuentaCorriente cuenta;
    
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate ahora = LocalDate.now();
    Period periodo = Period.between(fechanacimiento, ahora);
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
        (2003, 3, 6);
        
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
    
    public boolean esMayorEdad(boolean mayoredad){
        
       if(periodo.getYears() >= 18){
           
           mayoredad = true;
           
       }else{
            
           mayoredad = false;
           
       }
       
       return mayoredad;
        
    }
    
    public boolean tieneDinero(boolean td){
        
        if (sueldo>0){
            
            td = true;
            
        }else{
            
            td = false;
            
        }
        
        return td;
        
    }
    
    public boolean esMileurista(boolean mileurista){
        
        if(sueldo < 1200){
            
            mileurista = true;
            
        }else{
            
            mileurista = false;
        }
        
        return mileurista;
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
