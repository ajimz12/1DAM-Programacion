


package tema5.ejercicio31;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class EfectoInverso extends EfectoEspecial implements Simetrico{
    
    EfectoInverso(String n) {
        
        super(n);
    }

    @Override
    public String aplicarEfecto(String frase) {
        
        StringBuilder sb = new StringBuilder(frase);
        
        return "Creado el efecto especial " + this.getNombre() 
                + sb.reverse().toString();
   
    }
    
   
}
