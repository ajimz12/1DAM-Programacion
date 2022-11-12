

/**
 *
 * @author Alvaro
 */
import java.util.Scanner;

public class Ejercicio03String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String p;
        String p2;
        String p3;
        String p4;
        String p5;
        String p6;
        
        
            System.out.println("Introduce una palabra: ");
             p = new Scanner(System.in).nextLine();
        
        
            if (p.endsWith("a")){
                
                
             p2 = p.substring(0, p.length()-1);
            System.out.println(p2+"us");
            
            
            }
            
            else {
                
                if(p.endsWith("e"))
                    
                {
                    
                p3=p.substring(0, p.length()-1);
                System.out.println(p3 + "us");
                
                }
                              
                else
                {
                    
                if(p.endsWith("i")){
                    
                    p4 = p.substring(0, p.length()-1);
                    System.out.println(p4 + "us");
                    
                    } 
                else {
                    
                    
                if(p.endsWith("o")) {
                    
                    p5=p.substring(0, p.length()-1);
                    System.out.println(p5+"us");
                    
                    } 
                    
                else{
                    
                if(p.endsWith("u")) {
                    
                p6=p.substring(0, p.length()-1);
                System.out.println(p6 + "us"); } 
                
                else{
                    
                if(p.endsWith("A")) {
                    
                p6=p.substring(0, p.length()-1);
                System.out.println(p6 + "us"); }
                
                else{
                    
                if(p.endsWith("E")) {
                    
                p6=p.substring(0, p.length()-1);
                System.out.println(p6 + "us"); }
                
                else{
                    
                if(p.endsWith("I")) {
                    
                p6=p.substring(0, p.length()-1);
                System.out.println(p6 + "US"); }
                
                else{
                    
                if(p.endsWith("US")) {
                    
                p6=p.substring(0, p.length()-1);
                System.out.println(p6 + "US"); }
                
                else{
                    
                if(p.endsWith("US")) {
                    
                p6=p.substring(0, p.length()-1);
                System.out.println(p6 + "US"); }
                
                else {
                    
                System.out.println(p + "us");
                
                
           }
         }
       } 
                }
      }

    }
        

        
    
  
    
    

