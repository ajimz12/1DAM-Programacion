


package tema5.ejercicio10;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */

import java.time.Instant;
import java.time.Duration;

public class Adivinanza{
    
    //ATRIBUTOS
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;
    private Instant fin;
    
    /**
     * Constructor con parámetros
     * 
     * @param e Enunciado de la adivinanza
     * @param rc Respuesta correcta de la adivinanza
     */
    public Adivinanza(String e, String rc){
        
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        
    }
    
    /**
     * Obtiene el enunciado de la adivinanza
     * 
     * @return Enunciado de la adivinanza
     */
    public String getEnunciado(){
        
        this.inicio = Instant.now();
        return this.enunciado;
    }
    
    /**
     * Se introduce la respuesta a la adivinanza y se comprueba
     * 
     * @param respuesta Respuesta para adivinanza
     * @throws AdivinanzaException En caso de fallar la respuesta o superar 
     * tiempo max
     */
    public void comprobar(String respuesta) throws AdivinanzaException{
       
        
        this.fin = Instant.now();
        
        if(respuesta!=this.respuestaCorrecta){
            
            throw new AdivinanzaIncorrectaException(
                    "Incorrecto | Respuesta Correcta: "+this.respuestaCorrecta);
        }
        
        if(this.inicio.compareTo(this.fin)>30){
            
            throw new TiempoSuperadoException("Tiempo Superado");
        }
        
}
    
}
