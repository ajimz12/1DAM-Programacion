


package tema5.ejercicio31;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class EfectoMayusculas extends EfectoEspecial{
    
    EfectoMayusculas(String n) {
        
        super(n);
    }

    @Override
    public String aplicarEfecto(String frase) {
        
        return "Creado el efecto especial " + this.getNombre() 
                + frase.toUpperCase();
        
    }
    
  
    
}
