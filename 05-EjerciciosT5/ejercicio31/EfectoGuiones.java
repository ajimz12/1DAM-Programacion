
package tema5.ejercicio31;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class EfectoGuiones extends EfectoEspecial{
    
     EfectoGuiones(String n) {
        
        super(n);
    }

    @Override
    public String aplicarEfecto(String frase) {
        
        return "Creado el efecto especial " + this.getNombre() 
                + frase.replace(' ', '-');
        
    }
    
   

    

}
