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
        
    };
    
     public dni(String dni2){
     
     dni = dni2;
     
     };
     
     
   //GETTERS
     
     public int getNumDni(){
         
         return numero;
     };
     
     public char getLetraDni(){
         
        return letra; 
         
     };
     
     public String getDni(){
         
       return dni;  
         
     };
     
    
    
}
