/*
 */
package ejercicio06.Punto;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.awt.Point;
import java.awt.Dimension;
import java.lang.Math;



public class Punto {
    
    //ATRIBUTOS
    
    private int x, y;
    
    //METODOS
    
    public Punto(){
        
        this.x = 0;
        this.y = 0;
        Point p = new Point(x,y);

    }
    
    public Punto (int x, int y){
        
        this.x = x;
        this.y = y;
        
        Toolkit t = getDefaultToolkit();
        Dimension d = t.getScreenSize();
        
           if(((x>=0) && ( x<=d.getWidth() ) ) && ((y<=d.getHeight()) && (y>=0))){
               
            this.x = x;
            this.y = y;
                        
        }
           
        else{
               
            this.x = (int)d.getWidth();
            this.y = (int)d.getHeight();
        }
    }
    
    
    public Punto (Punto p){
        
        p.x = p.x/2;
        p.y = p.y/2;
    }
    
    
    public Punto (double angulo, double distancia){
        
        this.x = (int)(distancia * Math.cos(angulo));
        this.y = (int)(distancia * Math.sin(angulo));
        
    }
    
    //GETTERS
    
     public int getX(){
    
        return this.x;
    }
     
    public int getY(){
    
        return this.y;
    }
    
    //SETTERS
    
    public void setx(int a){
    
        this.x = a;
    }
    public void sety(int a){
    
        this.y = a;
    }
    
}
    
    

