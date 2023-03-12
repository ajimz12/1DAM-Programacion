package tema5.ejercicio08;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
import java.util.Map;

public class Programador extends TrabajadorTecleante {

    //ATRIBUTOS
    private Map<String, String> lenguajes;

    /**
     * Constructor con parámetros
     * 
     * @param n Nombre de programador
     * @param s Sueldo de programador
     * @param ndni Numero del dni
     * @param ldni Letra del dni
     * @param ppm Pulsaciones por minuto al teclear
     */
    
    public Programador(String n, int s, int ndni, char ldni, int ppm) {

        super(n, s, ndni, ldni, ppm);
    }
    
    /**
     * Se aprende y añade un nuevo lenguaje
     * 
     * @param lenguaje Lenguaje que se va a aprender
     * @param holaMundo Código del Hola Mundo
     */
    
    public void aprenderLenguaje(String lenguaje, String holaMundo){
        
        this.lenguajes.put(lenguaje, holaMundo);
        
    }
    
    /**
     * 
     * @param lenguaje Lenguaje en el que se va a programar
     * @return Código del hola mundo
     * @throws IllegalStateException Si el lenguaje no se encuentra en la lista
     */
    
    public String programarHolaMundo(String lenguaje) throws IllegalStateException{
        
        if(this.lenguajes.containsKey(lenguaje)){
            
            return this.lenguajes.get(lenguaje);
            
        }else{
            
            throw new IllegalStateException("Lenguaje no aprendido");
            
        }
        
    }

}
