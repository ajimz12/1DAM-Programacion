package crearclase.animales;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.awt.*;

public class Perro {

    //ATRIBUTOS
    
    private String nombre;
    private int edad;
    private String raza;
    private Point posicion;
    private boolean hambriento;

    //METODOS
    
    //por defecto
    
    public Perro(){}
    ;
    
    //con parametros
    
    public Perro(String n, int e, String r) {

        nombre = n;
        edad = e;
        raza = r;
    }

    ;
    
    public Perro(String n, int e, String r, Point p, boolean h) {

        nombre = n;
        edad = e;
        raza = r;
        posicion = p;
        hambriento = h;

    }

    ;
    
    //SETTERS
    public void setNombre(String n) {

        nombre = n;

    };
    
    public void setHambriento(boolean h){
        
       hambriento = h;
        
    };
    
    //GETTERS
    
    public String getNombre() {

        return nombre;

    };
    
    public boolean getHambriento(){
        
        return hambriento;
        
    };
    
    

}
