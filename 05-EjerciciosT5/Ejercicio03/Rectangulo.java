
package tema5.ejercicio03;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Rectangulo {
    
    //ATRIBUTOS
    private int base;
    private int altura;
    private int area;
    
    /**
     * Constructor con parametros
     * 
     * @param b Base del rectangulo
     * @param a Altura del rectangulo
     */
    
    public Rectangulo (int b, int a){
        
        this.base = b;
        this.altura = a;
        
    }
    
    /**
     * Proporcionar base del rectangulo
     * 
     * @param b Base del rectangulo
     */
    
    public void setBase(int b){
        
        this.base = b;
    }
    
    /**
     * Proporcionar altura del rectangulo
     * 
     * @param a Area del rectangulo
     */
    
    public void setAltura(int a){
        
        this.altura =  a;
        
    }
    
    /**
     * Obtener Area del rectangulo mediante su formula
     * 
     * @return Area del rectangulo
     */
    
    public int getArea(){
        
        int area = this.altura * this.base;
        
        return area;
        
    }
    
    /**
     * Obtener base del rectangulo
     * 
     * @return Base del rectangulo
     */
    
    public int getBase(){
        
        return this.base;
    }
    
    /**
     * 
     * Obtener altura del rectangulo
     * 
     * @return Altura del rectangulo
     */
    
    public int getAltura(){
        
        return this.altura;
    }

}
