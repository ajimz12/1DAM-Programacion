package tema5.ejercicio14;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.Random;
import java.lang.StringBuilder;


public class GeneradorContraseñas{

    //ATRIBUTOS
    private Random random;



    public GeneradorContraseñas() {

        Random r = new Random();

    }

    
    public GeneradorContraseñas(Random r){
        
        this.random = r;
        
    }
    
    /**
     * Obtiene una contraseña de la longitud indicada
     * 
     * 
     * @param longitud Longitud de la contraseña
     * @return 
     */
    public String generarContraseña(int longitud){
        
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        char ch;

        
        int v = r.nextInt(2)+0;
        
        int v2;
        int v3;
        int v4;
        
        
        for(int i = 0; i < longitud; i++){
        
        if(v==0){
            
            v2 = r.nextInt(48) + 57;
            ch = (char)v2;
            sb.append(ch);
            
        }
        
        if(v==1){
            
            v3 = r.nextInt(65) + 90;
            ch = (char)v3;
            sb.append(ch);
             
            

        }
        
        if(v==2){
            
           v4 = r.nextInt(97) + 122;
           ch = (char)v4;
            sb.append(ch);
           

        }
       
        
      }
        
        return sb.toString();
    
    
    }
    
    /**
     * Obtiene una contraseña de 8 caracteres
     * 
     * @return Contraseña de 8 caracteres
     */
    public String generarContraseña(){
        
       return generarContraseña(8); 
       
        
    }
    
    
}
