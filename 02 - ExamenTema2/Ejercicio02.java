package examt2.pkg3_aj;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import bpc.daw.objetos.*;
import java.util.*;

public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        

       int contraseña = 91222;
       
       boolean repetir = true;
               
       TarjetaCredito t = new TarjetaCredito(100,contraseña);
       
        
        System.out.println("Introduzca la contraseña: ");
        int c = new Scanner(System.in).nextInt();
        
        if (c == contraseña){
            
            try{
                
              System.out.println("Has marcado la contraseña: "+c);
              
              System.out.println("Contraseña aceptada con saldo inicial: "
                    +t.getSaldo(c));
              
              System.out.println("Tarjeta leida con saldo: "+t.getSaldo(c));
              
              while(repetir){
                  
                    System.out.println("Indique la operación a realizar: "
                        + "Ingresar(I), Retirar(R), Terminar(T), "
                        + "Saldo actual(S): ");
                    
              char r = new Scanner(System.in).next().charAt(0);

                    
              
              switch(r){
                  
                  case 'I':
                      
                      System.out.println("Indique el importe con el que quiere"
                              + " operar: ");
                      int ingreso = new Scanner(System.in).nextInt();
                      
                      if(ingreso < 0){
                          
                          System.out.println("Has indicado una cantidad en "
                                  + "numeros negativos, no es posible realizar "
                                  + "la operacion :(");
                          
                      }else{
                      
                      t.ingresarDinero(ingreso);
                      
                      System.out.println("Se ha ingresado una cantidad de "
                              + ""+ingreso+" euros");
                      }
                      
                      break;

                      
                  case 'R':
                      
                      System.out.println("Indique el importe con el que quiere"
                              + " operar: ");
                      int retiro = new Scanner(System.in).nextInt();                  
                     
                      if(retiro > t.getSaldo(c)){
                          
                          System.out.println("Saldo insuficiente D:");
                       
                      }else{
                          
                          t.sacarDinero(retiro, c);
                          System.out.println("Se ha retirado una cantidad de "
                                  + ""+retiro+" euros");
                          
                      }
                      
                      
                     
                      break;

                       
                  case 'S': 
                      
                      System.out.println("En estos momentos el saldo de la "
                              + "tarjeta es: ");
                      
                      System.out.println("Saldo actual: "+t.getSaldo(c)+" "
                              + "euros");
                      
                      break;

                      
                  case 'T':
                      
                      System.out.println("Ha pulsado terminar de operar en el "
                              + "cajero.");
                      System.out.println("Gracias por usarme, puedes recoger "
                              + "tu tarjeta :)");
                      
                    repetir = false;
                    
                    break;
                    
                    default:
                        System.out.println("No se ha introducido un operador"
                                + " válido");
                      
              }
                    
                  
              }
              
              
                
                
            }catch (Exception e){
                
                System.out.println("Error al realizar la operación");    
            }
           
            
        }else{
            
            System.out.println("Contraseña Incorrecta");
            
        
        }

    }

}
