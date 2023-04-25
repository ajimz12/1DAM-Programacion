


package tema5.ejercicio26;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Cuadrado extends Rectangulo{
    
    
    private int longitudLado;
    
    public Cuadrado(Point esquinaSuperiorIzquierda, int longitudLado, Color color){
        
        super(esquinaSuperiorIzquierda,new Point(esquinaSuperiorIzquierda.x 
                + longitudLado, esquinaSuperiorIzquierda.y - longitudLado),color);
        
        this.longitudLado = longitudLado;
       
        
    }
    
    

}
