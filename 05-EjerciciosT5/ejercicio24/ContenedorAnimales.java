


package tema5.ejercicio24;

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
        
        boolean aux;
        
        if(this.comprobarDisponibilidadPlaza(a)){
            
            this.animales.add(a);
            aux = true;

        }else{
            
            aux = false;
            
        }
       
        return aux;
    }
    
    public boolean retirar(Animal a){
        
        boolean aux;
        
        if(this.animales.contains(a)){
            
            this.animales.remove(a);
            aux = true;
 
        }else{
            
            aux = false; 
        }
        
        return aux;
        
    }
    
    public int getPesoActual(){
        
        int pesoTotal = 0;
        
        for(Animal a : animales){
            
            pesoTotal += a.getPeso();
            
        }
        
        return pesoTotal;
    }
    
    public int getNumeroAnimales(){
        
        return this.animales.size();
        
    }
    
    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);

}
