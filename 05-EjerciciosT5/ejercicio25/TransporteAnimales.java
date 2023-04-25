


package tema5.ejercicio25;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class TransporteAnimales extends Jaula{
    
    public TransporteAnimales(){
        
        super(6,500);
        
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        
        int nleones = 0;
        int ntigres = 0;
        
        this.animales.add(a);
        for(Animal l : this.animales){
            
            if (l instanceof Leon){
                
                
                
            }
            
        }
        
          if(animales.size() < 6 && getPesoActual()
                + a.getPeso() <= 500){
            
           return true;

        }else{
            
            return false;
        }

    }
    
    
    
    
    

}
