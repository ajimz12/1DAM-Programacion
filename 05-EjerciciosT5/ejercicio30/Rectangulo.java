


package tema5.ejercicio30;

import tema5.ejercicio26.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Rectangulo implements Apoyable, Centrable{
    
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinainferiorDerecha;
    private Color color;
    
    
    public Rectangulo(Point esi, Point eid, Color c){
        
        this.color = c;
        this.esquinaSuperiorIzquierda = esi;
        this.esquinainferiorDerecha = eid;
        
    }

    @Override
    public int getLongitudBase() {
        
        return esquinaSuperiorIzquierda.x - esquinainferiorDerecha.x;
        
    }

    @Override
    public int getLongitudAltura() {
        
       return esquinaSuperiorIzquierda.y - esquinainferiorDerecha.y;

    }

    @Override
    public double getArea() {
        
        return this.getLongitudBase() * this.getLongitudAltura();
        
    }

    @Override
    public int getPerimetro() {
        
        return (this.getLongitudBase() * 2) + (this.getLongitudAltura() * 2);
        
    }

    @Override
    public void dibujar(Graphics g) {
        
        g.create();
    }

    @Override
    public Color getColor() {
        
        return this.color;
    }

    @Override
    public Point getCentro() {
        
        Point p = new Point(((this.esquinaSuperiorIzquierda.x +
                this.esquinainferiorDerecha.x)/2),
                ((this.esquinaSuperiorIzquierda.y 
                        + this.esquinainferiorDerecha.y)/2));
        
        
        return p;
        
        
    }

    
}
