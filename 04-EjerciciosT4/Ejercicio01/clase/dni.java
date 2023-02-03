/*
 */
package ejercicio01.dni;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class dni {
    
    //ATRIBUTOS
    
    private int numero;
    private char letra;
    private String dni;
    
    //METODOS
    
    public dni(int n,char l){
        
      numero = n;
      letra = l;
        
    }
    
     public dni(String dni2){
    
       letra = dni2.charAt(7);
       numero = Integer.parseInt(dni2.substring(0, 6)); 
         
    }
     
     
   //GETTERS
     
     public int getNumDni(){
         
         return numero;
     }
     
     public char getLetraDni(){
         
        return letra; 
         
     }
     
     //SETTERS
    
    public void setNum(int n){
    
        numero = n;
    }
    
    public void setLetra(char l){
    
        letra = l;
    }
     
    
    
}
