package tema5.ejercicio14;

/**
 *
 * @author �lvaro <alvarojimgil12@gmail.com>
 */
import java.util.Random;
import java.lang.StringBuilder;


public class GeneradorContrase�as{

    //ATRIBUTOS
    private Random random;



    public GeneradorContrase�as() {

        Random r = new Random();

    }

    
    public GeneradorContrase�as(Random r){
        
        this.random = r;
        
    }
    
    /**
     * Obtiene una contrase�a de la longitud indicada
     * 
     * 
     * @param longitud Longitud de la contrase�a
     * @return 
     */
    public String generarContrase�a(int longitud){
        
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
     * Obtiene una contrase�a de 8 caracteres
     * 
     * @return Contrase�a de 8 caracteres
     */
    public String generarContrase�a(){
        
       return generarContrase�a(8); 
       
        
    }
    
    
}
