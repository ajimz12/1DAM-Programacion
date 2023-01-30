/*
 */
package crearclase.animales;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Elefante {
    
    private String nombre;
    private int edad;
    private int longitudtrompa;
    private boolean agresivo;
    
    
    //METODOS
    
    //por defecto
    
    public Elefante(){}
    ;
    
    //con parametros
    
    public Elefante(String n, int e, int longtr, boolean agr){
        
        nombre = n;
        edad = e;
        agresivo = agr;
        longitudtrompa = longtr;
          
    };
    
    //SETTERS
    public void setNombre(String n) {

        nombre = n;

    };
    
    public void setHambriento(boolean agr){
        
       agresivo = agr;
        
    };
    
    //GETTERS
    public String getNombre() {

        return nombre;

    };
    
    public boolean getAgresivo(){
        
        return agresivo;
        
    };
}
