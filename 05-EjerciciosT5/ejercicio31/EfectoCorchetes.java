


package tema5.ejercicio31;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class EfectoCorchetes extends EfectoEspecial implements Simetrico{
    
     EfectoCorchetes(String n) {
        
        super(n);
    }

    @Override
    public String aplicarEfecto(String frase) {
        
        if(frase.startsWith("[") && frase.endsWith("]")){
            
            return "Creado el efecto especial " + this.getNombre() 
                + frase.substring(1,frase.length()-1);
            
        }else{
            
            return "Creado el efecto especial " + this.getNombre() 
                + "[" + frase + "]";
            
        }
        
        
    }
   
     

    

}
