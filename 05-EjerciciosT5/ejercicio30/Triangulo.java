


package tema5.ejercicio30;

import tema5.ejercicio26.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Triangulo implements Apoyable{
    
   private Point[] vertices;
   
   public Triangulo(Point v1,Point v2,Point v3){
       
       Point [] puntos={v1,v2,v3};
       this.vertices=puntos;
   }
   
   private double getLongitud(Point a,Point b){
       
       return a.distance(b);
       
   }
   
   public int getLongitudBase(){
       
       Point b=this.vertices[2];
        Point c=this.vertices[3];
        return (int)this.getLongitud(b, c);
        
    }
    public int getLongitudAltura(){
        
        Point a=this.vertices[1];
        Point c=this.vertices[3];
        double catetoX=this.getLongitudBase()/2;
        double hipotenusa=this.getLongitud( a, c);
        
        double altura=Math.sqrt
            (Math.pow(hipotenusa, 2)-Math.pow(catetoX, 2));
        return (int)altura;
    }
    
    
    public boolean esHorizontal(){
        
        if (this.getLongitudBase()>this.getLongitudAltura()){
            return true;
        }
        else{
            return false;
        }       
    }
    
    
    public boolean esVertical(){
        
        if (this.getLongitudBase()<this.getLongitudAltura()){
            return true;
        }
        else{
            return false;
        } 
    }
    
    public double getArea(){
        
        return (this.getLongitudBase()*this.getLongitudAltura())/2;
    }
    public int getPerimetro(){
        
        Point a=this.vertices[1];
        Point b=this.vertices[2];
        Point c=this.vertices[3];
        
        double perimetro=this.getLongitud(a, b)+
                this.getLongitud(b, c)+this.getLongitud(c, a);
        return (int)perimetro;
    }
    public void dibujar(Graphics g){
        
        g.create();
    }
    public Color getColor(){
        
        return this.getColor();
    }
    
    
    public Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda){
        
        Cuadrado cr=new Cuadrado(esquinaSuperiorIzquierda,(int)this.getArea(),
                this.getColor());
        return cr;
        
    };
    
}
