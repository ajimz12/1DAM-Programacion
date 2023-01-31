
package ejercicio02.caja;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

public class caja {
    
    //ATRIBUTOS
    
    private boolean abierto;
    private String mensaje;
    private String cadenatexto = "La caja está cerrada";
    private String cadenatexto2 = "La caja está abierta";

    
    //METODOS
    
    public caja (String m){
        
        mensaje = m;
        
    }
    
    public caja (boolean a , String m){
        
        abierto = a;
        mensaje = m;
        
    }
    
    public caja (){
        
        abierto = false;
        mensaje = "Viva el Tema 7";
        
    }
    
    
    //GETTERS
    
    public String getMensajeCaja (){
        
        
      if(abierto){
          
      return mensaje; 
      
      }else{
      
          return cadenatexto;
      }
      
        
    }
    
    public String getAbierto(){
      
        if(abierto){
            
            return cadenatexto2;
            
        }else{
            
            return cadenatexto;
            
        }
        
    }
    
}
