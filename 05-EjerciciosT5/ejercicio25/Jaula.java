


package tema5.ejercicio25;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Jaula extends ContenedorAnimales{
    
    private int capacidadMaxima;
    private int pesoMaximo;
    
    
    public Jaula(int cm, int pm){
        
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
  
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }
    
   

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        
        
        if(animales.size() < this.capacidadMaxima && getPesoActual()
                + a.getPeso() <= this.pesoMaximo){
            
           return true;

        }else{
            
            return false;
        }
  
    }
    
    
    

}
