
package ejercicio02.caja;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */

public class caja {
    
    //ATRIBUTOS
    
    private boolean abierto;
    private String mensaje;
    private String cadenatexto = "La caja est� cerrada";
    private String cadenatexto2 = "La caja est� abierta";

    
    //METODOS
    
    public caja (String m){
        
        mensaje = m;
        
    };
    
    public caja (boolean a , String m){
        
        abierto = a;
        mensaje = m;
        
    };
    
    public caja (){
        
        abierto = false;
        mensaje = "Viva el Tema 7";
        
    };
    
    
    //GETTERS
    
    public String getMensajeCaja (){
        
        
      if(abierto == true){
          
      return mensaje; 
      
      }else{
      
          return cadenatexto;
      }
      
        
    };
    
    public String getEstadoCaja(){
      
        if(abierto == true){
            
            return cadenatexto2;
            
        }else{
            
            return cadenatexto;
            
        }
        
    };
    
    //SETTERS
    
    public void setMensaje(String m){
        
        if(abierto){
            
               this.mensaje = m;

        }        
    }
    
    public void pasarMayusculas(){
        
        this.mensaje.toUpperCase();
        
    }
    
}
