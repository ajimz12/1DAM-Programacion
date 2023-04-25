


package tema5.ejercicio30;

import tema5.ejercicio26.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */


public class Circulo implements FiguraGeometrica, Centrable{
    
    private Point centro;
    private int Radio;
    private Color color;
    
    
    public Circulo(Point centro, int radio, Color color){
        
        this.Radio = radio;
        this.centro = centro;
        this.color = color;
        
    }

    @Override
    public double getArea() {
        
        return Math.PI * Math.pow(this.Radio, 2);
        
    }

    @Override
    public int getPerimetro() {
        
        return (int)(2*Math.PI * this.Radio);
        
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
        
        return this.centro;
    }
    

}
