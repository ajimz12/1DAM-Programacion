package tema5.ejercicio05;

/**
 *
 * @author Alvaro <alvarojimgil12@gmail.com>
 */

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Hotel extends Edificio{
    
    //ATRIBUTOS
    private List<String> clientes = new ArrayList<String>();
    private int maximo;
    
    /**
     * Constructor con par?metros
     * 
     * @param d direccion del hotel
     * @param np numero de plantas del hotel
     * @param m capacidad maxima del hotel
     * @throws IllegalStateException En caso de que el maximo se introduzca en 
     * valores negativos
     */
    public Hotel(String d, int np, int m) throws IllegalStateException{
        
        super(d,np);
        
        if(m<0){
            
            throw new IllegalStateException("La cantidad m?xima se encuentra"
                    + "en valores negativos");
            
        }else{
            
            this.maximo = m;
            
        }
        
    }
    
    /**
     * Se a?ade cliente al hotel
     * 
     * @param c Cliente que se va a a?adir al hotel
     * @throws IllegalStateException En caso de superar maxima capacidad de clientes
     */
    public void a?adirCliente(String c) throws IllegalStateException{
        
        if(clientes.size()>=this.maximo){
            
            throw new IllegalStateException("Hay mas clientes de el maximo"
                    + "permitido");
            
        }else{
            
            clientes.add(c);
            
        } 
    }
    
    /**
     * Retira una persona especifica de la lista de clientes del hotel
     * 
     * @param c Cliente del hotel
     * @throws NoSuchElementException En caso de que no se encuentre registrada
     * tal persona
     */
    public void retirarCliente(String c) throws NoSuchElementException{
        
        if(clientes.contains(c)){
            
            clientes.remove(c);
            
        }else{
            
            throw new NoSuchElementException("La persona no est? en la lista"
                    + "de clientes");
        }
        
        
    }
    
}
    
    
