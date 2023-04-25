


package tema5.ejercicio25;

import tema5.ejercicio24.*;
import java.util.Set;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public abstract class ContenedorAnimales{
    
    //ATRIBUTO
    protected Set<Animal> animales;
    
    public ContenedorAnimales(){
        
    }
    
    public boolean añadir(Animal a){
     
        if(comprobarDisponibilidadPlaza(a)){
            
            animales.add(a);
            a.setEncerrado(true);
            return true;
            
        } else {
            
            return false;
        }
            
        }
   
    
    public boolean retirar(Animal a){
        
        boolean aux;
        
        if(this.animales.contains(a)){
            
            this.animales.remove(a);
            return true;
 
        }else{
            
            return false; 
        }
      
    }
    
    public int getPesoActual(){
        
        int pesoActual = 0;
 
        for(Animal a : animales){
            
         pesoActual = a.getPeso();
           
        }
        
        return pesoActual;

    }
   
    
    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);

}
