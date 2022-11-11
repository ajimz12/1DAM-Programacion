/*
 */
package ejercicio09string;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Ejercicio09String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String p1 = "hola";
        String p2 = "ahol";
        
        if(p1.length()==p2.length()){
 
  for (int i = 0 ;i  < p1.length();i++){
 
    if(!p2.contains(String.valueOf(p1.charAt(i)))){
         
      System.out.println("No es un anagrama");
      
      return;
    }
  }
 
  System.out.println("Es un anagrama");
}
        
else{
            
  System.out.println("La cantidad de caracteres es mayor o menor en cada una de las cadenas");
}
        
}
    
}