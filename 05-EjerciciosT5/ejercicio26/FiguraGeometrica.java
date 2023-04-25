


package tema5.ejercicio26;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public interface FiguraGeometrica extends Coloreable{
    
    public double getArea();
    
    public int getPerimetro();
    
    public void dibujar(Graphics g);
    
    public default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda){
        
        double area = this.getArea();
        double lado = Math.sqrt(area);
        
        Cuadrado c = new Cuadrado(esquinaSuperiorIzquierda,(int)lado,this.getColor());
        
        return c;
        
    };
    

}
