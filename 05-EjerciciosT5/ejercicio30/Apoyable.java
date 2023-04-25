


package tema5.ejercicio30;

import tema5.ejercicio26.*;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public interface Apoyable extends FiguraGeometrica{
    
    public int getLongitudBase();
    
    public int getLongitudAltura();
  
    public default boolean esHorizontal(){
        
        if(getLongitudBase() > getLongitudAltura()){
            
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    public default boolean esVertical(){
        
        if(getLongitudBase() < getLongitudAltura()){
            
            return true;
            
        }else{
            
            return false;
            
        }   
        
        
    }
    

}
