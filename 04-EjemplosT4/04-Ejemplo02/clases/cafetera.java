
package clasecafetera.cafetera;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class cafetera {
    
    
    //ATRIBUTOS
    
    private int _capacidadMaxima;
    private int _cantidadActual;
    
    //METODOS
    
    //constructor predeterminado
    
     public cafetera() {

         int ca = 0;
         int cm = 1000;
         
        _capacidadMaxima = cm;
        _cantidadActual = ca;
        
    };
     
    //
     
     
     public cafetera(int cm){
         
         int ca = 0;
         ca = cm;
         
         _capacidadMaxima = cm;
         _cantidadActual = ca;
     };
     
     public cafetera(int ca, int cm){
         
         
         if(ca > cm){
             
             _capacidadMaxima = cm;
             _cantidadActual = cm;
            
         }else{
             
             _capacidadMaxima = cm;
             _cantidadActual = ca;
            
         };
         
     };
     
     //SETTERS
     
     public void setCapacidadMax(int cm){
         
         _capacidadMaxima = cm;
         
     };
     
     public void setCantidadActual(int ca){
         
         _cantidadActual = ca;
         
     };
     
     public void llenarCafetera(){
        
     _cantidadActual = _capacidadMaxima;

     };
     
     
     public void vaciarCafetera(){
       
       _cantidadActual = 0;
                 
     };
     
     public void agregarCafe(int n){
         
         _cantidadActual = _cantidadActual + n;
     
     };
     
     public void servirTaza(int ct){
         
         int taza = 0;
                  
         if(ct <= 300){
             
          taza = ct;

         }else if(ct > 300){
             
           taza = _cantidadActual;
             
         };
         
     };
     
     
     //GETTERS
     
     public int getCantidadActual(){
         
         return _cantidadActual;
         
     };
     
     public int getCapacidadMax(){
         
         return _capacidadMaxima;
         
     };
     
  

}
