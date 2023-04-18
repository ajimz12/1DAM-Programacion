


package tema5.ejercicio24;

import tema5.ejercicio23.*;

/**
 *
 * @author álvaro <alvarojimgil12@gmail.com>
 */
public class Leon extends Animal{
    
    public Leon(String n, int peso){
        
        super(n,peso);
        
    }

    @Override
    public void emitirSonido(){
        
        System.out.println("Rugido de Leon");

    };

}
