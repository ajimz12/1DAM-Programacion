package palabrasreservadasjava;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.util.*;
import java.lang.*;

public class PalabrasReservadasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        ArrayList<String> pr = new ArrayList<>();
        
        pr.add("abstract");
        pr.add("assert");
        pr.add("boolean");
        pr.add("break");
        pr.add("byte");
        pr.add("case");    
        pr.add("catch");  
        pr.add("char");    
        pr.add("class");    
        pr.add("const");    
        pr.add("continue");    
        pr.add("default");    
        pr.add("do");    
        pr.add("double");    
        pr.add("else");    
        pr.add("enum");    
        pr.add("extends");    
        pr.add("final");    
        pr.add("finally");    
        pr.add("abstract");    
        pr.add("float");    
        pr.add("for");    
        pr.add("goto");    
        pr.add("if");    
        pr.add("implements");    
        pr.add("import");    
        pr.add("instanceof");    
        pr.add("int");    
        pr.add("interface");    
        pr.add("long");    
        pr.add("native");    
        pr.add("new");    
        pr.add("package");    
        pr.add("private");    
        pr.add("protected");    
        pr.add("public");    
        pr.add("return");    
        pr.add("short");    
        pr.add("static");    
        pr.add("stricfp");    
        pr.add("super");    
        pr.add("switch");    
        pr.add("synchronized");    
        pr.add("this");    
        pr.add("throw");    
        pr.add("thows");    
        pr.add("transient");    
        pr.add("try");    
        pr.add("void");    
        pr.add("volatile");   
        pr.add("while");    
      




        
        
        ArrayList<String> acertadas = new ArrayList<>();

        int tamañoacertadas = acertadas.size();
        tamañoacertadas=0;
        
        boolean repetir = true;
    

        while(repetir){
        
        System.out.println("Introduce la palabra reservada: ");
        String p = new Scanner(System.in).nextLine();
        
        if (pr.contains (p)){
            
        tamañoacertadas++;
        System.out.println(p);
                  
        }
        
        else{
            
            System.out.println("Esta no es una palabra reservada de java, introduce otra: ");
            p = new Scanner(System.in).nextLine();}
        
        
        if (tamañoacertadas == 50) {
            
            repetir = false;
            System.out.println("Felicidades, has acertado todas las palabras! :D");
            
        }
        
        

            
        }
        
       
        
        
       
        
        }
        }

    


