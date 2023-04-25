


package tema5.ejercicio31;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public abstract class EfectoEspecial {
    
    //ATRIBUTOS
    public static List<EfectoEspecial> EFECTOS = new ArrayList<EfectoEspecial>();
    private String nombre;
    
    
    public EfectoEspecial(String n){
        
        this.nombre = n;
        
    }
    
    public String getNombre(){
        
        return this.nombre;
        
    }
    
    public abstract String aplicarEfecto(String frase);

    
    
    }
